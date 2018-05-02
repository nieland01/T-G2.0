package com.tagit_bagit.tagit_bagit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LogInFailed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in_failed);
    }

    public void logInFailedOnClick(View v)
    {
        startActivity(new Intent(LogInFailed.this, MainActivity.class));
    }
}
