package com.example.my_flag;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class GridGallery extends AppCompatActivity {
    GridView MyGridview;
    int flag_photo [] ={R.drawable.greenland ,
                        R.drawable.iran,
                        R.drawable.japan,
                        R.drawable.spain,
                        R.drawable.sudan,
                        R.drawable.sweden,
                        R.drawable.thailand,
                        };

    String flag_name [] ={"greenland" ,
            "iran",
           "japan",
            "spain",
            "sudan",
           "sweden",
            "thailand",
    };



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.layout_grid_gallery));
        MyGridview = findViewById(R.id.GridGallery );
        GalleryAdapter MyGalleryAdapter = new GalleryAdapter(getApplicationContext(),flag_photo,flag_name);
        MyGridview.setAdapter(MyGalleryAdapter);

        MyGridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent fullView = new Intent(getApplicationContext(),FullImageView.class);
                fullView.putExtra("position", i);
                startActivity(fullView);

            }
        });


//        MyGridview = findViewById( R.id.flag_name);
//        GalleryAdapter MynameAdapter = new GalleryAdapter(getApplicationContext(),flag_name);
//        MyGridview.setAdapter(MynameAdapter);

    }
}
