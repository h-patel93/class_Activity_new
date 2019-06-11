package com.example.a1893681.class_activity_new;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edt_password,edt_username;
        Button btn_submit;

        edt_password=findViewById(R.id.edt_password);
        edt_username=findViewById(R.id.edt_username);
        btn_submit=findViewById(R.id.btn_submit);

            final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);



        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.setMessage(R.string.alert);


                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String uname,pass;
                        uname= edt_username.getText().toString();
                        pass=edt_password.getText().toString();
                        Intent i = new Intent(MainActivity.this,Activity_DashBoard.class);
                        i.putExtra("un",uname);
                        i.putExtra("ps",pass);


                        startActivity(i);
                        Toast.makeText(getApplicationContext(),uname + "Thanks!!",Toast.LENGTH_LONG).show();



                    }
                });

                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Harsh dhanji patel", Toast.LENGTH_SHORT).show();
                    }
                });


            alertDialog.show();

            }
        });
    }
}
