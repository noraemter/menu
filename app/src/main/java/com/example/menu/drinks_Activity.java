package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class drinks_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);


        RecyclerView recycler = findViewById(R.id.drink_recycler);

        String[] price = new String[drinksmenu.drinksmenus.length];
        String[] captions = new String[drinksmenu.drinksmenus.length];
        int[] ids = new int[drinksmenu.drinksmenus.length];

        for (int i = 0; i < captions.length; i++) {
            captions[i] = drinksmenu.drinksmenus[i].getName();
            price[i] = drinksmenu.drinksmenus[i].getPrice();
            ids[i] = drinksmenu.drinksmenus[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        drinks_menuAdapter adapter = new drinks_menuAdapter(ids,captions, price);
        recycler.setAdapter(adapter);


    }
    }
