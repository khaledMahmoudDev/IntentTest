package com.lilexample.androidintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DestinationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        TextView values = (TextView)findViewById(R.id.txtValues);

        Intent i = getIntent();
        if (i != null)
        {
            String c = i.getStringExtra("string data");
            int o = i.getIntExtra("Int data",-1);
            Toast.makeText(this," "+c + "\n"+o,Toast.LENGTH_LONG).show();
        }

        // TODO: extract any data passed by the caller

    }
}
