package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class requestmoney extends AppCompatActivity {

    private ImageButton toExploreTips;
    private ImageButton toRequestMoney;
    private ImageButton toHome;
    private ImageButton toSavingsTree;
    private ImageButton toSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requestmoney);

        //toExploreTips

        toExploreTips = (ImageButton)findViewById(R.id.requestmoneyToExplore);
        toExploreTips.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(requestmoney.this, exploretips.class));
            }
        });
        //________________________________________________________________________________________

        //toRequestMoney
        toRequestMoney = (ImageButton)findViewById(R.id.requestmoneyToRequestmoney);
        toRequestMoney.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(requestmoney.this, requestmoney.class));
            }
        });
        //________________________________________________________________________________________

        //toHome
        toHome = (ImageButton)findViewById(R.id.requestmoneyToHomescreen);
        toHome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(requestmoney.this, MainActivity.class));
            }
        });
        //________________________________________________________________________________________

        //toSavingsTree
        toSavingsTree = (ImageButton)findViewById(R.id.requestmoneyToSavingstree);
        toSavingsTree.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(requestmoney.this, savingstree.class));
            }
        });
        //________________________________________________________________________________________

        //toSettings
        toSettings = (ImageButton)findViewById(R.id.requestmoneyToSettings);
        toSettings.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(requestmoney.this, settings.class));
            }
        });
        //________________________________________________________________________
    }


}