package com.example.skincareproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class sixthactivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView view1,view2,view3,view4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixthactivity);
        view1=(ImageView)findViewById(R.id.view11);
        view2=(ImageView)findViewById(R.id.view22);
        view3=(ImageView)findViewById(R.id.view33);
        view4=(ImageView)findViewById(R.id.view44);
        view1.setOnClickListener(this);
        view2.setOnClickListener(this);
        view3.setOnClickListener(this);
        view4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.view11){
            view1.setVisibility(View.GONE);
            view2.setVisibility(View.VISIBLE);
            view3.setVisibility(View.GONE);
            view4.setVisibility(View.GONE);

        }
        else if(v.getId()==R.id.view22){
            view1.setVisibility(View.GONE);
            view2.setVisibility(View.GONE);
            view3.setVisibility(View.VISIBLE);
            view4.setVisibility(View.GONE);

        }
        else if(v.getId()==R.id.view33){
            view1.setVisibility(View.GONE);
            view2.setVisibility(View.GONE);
            view3.setVisibility(View.GONE);
            view4.setVisibility(View.VISIBLE);

        }
        else if(v.getId()==R.id.view44){
            view1.setVisibility(View.GONE);
            view2.setVisibility(View.GONE);
            view3.setVisibility(View.GONE);
            view4.setVisibility(View.GONE);
            Intent backIntent=new Intent(sixthactivity.this,fifthactivity.class);
            startActivity(backIntent);

        }

    }
}
