package com.example.ian_flaherty.calculatorphysics;

import android.app.Activity;
import android.widget.ListView;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.ArrayAdapter;

public class VarEntryList extends Activity {

    private ListView lv;

    public void onCreate(Bundle saveInstanceState) {
        setContentView(R.layout.activity_var_entry);

        lv = (ListView) findViewById(R.id.VarEntryList);

        // Instanciating an array list (you don't need to do this,
        // you already have yours).
        ArrayList<String> your_array_list = new ArrayList<String>();
        your_array_list.add("first var");
        your_array_list.add("second var");

        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                your_array_list );

        lv.setAdapter(arrayAdapter);
    }
}