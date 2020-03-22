package com.example.corona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button symButton,perButton,deathButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        symButton =(Button)findViewById(R.id.symptomsButton);
        perButton =(Button)findViewById(R.id.preventionButoon);
        deathButton =(Button)findViewById(R.id.statisticsButoon);
        symButton.setOnClickListener(this);
        perButton.setOnClickListener(this);
        deathButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent ;
        if(v.getId()==R.id.symptomsButton)
        {
            intent = new Intent(MainActivity.this,first.class);
            startActivity(intent);

        }
        else if(v.getId()==R.id.preventionButoon)
        {
            intent = new Intent(MainActivity.this,second.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.statisticsButoon)
        {
            intent = new Intent(MainActivity.this,third.class);
            startActivity(intent);
        }
    }
}
