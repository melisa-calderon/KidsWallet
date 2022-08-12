package com.example.kidsapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
public class creategoal extends AppCompatActivity {
    private ImageButton toExploreTips;
    private ImageButton toRequestMoney;
    private ImageButton toHome;
    private ImageButton toSavingsTree;
    private ImageButton toSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creategoal);
        //toExploreTips
        toExploreTips = (ImageButton)findViewById(R.id.homescreenToExploretips);
        toExploreTips.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(creategoal.this, requestmoney.class));
            }
        });
        //________________________________________________________________________________________
        //toRequestMoney
        toRequestMoney = (ImageButton)findViewById(R.id.homescreenToRequestmoney);
        toRequestMoney.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(creategoal.this, requestmoney.class));
            }
        });
        //________________________________________________________________________________________
        //toHome
        toHome = (ImageButton)findViewById(R.id.homescreenToHome);
        toHome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(creategoal.this, MainActivity.class));
            }
        });
        //________________________________________________________________________________________
        //toSavingsTree
        toSavingsTree = (ImageButton)findViewById(R.id.homescreenToSavingstree);
        toSavingsTree.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(creategoal.this, savingstree.class));
            }
        });
        //________________________________________________________________________________________
        //toSettings
        toSettings = (ImageButton)findViewById(R.id.homescreenToSettings);
        toSettings.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(creategoal.this, settings.class));
            }
        });
        //________________________________________________________________________________________

    }
}