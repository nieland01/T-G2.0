package com.tagit_bagit.tagit_bagit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EmployeeApplication extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_application);
    }

    public void nextOnClickEmpPg1(View v)
    {
        startActivity(new Intent(EmployeeApplication.this, EmployeeApplicationPageTwo.class));
    }

    public void backOnClickEmpP1(View v)
    {
        startActivity(new Intent(EmployeeApplication.this, EmployeeLogIn.class));
    }

}

