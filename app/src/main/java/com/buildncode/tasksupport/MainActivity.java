package com.buildncode.tasksupport;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static ViewPager vwPager;
    private BobbePagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vwPager = findViewById(R.id.view_pager);
        adapter = new BobbePagerAdapter(getSupportFragmentManager());
        vwPager.setAdapter(adapter);
    }
}
