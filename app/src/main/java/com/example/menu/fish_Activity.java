package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class fish_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish);

        RecyclerView recycler = findViewById(R.id.fish_recycler);

        String[] price = new String[fishmenu.fishmenus.length];
        String[] captions = new String[fishmenu.fishmenus.length];
        int[] ids = new int[fishmenu.fishmenus.length];

        for (int i = 0; i < captions.length; i++) {
            captions[i] = fishmenu.fishmenus[i].getName();
            price[i] = fishmenu.fishmenus[i].getPrice();
            ids[i] = fishmenu.fishmenus[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        fishmenuAdapter adapter = new fishmenuAdapter(ids,captions, price);
        recycler.setAdapter(adapter);


    }
}