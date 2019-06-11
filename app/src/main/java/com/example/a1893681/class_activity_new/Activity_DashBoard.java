package com.example.a1893681.class_activity_new;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_DashBoard extends AppCompatActivity {
    String name,pass;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__dash_board);
        Intent i = getIntent();
        name = i.getStringExtra("un");
        pass = i.getStringExtra("ps");
        TextView txt_name,txt_password;

        txt_name = findViewById(R.id.lbl_username);
        txt_password = findViewById(R.id.lbl_password);
        txt_name.setText(name);
        txt_password.setText(pass);


    }
}
