package com.tagit_bagit.tagit_bagit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class CustomerSignUpPageTwo extends AppCompatActivity {

    CheckBox adrCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_registration_part_two);
    }

    public void nextOnClick(View v)
    {
        adrCheck = (CheckBox) findViewById(R.id.addressCheck);
        if(adrCheck.isChecked()) {
            startActivity(new Intent(CustomerSignUpPageTwo.this, CustomerSignUpBilling.class));
        }
        else {
            startActivity(new Intent(CustomerSignUpPageTwo.this, CustomerSignUpPageThree.class));
        }
    }

    public void backOnClick(View v)
    {
        startActivity(new Intent(CustomerSignUpPageTwo.this, CustomerSignUp.class));
    }
}
