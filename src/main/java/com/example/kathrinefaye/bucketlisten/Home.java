package com.example.kathrinefaye.bucketlisten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void pretest(View view) {
        // TODO Auto-generated method stub
        Intent i=new Intent(this, Pre_test.class);
        startActivity(i);
    }

}

