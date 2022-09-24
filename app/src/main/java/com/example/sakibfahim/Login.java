package com.example.sakibfahim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button1,button2;
        button2=findViewById(R.id.rgstrb);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Login.this, Registration.class);
                //myIntent.putExtra("key", value); //Optional parameters
                Login.this.startActivity(myIntent);
            }
        });
    }
}