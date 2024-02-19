package com.example.faeldonia1stapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView name;
TextView myName;
TextView contact;
TextView myContact;
TextView email;
TextView myEmail;
TextView myDisplay;
Button myButton;
Button myClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.txtName);
        myName = (TextView) findViewById(R.id.txtMyName);
        contact = (TextView) findViewById(R.id.txtContact);
        myContact = (TextView) findViewById(R.id.txtMyContact);
        email = (TextView) findViewById(R.id.txtEmail);
        myEmail = (TextView) findViewById(R.id.txtMyEmail);
        myDisplay = (TextView) findViewById(R.id.txtDisplay);
        myButton = (Button) findViewById(R.id.btnClick);
        myClear = (Button) findViewById(R.id.btnClear);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDisplay.setText("Hello MJ!");
            }
        });

        myClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDisplay.setText("Hello!");
            }
        });
    }

}
