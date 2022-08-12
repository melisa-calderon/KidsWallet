package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;

    private ImageButton toExploreTips;
    private ImageButton toRequestMoney;
    private ImageButton toHome;
    private ImageButton toSavingsTree;
    private ImageButton toSettings;

    private static EditText checkingBalance;
    private static EditText savingsBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, savingstree.class));
            }
        });

        //toExploreTips
        toExploreTips = (ImageButton)findViewById(R.id.homescreenToExploretips);
        toExploreTips.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, exploretips.class));
            }
        });
        //________________________________________________________________________________________

        //toRequestMoney
        toRequestMoney = (ImageButton)findViewById(R.id.homescreenToRequestmoney);
        toRequestMoney.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, requestmoney.class));
            }
        });
        //________________________________________________________________________________________

        //toHome
        toHome = (ImageButton)findViewById(R.id.homescreenToHome);
        toHome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });
        //________________________________________________________________________________________

        //toSavingsTree
        toSavingsTree = (ImageButton)findViewById(R.id.homescreenToSavingstree);
        toSavingsTree.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, savingstree.class));
            }
        });
        //________________________________________________________________________________________

        //toSettings
        toSettings = (ImageButton)findViewById(R.id.homescreenToSettings);
        toSettings.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, settings.class));
            }
        });
        //________________________________________________________________________________________

        checkingBalance = (EditText)findViewById(R.id.checkingBalance);
        checkingBalance.setText( "$"+ accountinformation.getBalance() );

        savingsBalance = (EditText)findViewById(R.id.savingBalance);
        savingsBalance.setText( "$"+ accountinformation.getSavings() );

    }


}