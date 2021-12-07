package com.example.recipeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter<recipeViewHolder> {

    private Context mContext;
    private List<recipeDataModal> myRecipeList;

    public myAdapter(Context mContext, List<recipeDataModal> myRecipeList) {
        this.mContext = mContext;
        this.myRecipeList = myRecipeList;
    }

    @Override
    public recipeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout,viewGroup, false);

        return new recipeViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull recipeViewHolder recipeViewHolder, int i) {
        recipeViewHolder.recipeImageView.setImageResource(myRecipeList.get(i).getRecipeImage());
        recipeViewHolder.titleTextView.setText(myRecipeList.get(i).getTitleName());


    }

    @Override
    public int getItemCount() {
        return myRecipeList.size();
    }
}
class recipeViewHolder extends RecyclerView.ViewHolder {

    ImageView recipeImageView;
    TextView titleTextView;
    CardView myCardView;

    public recipeViewHolder( View itemView) {
        super(itemView);
        recipeImageView = itemView.findViewById(R.id.recipeImageView);
        titleTextView = itemView.findViewById(R.id.titleTextView);
        myCardView = itemView.findViewById(R.id.myCardView);
    }
}
