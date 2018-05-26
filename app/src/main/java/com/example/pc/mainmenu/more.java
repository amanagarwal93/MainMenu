package com.example.pc.mainmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.pc.mainmenu.R;

public class more extends AppCompatActivity implements View.OnClickListener {
private CardView chinese,southindian,starters,maincourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        chinese= findViewById(R.id.chinese);
        southindian=findViewById(R.id.southindian);
        starters=findViewById(R.id.starters);
        maincourse=findViewById(R.id.MainCourse);
        chinese.setOnClickListener(this);
        southindian.setOnClickListener(this);
        starters.setOnClickListener(this);
        maincourse.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        Intent i;
        switch (view.getId()) {
            case R.id.chinese:
                i = new Intent(this,chinese.class);startActivity(i);
                break;
            case R.id.southindian:
                i = new Intent(this, southindian.class);startActivity(i);
                break;
            case R.id.starters: i= new Intent(this,starters.class);startActivity(i);
                break;
            case R.id.MainCourse: i =new Intent(this,maincourse.class);startActivity(i);
                break;
            default:
                break;
        }
    }
}
