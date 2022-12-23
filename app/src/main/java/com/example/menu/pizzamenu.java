package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class pizzamenu extends AppCompatActivity {
    private String name;
    private String price;
    private int imageID;

    public static final pizzamenu[] pizzamenus = {
            new pizzamenu (R.drawable.bbqpizza,"BBQ Pizza","Price - 50 Nis"),
            new pizzamenu (R.drawable.vegitablepizza,"Vegitable Pizza","Price - 50 Nis"),
            new pizzamenu (R.drawable.classiccheese,"Classic Cheese Pizza","Price - 50 Nis"),

    };
    private pizzamenu(int imageID,String name, String price){
        this.name = name;
        this.price = price;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public int getImageID(){return imageID;}

    public String getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return name ;
    }
}