package com.buildncode.tasksupport.Technician;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.buildncode.tasksupport.R;
import com.github.gcacace.signaturepad.views.SignaturePad;

import static com.buildncode.tasksupport.Technician.TechnicianGuideActivity.vwPager;


/**
 * A simple {@link Fragment} subclass.
 */
public class Page3Fragment extends Fragment {
    Button mBack, mClear;


    public Page3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_worksheet3, container, false);
        mBack = view.findViewById(R.id.back);
        // For scrolling to previous item
        mBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                vwPager.setCurrentItem(getNextPossibleItemIndex(-1), true);
            }
        });
        final SignaturePad tech_signaturePad =  view.findViewById(R.id.tech_signaturePad);
        mClear = view.findViewById(R.id.clear);
        tech_signaturePad.setOnSignedListener(new SignaturePad.OnSignedListener() {

            @Override
            public void onStartSigning() {
                //Event triggered when the pad is touched
            }

            @Override
            public void onSigned() {
                //Event triggered when the pad is signed
            }

            @Override
            public void onClear() {
                //Event triggered when the pad is cleared
            }
        });
        mClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tech_signaturePad.clear();
            }
        });
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
