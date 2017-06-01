package com.example.monitor.dsmeteo1;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.monitor.dsmeteo1.R.id.txtpassword;
import static com.example.monitor.dsmeteo1.R.styleable.View;

public class LoginActivity extends AppCompatActivity {

   // private static final String TAG = ""


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }


    public void iniciar(View v) {

        Button ingresar = (Button) findViewById(R.id.ingresar);

        ingresar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                startActivity(new Intent(LoginActivity.this, Ubication.class).putExtra("logeado","si"));

            }

        });

    }
}



