package com.buildncode.tasksupport.Technician;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.buildncode.tasksupport.MainActivity;
import com.buildncode.tasksupport.R;


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
        mForward = view.findViewById(R.id.forward);
        mForward.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                MainActivity.vwPager.setCurrentItem(getItem(+1), true); //getItem(-1) for previous
            }
        });


//        txView = view.findViewById(R.id.tx_view);
//        String message = getArguments().getString("bobbe");

//        txView.setText("");

        return view;
    }
    private int getItem(int i) {
        return MainActivity.vwPager.getCurrentItem() + i;
    }
}
