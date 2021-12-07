package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    List<recipeDataModal> myRecipeList;
    recipeDataModal mRecipeDataModal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager =  new GridLayoutManager(MainActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myRecipeList = new ArrayList<>();
        myRecipeList.add(new recipeDataModal("Chicken Biryani","","",R.drawable.lgbtq));
         myAdapter myAdapter = new myAdapter(MainActivity.this,myRecipeList);
         mRecyclerView.setAdapter(myAdapter);

    }
}