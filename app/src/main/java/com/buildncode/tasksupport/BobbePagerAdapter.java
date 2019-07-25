package com.buildncode.tasksupport;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

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

            case 1:
                bFrag = new Page1Fragment();
                break;

            case 2:
                bFrag = new Page2Fragment();
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
        return 3;
    }
}
