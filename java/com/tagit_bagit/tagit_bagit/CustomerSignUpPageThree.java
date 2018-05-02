package com.tagit_bagit.tagit_bagit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CustomerSignUpPageThree extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_registration_part_three);
    }

    public void nextOnClickPageThree(View v)
    {
        startActivity(new Intent(CustomerSignUpPageThree.this, CustomerSignUpBilling.class));
    }

    public void backOnClickPageThree(View v)
    {
        startActivity(new Intent(CustomerSignUpPageThree.this, CustomerSignUpPageTwo.class));
    }
}
