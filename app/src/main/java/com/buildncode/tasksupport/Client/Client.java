package com.buildncode.tasksupport.Client;
import java.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.buildncode.tasksupport.Database.DatabaseHelper;
import com.buildncode.tasksupport.R;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Client extends AppCompatActivity{
    DatabaseHelper tasksdb;


    private EditText mRequesterField, mLocationField, mJobDescriptionField;
    private String mRequester, mLocation, mJobDescription,mCurrentTime, mStatus;
    Date currentTime = Calendar.getInstance().getTime();
    private Button mSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.client_main);
        /*
         ****** Connecting Views to XML Values *******
         */
        mRequesterField = findViewById(R.id.requester);
        mLocationField = findViewById(R.id.location);
        mJobDescriptionField = findViewById(R.id.job_description);
        mSubmit = findViewById(R.id.submit);
        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveTaskInformation();
            }
        });
        tasksdb = new DatabaseHelper(this);
    }
    private void saveTaskInformation() {
        mRequester = mRequesterField.getText().toString();
        mLocation = mLocationField.getText().toString();
        mJobDescription = mJobDescriptionField.getText().toString();
        mCurrentTime = currentTime.toString();
        mStatus = getResources().getString(R.string.pending);
        Map task = new HashMap();
        task.put("requester", mRequester);
        task.put("location", mLocation);
        task.put("job_description", mJobDescription);
        task.put("date_time_requester", mCurrentTime);
        task.put("status", mStatus);
        //TODO: Save to DB
    }

}
