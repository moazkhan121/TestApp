package com.usmanejaz.examapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class Drawer extends AppCompatActivity {
DrawerLayout drawer;
NavigationView nav;
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        drawer = findViewById(R.id.drawer);
        nav = findViewById(R.id.nav);
        toolbar = findViewById(R.id.toolbar);


        MainActivity fragmentOne = new MainActivity();
        FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fra, fragmentOne);
        transaction.commit();


        setSupportActionBar(toolbar);

        ActionBarDrawerToggle at = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.OpenDrawer, R.string.CloseDrawer);
        drawer.addDrawerListener(at);
        at.syncState();

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item){
                int id = item.getItemId();

                if(id == R.id.results){
                    ResultDisplay fragmentOne = new ResultDisplay();
                    FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.fra, fragmentOne);
                    transaction.commit();

                }
                else if(id == R.id.home){
                    MainActivity fragmentOne = new MainActivity();
                    FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.fra, fragmentOne);
                    transaction.commit();

                }

                return true;
            }
        });

    }
}