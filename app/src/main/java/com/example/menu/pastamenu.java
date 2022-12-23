package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

public class pastamenu  extends AppCompatActivity {
    private String name;
    private String price;
    private int imageID;

    public static final pastamenu[] pastamenus = {
            new pastamenu (R.drawable.pestopasta,"pestopasta","Price - 60 Nis"),
            new pastamenu (R.drawable.pennepasta,"pennepasta","Price - 60 Nis"),
            new pastamenu (R.drawable.fettuccinealfredo,"fettuccinealfredo","Price - 50 Nis"),

    };
    private pastamenu(int imageID,String name, String price){
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