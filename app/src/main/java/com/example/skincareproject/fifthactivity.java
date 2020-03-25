package com.example.skincareproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class fifthactivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthactivity);
        button1=(Button)findViewById(R.id.likebutton);
        button2=(Button)findViewById(R.id.exitbutton);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.likebutton){
            Toast.makeText(fifthactivity.this,"USER LIKED US",Toast.LENGTH_LONG).show();


        }
        else if(v.getId()==R.id.exitbutton){

            Intent closeIntent=new Intent(fifthactivity.this,MainActivity.class);
            startActivity(closeIntent);

        }
    }
}
