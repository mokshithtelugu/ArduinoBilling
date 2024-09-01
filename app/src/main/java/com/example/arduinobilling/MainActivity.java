package com.example.arduinobilling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView qty,price,one,two,three,four,total,title;
    Button button;
    EditText q1,q2,q3,q4,p1,p2,p3,p4,tq,tp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qty = findViewById(R.id.textView10);
        price = findViewById(R.id.textView11);
        title = findViewById(R.id.textView);
        one = findViewById(R.id.textView5);
        two = findViewById(R.id.textView6);
        three = findViewById(R.id.textView7);
        four = findViewById(R.id.textView8);
        total = findViewById(R.id.textView9);

        q1 = findViewById(R.id.editTextNumber2);
        q2 = findViewById(R.id.editTextNumber3);
        q3 = findViewById(R.id.editTextNumber4);
        q4 = findViewById(R.id.editTextNumber11);
        p1 = findViewById(R.id.editTextNumber9);
        p2 = findViewById(R.id.editTextNumber7);
        p3 = findViewById(R.id.editTextNumber8);
        p4 = findViewById(R.id.editTextNumber6);
        tq = findViewById(R.id.editTextNumber10);
        tp = findViewById(R.id.editTextNumber5);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1.setText(String.valueOf(Integer.parseInt(q1.getText().toString())*700));
                p2.setText(String.valueOf(Integer.parseInt(q2.getText().toString())*150));
                p3.setText(String.valueOf(Integer.parseInt(q3.getText().toString())*300));
                p4.setText(String.valueOf(Integer.parseInt(q4.getText().toString())*400));

                tq.setText(
                        String.valueOf(
                                Integer.parseInt(q1.getText().toString())+Integer.parseInt(q2.getText().toString())+Integer.parseInt(q3.getText().toString())+Integer.parseInt(q4.getText().toString())
                        )
                );

                tp.setText(
                        String.valueOf(
                                Integer.parseInt(p1.getText().toString())+Integer.parseInt(p2.getText().toString())+Integer.parseInt(p3.getText().toString())+Integer.parseInt(p4.getText().toString())
                        )
                );
            }
        });
    }
}