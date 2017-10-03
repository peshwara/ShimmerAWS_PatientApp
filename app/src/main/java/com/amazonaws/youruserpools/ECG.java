package com.amazonaws.youruserpools;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.KinesisRecorder;
import com.amazonaws.regions.Regions;
import com.amazonaws.youruserpools.CognitoYourUserPoolsDemo.R;

import java.io.File;

public class ECG extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecg);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //final Button bsend = (Button) findViewById(R.id.bSend);
        final Button bsend = (Button) findViewById(R.id.sendECG);



        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        bsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "opening Shimmer app", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.shimmerresearch.multishimmertemplate");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                }



            }});
                /*bsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Sending the data to AWS", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                CognitoCachingCredentialsProvider credentialsProvider = new CognitoCachingCredentialsProvider(
                        ECG.this, // Context
                        "us-east-1:08e9dc80-fcb3-4450-b1a9-ee1f960beba1 ", // Identity Pool ID
                        Regions.US_EAST_1 // Region
                );


               *//* String kinesisDirectory = Environment.getExternalStorageDirectory().getAbsolutePath()+ "/ECG";

                File dir = getDir(kinesisDirectory, 0);*//*


              *//*  KinesisRecorder recorder = new KinesisRecorder(
                        dir,
                        Regions.US_EAST_1,
                        credentialsProvider
                );


                recorder.saveRecord("MyData".getBytes(),"ECGStream");
                recorder.submitAllRecords();*//*

            }
        });*/
    }

}
