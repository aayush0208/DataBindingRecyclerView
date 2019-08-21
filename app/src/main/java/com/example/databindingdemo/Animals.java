package com.example.databindingdemo;

import android.databinding.BindingAdapter;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;

public class Animals {
    String name,type;
    int image;

    public Animals(String name, String type, int image) {
        this.name = name;
        this.type = type;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @BindingAdapter("android:loadImage")
    public static void loadImage(View view, int image){
        ImageView imageView = (ImageView) view;
        imageView.setImageDrawable(ContextCompat.getDrawable(view.getContext(),image));
    }
}
