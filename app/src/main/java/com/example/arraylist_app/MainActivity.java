package com.example.arraylist_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lsView =findViewById(R.id.myListview);

         ArrayList<String> grocery = new ArrayList<>();
         grocery.add("Oil");
         grocery.add("Apple");
         grocery.add("Pen");
         grocery.add("Cofffe");
         grocery.add("Tea");

        ArrayAdapter<String> adp =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, grocery);
        lsView.setAdapter(adp);
    }
}