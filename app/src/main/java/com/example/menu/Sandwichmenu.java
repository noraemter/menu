package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

public class Sandwichmenu  extends AppCompatActivity {
    private String name;
    private String price;
    private int imageID;

    public static final Sandwichmenu[] Sandwichmenus = {
            new Sandwichmenu (R.drawable.chichensandwich,"Chicken sandwich","Price - 30 Nis"),
            new Sandwichmenu (R.drawable.shawarma,"shawarma","Price - 30 Nis"),
            new Sandwichmenu (R.drawable.veggiesandwich,"Veggie Sandwich","Price - 40 Nis"),

    };
    private Sandwichmenu(int imageID,String name, String price){
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