package com.example.menu;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class drinks_menuAdapter   extends RecyclerView.Adapter<drinks_menuAdapter.ViewHolder> {

    private String[] price;
    private String[] captions;
    private int[] imageIds;

    public drinks_menuAdapter(int[] imageIds,String[] captions ,String[] price) {
        this.price = price;
        this.captions = captions;
        this.imageIds = imageIds;
    }


    @NonNull
    @Override
    public drinks_menuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_drinks,
                parent,
                false);

        return new drinks_menuAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(drinks_menuAdapter.ViewHolder holder, int position) {
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
