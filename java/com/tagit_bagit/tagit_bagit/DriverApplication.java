package com.tagit_bagit.tagit_bagit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DriverApplication extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.driver_application_page_one);
    }

    public void nextOnClick(View v)
    {
        startActivity(new Intent(DriverApplication.this, CustomerSignUpPageTwo.class));
    }

    public void backOnClick(View v)
    {
        startActivity(new Intent(DriverApplication.this, MainActivity.class));
    }

}
