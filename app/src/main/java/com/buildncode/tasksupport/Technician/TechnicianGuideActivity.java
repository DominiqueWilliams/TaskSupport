package com.buildncode.tasksupport.Technician;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.buildncode.tasksupport.BobbePagerAdapter2;
import com.buildncode.tasksupport.R;

public class TechnicianGuideActivity extends AppCompatActivity {
    private ViewPager vwPager;
    private BobbePagerAdapter2 adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tech_guide);
        vwPager = findViewById(R.id.view_pager);
        adapter = new BobbePagerAdapter2(getSupportFragmentManager());
        vwPager.setAdapter(adapter);
    }


}
