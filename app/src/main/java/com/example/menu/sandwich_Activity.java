package com.example.menu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class sandwich_Activity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sand);


        RecyclerView recycler = findViewById(R.id.sand_recycler);

        String[] price = new String[Sandwichmenu.Sandwichmenus.length];
        String[] captions = new String[Sandwichmenu.Sandwichmenus.length];
        int[] ids = new int[Sandwichmenu.Sandwichmenus.length];

        for (int i = 0; i < captions.length; i++) {
            captions[i] = Sandwichmenu.Sandwichmenus[i].getName();
            price[i] = Sandwichmenu.Sandwichmenus[i].getPrice();
            ids[i] = Sandwichmenu.Sandwichmenus[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        sandwichmenuAdapter adapter = new sandwichmenuAdapter(ids,captions, price);
        recycler.setAdapter(adapter);


    }
}