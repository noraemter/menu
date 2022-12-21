package com.example.menu;


public class Lacucina {

    private String name;
    private String price;
    private int imageID;

    public static final Lacucina[] Lacucinas = {
            new Lacucina (R.drawable.bbqpizza,"BBQ Pizza","Price - 50 Nis"),
            new Lacucina (R.drawable.berrysalad,"Berry Salad","Price - 40 Nis"),
            new Lacucina(R.drawable.cheesefries,"Cheese Fries","Price - 20 Nis"),
            new Lacucina(R.drawable.chichensandwich,"Chichen Sandwich","Price - 35 Nis"),
            new Lacucina(R.drawable.choppedsalad,"Chopped Salad","Price - 35 Nis"),
            new Lacucina(R.drawable.chripsandcalemary,"Chrip Sandwich Calemary","Price - 40 Nis"),
            new Lacucina(R.drawable.chripss,"chrimps","Price - 70 Nis"),
            new Lacucina(R.drawable.classiccheese,"Classic Cheese","Price - 50 Nis"),
            new Lacucina(R.drawable.cocacola,"CocaCola","Price - 5 Nis"),
            new Lacucina(R.drawable.cranberry,"CranBerry","Price - 15 Nis"),
            new Lacucina(R.drawable.culyfries,"Curly Fries","Price - 20 Nis"),
            new Lacucina(R.drawable.fettuccinealfredo,"Fettuccine Alfredo","Price - 45 Nis"),
            new Lacucina(R.drawable.fries,"Fries","Price - 25 Nis"),
            new Lacucina(R.drawable.goddesschickensalad,"Goddess Chicken Salad","Price - 30 Nis"),

    };
    private Lacucina(int imageID,String name, String price){
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


