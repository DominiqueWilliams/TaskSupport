package com.buildncode.tasksupport.Technician;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.buildncode.tasksupport.BobbePagerAdapter2;
import com.buildncode.tasksupport.MainActivity;
import com.buildncode.tasksupport.R;

import static com.buildncode.tasksupport.Technician.TechnicianGuideActivity.vwPager;


/**
 * A simple {@link Fragment} subclass.
 */
public class Page1Fragment extends Fragment {
    Button mBack, mForward;


    //    private TextView txView;
    public Page1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_worksheet1, container, false);
        mBack = view.findViewById(R.id.back);
        mForward = view.findViewById(R.id.forward);
        // For scrolling to next item
        mForward.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                vwPager.setCurrentItem(getNextPossibleItemIndex(1), true);
            }
        });

        // For scrolling to previous item
        mBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {//Nothing
            }
        });

//        txView = view.findViewById(R.id.tx_view);
//        String message = getArguments().getString("bobbe");

//        txView.setText("");

        return view;
    }
    private int getNextPossibleItemIndex (int change) {

        int currentIndex = vwPager.getCurrentItem();
        int total = vwPager.getAdapter().getCount();

        if (currentIndex + change < 0) {
            return 0;
        }

        return Math.abs((currentIndex + change) % total) ;
    }

}
