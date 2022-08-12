package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class addtosavingsaccount extends AppCompatActivity {

    private ImageButton toExploreTips;
    private ImageButton toRequestMoney;
    private ImageButton toHome;
    private ImageButton toSavingsTree;
    private ImageButton toSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtosavingsaccount);

        //toExploreTips
        toExploreTips = (ImageButton)findViewById(R.id.addsavingacctToExplore);
        toExploreTips.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(addtosavingsaccount.this, exploretips.class));
            }
        });
        //________________________________________________________________________________________

        //toRequestMoney
        toRequestMoney = (ImageButton)findViewById(R.id.addsavingacctToRequestmoney);
        toRequestMoney.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(addtosavingsaccount.this, requestmoney.class));
            }
        });
        //________________________________________________________________________________________

        //toHome
        toHome = (ImageButton)findViewById(R.id.addsavingacctToHome);
        toHome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(addtosavingsaccount.this, MainActivity.class));
            }
        });
        //________________________________________________________________________________________

        //toSavingsTree
        toSavingsTree = (ImageButton)findViewById(R.id.addsavingacctToSavingstree);
        toSavingsTree.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(addtosavingsaccount.this, savingstree.class));
            }
        });
        //________________________________________________________________________________________

        //toSettings
        toSettings = (ImageButton)findViewById(R.id.addsavingacctToSettings);
        toSettings.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(addtosavingsaccount.this, settings.class));
            }
        });
        //________________________________________________________________________________________

    }

}