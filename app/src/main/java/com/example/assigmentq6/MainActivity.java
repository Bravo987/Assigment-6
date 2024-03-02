package com.example.assigmentq6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txt;
    Button btnup,btnlow;
    TextView result ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.enterstring);
        btnup =findViewById(R.id.btnupper);
        btnlow = findViewById(R.id.btnlower);
        result = findViewById(R.id.Result);

        btnup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str;
                str = txt.getText().toString();
                result.setText(str.toUpperCase());
            }
        });
        btnlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str;
                str = txt.getText().toString();
                result.setText(str.toLowerCase());
            }
        });
    }
}