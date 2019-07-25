package com.buildncode.tasksupport;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.buildncode.tasksupport.Technician.Page1Fragment;
import com.buildncode.tasksupport.Technician.Page2Fragment;
import com.buildncode.tasksupport.Technician.Page3Fragment;

public class BobbePagerAdapter2 extends FragmentPagerAdapter {

    public BobbePagerAdapter2(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        Fragment bFrag;

        switch (i){
            case 0:
                bFrag = new Page1Fragment();
                break;

            case 1:
                bFrag = new Page2Fragment();
                break;

            case 2:
                bFrag = new Page3Fragment();
                break;

             default:
                 bFrag = new Page1Fragment();
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
        return 3;
    }
}
