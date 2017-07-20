package com.amazonaws.youruserpools;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.KinesisFirehoseRecorder;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.KinesisRecorder;
import com.amazonaws.regions.Regions;
import com.amazonaws.youruserpools.CognitoYourUserPoolsDemo.R;

import java.io.File;

public class SendECG extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button bsend = (Button) findViewById(R.id.buttonSend);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_ecg);


        bsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             /*   Toast.makeText(SendECG.this, "Sending the data!!",
                        Toast.LENGTH_LONG).show();

                CognitoCachingCredentialsProvider credentialsProvider = new CognitoCachingCredentialsProvider(
                        SendECG.this, // Context
                        "us-east-1:08e9dc80-fcb3-4450-b1a9-ee1f960beba1 ", // Identity Pool ID
                        Regions.US_EAST_1 // Region
                );



                String kinesisDirectory = "/root/sdcard/ECG/";

                File dir = getDir(kinesisDirectory, 0);


                KinesisRecorder recorder = new KinesisRecorder(
                        dir,
                        Regions.US_EAST_1,
                        credentialsProvider
                );


                recorder.saveRecord("MyData".getBytes(),"ECGStream");
                recorder.submitAllRecords();

*/

            }
        });


       // kinesisFirehose(getApplicationContext());




    }


    /*static void kinesisFirehose(Context context){
        // Gets a working directory for the recorder
        File directory = context.getCachedDir();
// Sets Firehose region
        Regions region = Regions.US_WEST_2;
// Initialize a credentials provider to access Amazon Kinesis Firehose
        AWSCredentialsProvider provider = new CognitoCachingCredentialsProvider(
                context,
                "identityPoolId",
                Regions.US_EAST_1); // region of your Amazon Cognito identity pool
        final KinesisFirehoseRecorder firehoseRecorder = new KinesisFirehoseRecorder(
                directory, region, provider);

// Start to save data, either a String or a byte array
        firehoseRecorder.saveRecord("Hello world!");
        firehoseRecorder.saveRecord("Streaming data to Amazon S3 via Amazon Kinesis Firehose is easy.\n");

// Send previously saved data to Amazon Kinesis Firehose
// Note: submitAllRecords() makes network calls, so wrap it in an AsyncTask.
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... v) {
                try {
                    firehoseRecorder.submitAllRecords();
                } catch (AmazonClientException ace) {
                    // handle error
                }
            }
        }.execute();
    }*/



}
