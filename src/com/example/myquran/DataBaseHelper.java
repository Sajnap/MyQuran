package com.example.myquran;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper{

	@SuppressLint("SdCardPath")
	private static final String DB_PATH="/data/data/com.example.myquran/databases/";
	private static final String DB_NAME = "the_holy_quran.sqlite";
	private static final String TABLE_NAME = "quran";
	private static final String TABLE_NAME1 = "suranames";

	private final Context myContext;
	private SQLiteDatabase myDataBase=null;

	public DataBaseHelper(Context context) {
		super(context, DB_NAME, null, 3);
		this.myContext = context;
	}	

	@Override
	public void onCreate(SQLiteDatabase db) {
		System.out.println("DB onCreate");
		myContext.deleteDatabase(DB_NAME);
		if(! checkDataBase()){
			copyDataBase();
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME1);
		db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
		onCreate(db);
	}

	private boolean checkDataBase(){
		SQLiteDatabase checkDB = null;
		try{
			String myPath = DB_PATH + DB_NAME;
			checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
		}catch(SQLiteException e){
			checkDB=null;
		}

		if(checkDB != null){
			checkDB.close();
		}
		return checkDB != null ? true : false;
	}

	private void copyDataBase(){

		try {
			InputStream myInput = myContext.getAssets().open(DB_NAME);
			if(myInput==null){
				System.out.println("Is is Null");
			}

			File fs=new File(DB_PATH + DB_NAME);
			if(!fs.exists()){
				fs.createNewFile();
			}

			OutputStream myOutput = new FileOutputStream(fs);

			byte[] buffer = new byte[1024];
			int length;
			while ((length = myInput.read(buffer))>0){
				myOutput.write(buffer, 0, length);
			}

			myOutput.flush();
			myOutput.close();
			myInput.close();
			System.out.println("Copy Done");
		} catch (Exception e) {
			System.out.println("Copy Not Done");
		}
	}

	public void openDataBase() throws SQLException{
		String myPath = DB_PATH + DB_NAME;
		try{
			myDataBase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);	
		}catch(Exception e){
			copyDataBase();
		}
	}

	@Override
	public synchronized void close() {
		if(myDataBase != null)
			myDataBase.close();
		super.close();
	}

	public Cursor viewdata() {
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor c = db.rawQuery("SELECT * FROM " + TABLE_NAME1 , null);
		//    db.close();
		return c;
	}
}