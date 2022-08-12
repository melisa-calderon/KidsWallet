package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class savingstree extends AppCompatActivity {
    private Button toSavingsTree;
    private Button toCreateNewGoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savingstree);

        toSavingsTree = (Button)findViewById(R.id.addToSavingsTree);
        toCreateNewGoal = (Button)findViewById(R.id.createGoal);

        toSavingsTree.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(savingstree.this, addtosavingsaccount.class));
            }
        });

        toCreateNewGoal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(savingstree.this, creategoal.class));
            }
        });
    }
}