package com.tagit_bagit.tagit_bagit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EmployeeLogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_log_in);
    }

    public void custLogInOnClick(View v)
    {
        startActivity(new Intent(EmployeeLogIn.this, MainActivity.class));
    }

    public void applyOnClick(View v)
    {
        startActivity(new Intent(EmployeeLogIn.this, EmployeeApplication.class));
    }
}
