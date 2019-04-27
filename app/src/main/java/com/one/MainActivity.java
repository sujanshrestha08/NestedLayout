package com.one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etFirst, etSecond;
    private Button btnCalc;
    private TextView tvOutput;
    private RadioButton etSum, etSub, etMul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etFirst = findViewById(R.id.etFirst);
        etSecond = findViewById(R.id.etSecond);
        btnCalc = findViewById(R.id.btnCalculate);
        etSum = findViewById(R.id.etSum);
        etSub = findViewById(R.id.etSub);
        etMul = findViewById(R.id.etMul);
        tvOutput = findViewById(R.id.tvoutput);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(etFirst.getText().toString());
                int second = Integer.parseInt(etSecond.getText().toString());
                int sum = first + second;

                tvOutput.setText(Integer.toString(sum));
            }
        });

    }

}

