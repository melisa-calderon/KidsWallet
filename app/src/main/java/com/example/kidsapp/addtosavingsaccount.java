package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

public class addtosavingsaccount extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private ImageButton toExploreTips;
    private ImageButton toRequestMoney;
    private ImageButton toHome;
    private ImageButton toSavingsTree;
    private ImageButton toSettings;

    private Button addtosavingsReturn;

    private EditText amountToAdd;

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

        addtosavingsReturn = (Button)findViewById(R.id.addtosavingsReturn);
        amountToAdd = (EditText) findViewById(R.id.amountToSave);
        addtosavingsReturn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                savingstree.editBalance(0.0);
                System.out.println("text contains: "+ amountToAdd.getText());
                startActivity(new Intent(addtosavingsaccount.this, savingstree.class));
            }
        });

        //toSettings
        toSettings = (ImageButton)findViewById(R.id.addsavingacctToSettings);
        toSettings.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(addtosavingsaccount.this, settings.class));
            }
        });
        //________________________________________________________________________________________

        Spinner spinner = findViewById(R.id.fromAccount);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.accounts_array, android.R.layout.simple_dropdown_item_1line);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

}