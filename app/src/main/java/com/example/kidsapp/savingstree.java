package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class savingstree extends AppCompatActivity {
    private Button toSavingsTree;
    private Button toCreateNewGoal;

    private ImageButton toExploreTips;
    private ImageButton toRequestMoney;
    private ImageButton toHome;
    private ImageButton toSavingsTreeTaskBar;
    private ImageButton toSettings;

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


        //toExploreTips
        toExploreTips = (ImageButton)findViewById(R.id.homescreenToExploretips);
        toExploreTips.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(savingstree.this, exploretips.class));
            }
        });
        //________________________________________________________________________________________

        //toRequestMoney
        toRequestMoney = (ImageButton)findViewById(R.id.homescreenToRequestmoney);
        toRequestMoney.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(savingstree.this, requestmoney.class));
            }
        });
        //________________________________________________________________________________________

        //toHome
        toHome = (ImageButton)findViewById(R.id.homescreenToHome);
        toHome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(savingstree.this, MainActivity.class));
            }
        });
        //________________________________________________________________________________________

        //toSavingsTree
        toSavingsTreeTaskBar = (ImageButton)findViewById(R.id.homescreenToSavingstree);
        toSavingsTreeTaskBar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(savingstree.this, savingstree.class));
            }
        });
        //________________________________________________________________________________________

        //toSettings
        toSettings = (ImageButton)findViewById(R.id.homescreenToSettings);
        toSettings.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(savingstree.this, settings.class));
            }
        });
        //________________________________________________________________________________________

    }
}