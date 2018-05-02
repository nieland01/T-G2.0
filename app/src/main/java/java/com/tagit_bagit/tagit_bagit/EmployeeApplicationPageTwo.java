package com.tagit_bagit.tagit_bagit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EmployeeApplicationPageTwo extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_application_page_two);
    }

    public void applyDriverOnClick(View v)
    {
        startActivity(new Intent(EmployeeApplicationPageTwo.this, DriverApplication.class));
    }

    public void applyShopperOnClick(View v)
    {
        startActivity(new Intent(EmployeeApplicationPageTwo.this, CustomerSignUpPageTwo.class));
    }

    public void backOnClickEmp(View v)
    {
        startActivity(new Intent(EmployeeApplicationPageTwo.this, EmployeeApplication.class));
    }

}