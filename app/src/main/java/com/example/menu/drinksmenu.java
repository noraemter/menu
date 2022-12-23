package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

public class drinksmenu  extends AppCompatActivity {
    private String name;
    private String price;
    private int imageID;

    public static final drinksmenu[] drinksmenus = {
            new drinksmenu (R.drawable.cocacola,"cocacola","Price - 6 Nis"),
            new drinksmenu (R.drawable.lemonade,"lemonade","Price - 15 Nis"),
            new drinksmenu (R.drawable.sevenup,"sevenup","Price - 6 Nis"),

    };
    private drinksmenu(int imageID,String name, String price){
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