package com.statelelumii;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Inregistrare extends AppCompatActivity  implements View.OnClickListener{

    EditText etNume, etEmail, etUSER, etParola, etREP;
    Button bInregistrare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inregistrare);

        etNume = (EditText)findViewById(R.id.etNume);
        etEmail = (EditText)findViewById(R.id.etEmail);
        etUSER = (EditText)findViewById(R.id.etUsername);
        etParola = (EditText)findViewById(R.id.etParola);
        etREP = (EditText)findViewById(R.id.etREP);
        bInregistrare = (Button)findViewById(R.id.bInregistrare);

        bInregistrare.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}

