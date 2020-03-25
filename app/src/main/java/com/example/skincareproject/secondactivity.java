package com.example.skincareproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondactivity extends AppCompatActivity implements View.OnClickListener{
    private Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        button1=(Button)findViewById(R.id.button1);

        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button1) {
            Intent dryintent = new Intent(secondactivity.this, thirdactivity.class);
            startActivity(dryintent);

        } else if (v.getId() == R.id.button2) {
            Intent oilyintent = new Intent(secondactivity.this, fourthactivity.class);
            startActivity(oilyintent);
        }
        else if (v.getId()==R.id.button3){
            Intent combinationintent = new Intent(secondactivity.this, sixthactivity.class);
            startActivity(combinationintent);
        }
    }
}
