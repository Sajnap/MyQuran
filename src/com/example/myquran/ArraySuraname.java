package com.example.myquran;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ArraySuraname extends BaseAdapter 
{
	Context context;
	ArrayList<String> Qname;
	ArrayList<String> QID;

	public ArraySuraname(QuranActivity quranActivity, int simpleListItem1,
			ArrayList<String> qname, ArrayList<String> qID) {
		// TODO Auto-generated constructor stub
		this.context=quranActivity;
		this.Qname=qname;
		this.QID=qID;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return Qname.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		if(convertView == null){
			LayoutInflater mLayoutInflater = LayoutInflater.from(context);
			convertView = mLayoutInflater.inflate(R.layout.sura_name_list, parent, false);
		}
		TextView sid=(TextView)convertView.findViewById(R.id.SId);
		TextView sname=(TextView)convertView.findViewById(R.id.Sname);
		
		sid.setText(QID.get(position));
		sname.setText(Qname.get(position));
		return convertView;
	}

}
