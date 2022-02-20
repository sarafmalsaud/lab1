package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    static String a;
    static String b;
    static String c;
    static String d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button flipb = (Button) findViewById(R.id.btn);
        final Spinner spin = (Spinner) findViewById(R.id.spnr);
        final EditText Name = (EditText) findViewById(R.id.txtName);
        final EditText Email = (EditText) findViewById(R.id.txtEmail);
        final EditText Number = (EditText) findViewById(R.id.txtNumber);



        flipb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this,Flip.class));

                Intent intent = new Intent(MainActivity.this,Flip.class);
                startActivity(intent);

                a = Name.getText().toString();
                b= spin.getSelectedItem().toString();
                c= Email.getText().toString();
                d= Number.getText().toString();
                
                // sara


            }
        });
    }
}
