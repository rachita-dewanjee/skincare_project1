package com.example.skincareproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView showtext;
    private Button clickbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showtext=(TextView)findViewById(R.id.showname);
        clickbutton=(Button)findViewById(R.id.startbutton);
        clickbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent=new Intent(MainActivity.this,firstactivity.class);
                startActivity(startintent);

            }
        });
    }
}
