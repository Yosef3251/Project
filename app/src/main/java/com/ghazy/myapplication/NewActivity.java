package com.ghazy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

public class NewActivity extends AppCompatActivity {
    public static final int PICK_IMAGE = 1;

    @SuppressLint("MissingSuperCall")
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (requestCode == PICK_IMAGE) {
            //TODO: action
        }
    }
    Button secondactivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        secondactivity=findViewById(R.id.btnSwap2);
        secondactivity.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent i=new Intent(NewActivity.this,MainActivity.class);
                startActivity(i);
                    finish();
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE);


            }




        });
    }
}