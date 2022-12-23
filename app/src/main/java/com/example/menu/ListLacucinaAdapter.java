package com.example.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class ListLacucinaAdapter extends ArrayAdapter<ListLacucina> {


private Context context;
private int resource;

    public ListLacucinaAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ListLacucina> objects) {
        super(context, resource, objects);

this.context= context;
this.resource =resource;


    }
    @NonNull
    @Override
public View getView ( int position ,    @NonNull View convertView ,   @NonNull ViewGroup parent){
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView =layoutInflater.inflate(resource, parent ,false);
        ImageView imageView = convertView.findViewById(R.id.img);
        TextView textView = convertView.findViewById(R.id.text2);

        imageView.setImageResource(getItem(position).getImage());
        textView.setText(getItem(position).getName());

        return  convertView;

    }

    public interface OnItemClickListener {
    }
}
