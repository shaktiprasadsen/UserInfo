package com.shaktiprasadsen.UserInfo;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class UsersAdapter  extends ArrayAdapter<User> {
	public UsersAdapter(Context context, ArrayList<User> users) {
		super(context, 0, users);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		User user = getItem(position);
		
		if(convertView == null) {
			convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
		}
		
		TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
		TextView tvHomeTown = (TextView) convertView.findViewById(R.id.tvHomeTown);
		
		tvName.setText(user.getUserName());
		tvHomeTown.setText(user.getUserHomeTown());
		
		
		return convertView;
		
	}

}
