package com.example.menu;

import android.view.ViewGroup;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LucucinaImageAdapter  extends RecyclerView.Adapter<LucucinaImageAdapter.ViewHolder> {

    private String[] price;
    private String[] captions;
    private int[] imageIds;

    public LucucinaImageAdapter(int[] imageIds,String[] captions ,String[] price) {
        this.price = price;
        this.captions = captions;
        this.imageIds = imageIds;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_lacucina,
                parent,
                false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(LucucinaImageAdapter.ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.image);
        Drawable dr = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);
        imageView.setImageDrawable(dr);
        TextView txt = (TextView) cardView.findViewById(R.id.txtname);
        txt.setText(captions[position]);
        TextView txt2 = (TextView) cardView.findViewById(R.id.price);
        txt2.setText(price[position]);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });
    }

    @Override
    public int getItemCount() {
        return captions.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView cardView) {
            super(cardView);
            this.cardView = cardView;
        }

    }
}