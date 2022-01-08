package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomInt;
    public void guess(View button){

        EditText editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);

        int editInt = Integer.parseInt(editTextNumber2.getText().toString());

        String message;
         if(editInt <= randomInt) {
             message = "You Loss!!";
         } else {
             message = "You Win!!";
        }

        Toast.makeText(this, message,Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
         randomInt = rand.nextInt(50)+1;

    }
}