package com.tagit_bagit.tagit_bagit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CustomerAccInfo extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_account_info);
    }

    public void backOnClickAccInfo(View v)
    {
        startActivity(new Intent(CustomerAccInfo.this, CustomerMainView.class));
    }
}
