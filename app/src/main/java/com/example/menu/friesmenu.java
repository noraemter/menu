package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

public class friesmenu  extends AppCompatActivity {
    private String name;
    private String price;
    private int imageID;

    public static final friesmenu[] friesmenus = {
            new friesmenu (R.drawable.cheesefries,"Cheese Fries","Price - 20 Nis"),
            new friesmenu (R.drawable.culyfries,"Curly Fries","Price - 30 Nis"),
            new friesmenu (R.drawable.fries,"fries","Price - 20 Nis"),

    };
    private friesmenu(int imageID,String name, String price){
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