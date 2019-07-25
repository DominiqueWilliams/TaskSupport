package com.buildncode.tasksupport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.buildncode.tasksupport.Client.Client;
import com.buildncode.tasksupport.R;

public class Page0Fragment extends Fragment {
Button mClientButton;

    public Page0Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_worksheet0, container, false);
        mClientButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Client.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
