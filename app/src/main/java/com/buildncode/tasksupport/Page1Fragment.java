package com.buildncode.tasksupport;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Page1Fragment extends Fragment {


//    private TextView txView;
    public Page1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_worksheet1, container, false);

//        txView = view.findViewById(R.id.tx_view);
//        String message = getArguments().getString("bobbe");

//        txView.setText("");

        return view;
    }

}
