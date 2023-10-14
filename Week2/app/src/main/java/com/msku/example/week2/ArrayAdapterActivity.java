package com.msku.example.week2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ListAdapter;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArrayAdapterActivity extends ListActivity {
    static final String[] ANIMALS = new String[]{"cat ,dog,bird,bear"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_array_adapter,ANIMALS));
        ListView listView = getListView();
        listView.setTextFilterEnabled(true);
    }


}