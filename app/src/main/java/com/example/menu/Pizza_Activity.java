package com.example.menu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Pizza_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizzamenu);


        RecyclerView recycler = findViewById(R.id.Pizza_recycler);

        String[] price = new String[pizzamenu.pizzamenus.length];
        String[] captions = new String[pizzamenu.pizzamenus.length];
        int[] ids = new int[pizzamenu.pizzamenus.length];

        for (int i = 0; i < captions.length; i++) {
            captions[i] = pizzamenu.pizzamenus[i].getName();
            price[i] = pizzamenu.pizzamenus[i].getPrice();
            ids[i] = pizzamenu.pizzamenus[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        pizzamenuAdapter adapter = new pizzamenuAdapter(ids,captions, price);
        recycler.setAdapter(adapter);


    }
}