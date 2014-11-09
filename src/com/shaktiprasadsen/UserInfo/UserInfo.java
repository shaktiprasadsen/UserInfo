package com.shaktiprasadsen.UserInfo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;

import com.shaktiprasadsen.UserInfo.R;

import android.R.anim;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class UserInfo extends Activity {
	
    ArrayList<String> items;
    ArrayAdapter<String> itemsAdapter;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_user_info);

    	ArrayList<User> userList = new ArrayList<User>();
    	ListView listView = (ListView) findViewById(R.id.lvItemList);
    	
    	UsersAdapter uAdapter = new UsersAdapter(this, userList);
    	listView.setAdapter(uAdapter);
    	
    	User newUser1 = new User("Shakti", "Bangalore");
    	uAdapter.add(newUser1);
    	User newUser2 = new User("Soumen", "Kolkata");
    	uAdapter.add(newUser2);
    	User newUser3 = new User("Madhusmita", "Odisha");
    	uAdapter.add(newUser3);
    	User newUser4 = new User("Rohit", "Rajasthan");
    	uAdapter.add(newUser4);
    }
	
	
}
