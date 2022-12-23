package com.example.menu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class salad_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saladmenu);


        RecyclerView recycler = findViewById(R.id.Salad_recycler);

        String[] price = new String[saladmenu.saladmenus.length];
        String[] captions = new String[saladmenu.saladmenus.length];
        int[] ids = new int[saladmenu.saladmenus.length];

        for (int i = 0; i < captions.length; i++) {
            captions[i] = saladmenu.saladmenus[i].getName();
            price[i] = saladmenu.saladmenus[i].getPrice();
            ids[i] = saladmenu.saladmenus[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        saladmenuAdapter adapter = new saladmenuAdapter(ids,captions, price);
        recycler.setAdapter(adapter);


    }
}

