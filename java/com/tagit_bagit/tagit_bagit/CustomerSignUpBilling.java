package com.tagit_bagit.tagit_bagit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CustomerSignUpBilling extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_registration_billing);
    }

    public void backOnClickBill(View v) {
        startActivity(new Intent(CustomerSignUpBilling.this, CustomerSignUpPageThree.class));
    }
    public void finishOnClick(View v) {
        startActivity(new Intent(CustomerSignUpBilling.this, MainActivity.class));
    }

}
