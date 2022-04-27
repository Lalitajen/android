package com.example.my_flag;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class FullImageView extends AppCompatActivity {
    ImageView Image_fullView;
    int flag_photo [] ={R.drawable.greenland ,
            R.drawable.iran,
            R.drawable.japan,
            R.drawable.spain,
            R.drawable.sudan,
            R.drawable.sweden,
            R.drawable.thailand,
    };

    String flag_name1 [] =
            {
            "greenland" ,
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
        setContentView(R.layout.layout_full_view);
        Image_fullView = findViewById(R.id.FullImageView);

        GalleryAdapter MyGalleryAdapter = new GalleryAdapter(getApplicationContext(),flag_photo,flag_name1);
        Intent myFullView = getIntent();
        int position = myFullView.getExtras().getInt("position");
        Image_fullView.setImageResource(MyGalleryAdapter.OnepieceImages[position]);




    }
}
