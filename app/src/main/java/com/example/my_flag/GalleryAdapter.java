package com.example.my_flag;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GalleryAdapter extends BaseAdapter {
    Context MyContext;
    String Flag_name [];
    int OnepieceImages[];
    LayoutInflater myinflater;
    ImageView myImageView;


    public GalleryAdapter(Context _MyContext, int _OnepieceImages [] ,String _flag_name []){
        this.MyContext = _MyContext;
        this.OnepieceImages = _OnepieceImages;
        this.Flag_name = _flag_name;
        myinflater = (LayoutInflater.from(_MyContext));
    }


    @Override
    public int getCount() {
        return OnepieceImages.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = myinflater.inflate(R.layout.layout_image_scource, null);
        myImageView = view.findViewById(R.id.ImageSource);

        myImageView.setImageResource(OnepieceImages[i]);
        TextView myflag_name =  view.findViewById(R.id.flag_name);
        myflag_name.setText(Flag_name[i]);

        return view;
    }
}
