package com.example.giaodien_317;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ketQua extends AppCompatActivity {

    TextView out  = findViewById(R.id.outPut);
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_qua);
        btnBack = (Button) findViewById(R.id.back);
        TextView out  = findViewById(R.id.outPut);
        Intent caIntent = getIntent();
        Bundle pBundle = caIntent.getBundleExtra("app");
        double a = pBundle.getDouble("getW");
        double b = pBundle.getDouble("getH");
        double bmi = a / ((b/100)*(b/100));
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}