package com.buildncode.tasksupport;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.buildncode.tasksupport.Technician.Page1Fragment;
import com.buildncode.tasksupport.Technician.Page2Fragment;
import com.buildncode.tasksupport.Technician.Page3Fragment;

public class BobbePagerAdapter extends FragmentPagerAdapter {

    public BobbePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        Fragment bFrag;

        switch (i){
            case 0:
                bFrag = new Page0Fragment();
                break;
             default:
                 bFrag = new Page0Fragment();
                 break;
        }

//        Page1Fragment bFrag = new Page1Fragment();
//        Bundle bundle = new Bundle();
//        i++;
//
//        bundle.putString("bobbe", "Page" + i);
//        bFrag.setArguments(bundle);
        return bFrag;
    }

    @Override
    public int getCount() {
        return 1;
    }
}
