package com.tagit_bagit.tagit_bagit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CustomerSignUp extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_registration);
    }

    public void nextOnClick(View v)
    {
        startActivity(new Intent(CustomerSignUp.this, CustomerSignUpPageTwo.class));
    }

    public void backOnClick(View v)
    {
        startActivity(new Intent(CustomerSignUp.this, MainActivity.class));
    }

}
