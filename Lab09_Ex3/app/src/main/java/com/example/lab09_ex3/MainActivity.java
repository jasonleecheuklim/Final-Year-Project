package com.example.lab09_ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAlert(View view){
        new AlertDialog.Builder(this)
            .setTitle("AlertDialog Title")
            .setMessage("This is a AlertDialog message")
            .setNegativeButton("Negative", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            })
            .setPositiveButton("Positive", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            })
            .setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            }).show();
    }

    public void onClickToast(View view) {
        Toast.makeText(getBaseContext(), "Hi! This is a Toast", Toast.LENGTH_LONG)
                .show();
    }



}