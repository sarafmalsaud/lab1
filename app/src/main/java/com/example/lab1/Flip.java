package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.jar.Attributes;

public class Flip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip);

        final TextView name2 = (TextView) findViewById(R.id.txtName2);
        name2.setText(MainActivity.a);
        final TextView pos2 = (TextView) findViewById(R.id.txtPos2);
        pos2.setText(MainActivity.b);
        final TextView temail2 = (TextView) findViewById(R.id.txtEmail2);
        temail2.setText(MainActivity.c);
        final TextView tnum2 = (TextView) findViewById(R.id.txtNumber2);
        tnum2.setText(MainActivity.d);

    }
}