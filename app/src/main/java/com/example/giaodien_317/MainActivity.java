package com.example.giaodien_317;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        EditText w = findViewById(R.id.cn);
        EditText h = findViewById(R.id.height);
        Button sum =findViewById(R.id.button_tinh);


        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kq = new Intent(MainActivity.this , ketQua.class);
                String getW = w.getText().toString();
                String getH = h.getText().toString();

                double dw = Double.parseDouble(getW);
                double dh = Double.parseDouble(getH);
                Bundle bundle1 =  new Bundle();
                bundle1.putDouble("a",dw);
                bundle1.putDouble("b",dh);
                kq.putExtra("myName",bundle1);
                startActivity(kq);
            }
        });


    }








}