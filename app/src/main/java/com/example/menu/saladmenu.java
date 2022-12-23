package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

public class saladmenu  extends AppCompatActivity {
    private String name;
    private String price;
    private int imageID;

    public static final saladmenu[] saladmenus = {
            new saladmenu (R.drawable.berrysalad,"Berry Salad","Price - 30 Nis"),
            new saladmenu (R.drawable.choppedsalad,"Chopped Salad","Price - 30 Nis"),
            new saladmenu (R.drawable.goddesschickensalad,"Goddess Chicken Salad","Price - 40 Nis"),
            new saladmenu (R.drawable.pastasalad,"pasta salad","Price - 30 Nis"),

    };
    private saladmenu(int imageID,String name, String price){
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