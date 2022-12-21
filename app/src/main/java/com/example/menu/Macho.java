package com.example.menu;

public class Macho {

    private String name;
    private String price;
    private int imageID;

    public static final Macho[] Machos = {
            new Macho("Chicken Burger", "40 Nis", R.drawable.chickenburger),
            new Macho("Beef Burger", "40 Nis", R.drawable.beefburger),
            new Macho("Mashroom Burger", "40 Nois", R.drawable.mashroomburger)
    };

    private Macho(String name, String price, int imageID){
        this.name = name;
        this.price = price;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public String getprice(){return price;}
    public int getImageID(){return imageID;}

    @Override
    public String toString(){return name;}
}
