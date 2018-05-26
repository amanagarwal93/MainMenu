package com.example.pc.mainmenu;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;

import com.example.pc.mainmenu.R;

public class Home extends AppCompatActivity implements View.OnClickListener {
private CardView veg, nonveg,more,drinks;
private DrawerLayout mDrawerLayout;
private ActionBarDrawerToggle mToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        mDrawerLayout= (DrawerLayout)findViewById(R.id.drawerLayout);


        mToggle= new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayShowHomeEnabled(true);



    veg= findViewById(R.id.veg);
    nonveg=findViewById(R.id.nonveg);
    more=findViewById(R.id.more);
    drinks=findViewById(R.id.drinks);
    veg.setOnClickListener(this);
    nonveg.setOnClickListener(this);
    more.setOnClickListener(this);
    drinks.setOnClickListener(this);
    }

    public  boolean onOtionsItemSelected(MenuItem item){

        mDrawerLayout.closeDrawers();
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.veg:
                i = new Intent(this, veg.class);startActivity(i);
                break;
            case R.id.nonveg:
                i = new Intent(this, nonveg.class);startActivity(i);
                break;
            case R.id.more: i= new Intent(this,more.class);startActivity(i);
                break;
            case R.id.drinks: i =new Intent(this,drinks.class);startActivity(i);
                break;
            default:
                break;
            }
    }
}
