package com.example.sakinah.intent3_;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.imageViewPhone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialPhoneNumber("0341712500");
            }
        });

        findViewById(R.id.imageViewSMS).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                composeSmsMessage("Pesan dari SMK Telkom Malang");
            }
        });

        findViewById(R.id.imageViewBrowser).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebPage("http://www.smktelkom-mlg.sch.id");
            }
        });
    }
}
