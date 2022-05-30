package com.example.arraylist_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    Button b1;
    EditText t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= findViewById(R.id.button2);
        t1=findViewById(R.id.editTextTextPersonName2);
        ListView lsView =findViewById(R.id.myListview);

         ArrayList<String> grocery = new ArrayList<>();
         grocery.add("Oil");
         grocery.add("Apple");


        ArrayAdapter<String> adp =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, grocery);
        lsView.setAdapter(adp);

        lsView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Toast.makeText(MainActivity.this,  " You selected " + grocery.get(position) , Toast.LENGTH_SHORT).show();
                t1.setText(grocery.get(position));
                adp.notifyDataSetChanged();
            }

        });












        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               grocery.add(t1.getText().toString());

               Toast.makeText(MainActivity.this, t1.getText().toString()+ " is Added", Toast.LENGTH_SHORT).show();
            }
        });
    }
}