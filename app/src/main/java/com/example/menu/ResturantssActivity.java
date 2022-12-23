package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ResturantssActivity extends AppCompatActivity {


    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 openActivity2();
            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                 openActivity3();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, listview_lacucina.class);
        startActivity(intent);
    }
    public void openActivity3() {
        Intent intent = new Intent(this, Activity_Macho.class);
        startActivity(intent);
    }

}







//
//
//        RecyclerView recyclerView;
//ArrayList<Resturants> arrayList = new ArrayList<>();
//    ImageButton imageButton;
//    ImageButton imageButton2;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_resutant);
//
//        imageButton = (ImageButton) findViewById(R.id.imageButton) ;
//        imageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(ResturantsActivity.this,LacucinaActivity.class);
//                startActivity(intent);
//
//            }
//
//        });
//
//        imageButton2 = (ImageButton) findViewById(R.id.imageButton2) ;
//
//        imageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(ResturantsActivity.this,MachoActivity.class);
//                startActivity(intent);
//
//            }
//
//        });
//
//
//
//
//
//
//
////        RecyclerView recycler = findViewById(R.id.Resturant_recycler);
////        LinearLayoutManager manager = new LinearLayoutManager(this);
////        ArrayList<Resturants> resturants = new ArrayList<Resturants>();
////
////
////        resturants.add(new Resturants("Lacucina", R.drawable.lacucina));
////        resturants.add(new Resturants("Macho Macho", R.drawable.macho));
////
////        ResturantImagesAdapter adapter = new ResturantImagesAdapter(this, resturants);
////        recycler.setAdapter(adapter);
//    }

//
//        String[] captions = new String[Resturants.Resturants.length];
//        int[] ids = new int[Resturants.Resturants.length];
//
//        for (int i = 0; i < captions.length; i++) {
//            captions[i] = Resturants.Resturants[i].getName();
//            ids[i] = Resturants.Resturants[i].getImageID();
//        }
//        recycler.setLayoutManager(new LinearLayoutManager(this));
//        //ResturantImagesAdapter adapter = new ResturantImagesAdapter(captions, ids);
//        recycler.setAdapter(adapter);
//
//
//        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent,
//                                    View view,
//                                    int position,
//                                    long id) {
//                if(position == 1){
//                    Intent intent = new Intent(ResturantsActivity.this, LacucinaActivity.class);
//                    startActivity(intent);
//                }
//                else{
//                    Intent intent = new Intent(ResturantsActivity.this, MachoActivity.class);
//                    startActivity(intent);
//                }
//            }
//        };
//        ListView listView = (ListView)findViewById(R.id.main_menu);
//        listView.setOnItemClickListener(itemClickListener);
//
//
//}}
