package com.example.falangi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private int Counter = 0;

    private TextView textViewPolecenie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewPolecenie = findViewById(R.id.textViewPolecenie);
    }

    public void WrongButton(View view) {
        Toast.makeText(this, "Ten kolor jest we fladze Polski", Toast.LENGTH_SHORT).show();
    }

    public void GoodButton(View view) {
        Toast.makeText(this, "Dobrze żeś kliknął", Toast.LENGTH_SHORT).show();
        view.setVisibility(View.INVISIBLE);
        Counter++;
        if (Counter == 4){
            textViewPolecenie.setText("Brawooo");
        }
    }
}