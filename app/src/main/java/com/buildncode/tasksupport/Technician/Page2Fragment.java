package com.buildncode.tasksupport.Technician;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.buildncode.tasksupport.R;

import static com.buildncode.tasksupport.Technician.TechnicianGuideActivity.vwPager;

public class Page2Fragment extends Fragment {
    Button mBack, mForward;

    public Page2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_worksheet2, container, false);
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
            public void onClick(View view) {
                vwPager.setCurrentItem(getNextPossibleItemIndex(-1), true);
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
