package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

public class fishmenu  extends AppCompatActivity {
    private String name;
    private String price;
    private int imageID;

    public static final fishmenu[] fishmenus = {
            new fishmenu (R.drawable.chripss,"chrimpss","Price - 60 Nis"),
            new fishmenu (R.drawable.salmon1,"salmon","Price - 60 Nis"),
            new fishmenu (R.drawable.labrak,"labrak","Price - 90 Nis"),

    };
    private fishmenu(int imageID,String name, String price){
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