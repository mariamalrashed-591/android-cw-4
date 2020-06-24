package com.example.day4;

import androidx.appcompat.app.AppCompatActivity;

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

        final EditText numberone = findViewById(R.id.num1);
        final EditText numbertwo = findViewById(R.id.num2);
        Button addition = findViewById(R.id.add);
        Button subtraction = findViewById(R.id.sub);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x = numberone.getText().toString();
                String y = numbertwo.getText().toString();
                int num1 = Integer.parseInt(x);
                int num2 = Integer.parseInt(y);

                int results = num1 +num2;
                Toast.makeText(MainActivity.this, "addition:" +results, Toast.LENGTH_LONG).show();
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x = numberone.getText().toString();
                String y = numbertwo.getText().toString();
                int num1 = Integer.parseInt(x);
                int num2 = Integer.parseInt(y);

                int results = num1 -num2;
                Toast.makeText(MainActivity.this, "Subtraction:" +results, Toast.LENGTH_LONG).show();
    }

        });

}
    }

