package com.example.my_flag;

import android.app.NativeActivity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btngrid, btnlist, btngridgallery,btnlistgallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btngrid = findViewById(R.id.grid_item2);
        btnlist = findViewById(R.id.list_item1);
        btngridgallery = findViewById(R.id.grid_item3);
        btnlistgallery = findViewById(R.id.grid_item4);

        btnlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mylist = new Intent(MainActivity.this,My_Listview.class);
                startActivity(mylist);
            }
        });

        btngrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mygrid = new Intent(getApplicationContext(), My_Gridview.class);
                startActivity(mygrid);
            }
        });

        btngridgallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mygridgallery = new Intent(getApplicationContext(), GridGallery.class);
                startActivity(mygridgallery);

            }
        });
        btnlistgallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mylistgallery = new Intent(getApplicationContext(), ListGallery.class);
                startActivity( mylistgallery);

            }
        });

    }
}