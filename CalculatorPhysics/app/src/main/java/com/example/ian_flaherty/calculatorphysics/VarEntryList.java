package com.example.ian_flaherty.calculatorphysics;

import android.app.Activity;
import android.widget.ListView;
import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import android.widget.ArrayAdapter;

public class VarEntryList extends Activity {

    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_var_entry);

        popListView();
    }
    private void popListView(){
        String[] myItems = {"one","two","three"};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listbox,myItems);


        ListView list = (ListView) findViewById(R.id.VarEntryList);
        list.setAdapter(adapter);
    }
}