 package com.example.android_2;

import androidx.appcompat.app.AppCompatActivity;

//import android.annotation.SuppressLint;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//import java.util.stream.IntStream;

 public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3;
    TextView tx1,tx2;

    EditText et;

    float price= 2.4f;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=findViewById(R.id.bt_minus);
        bt2=findViewById(R.id.bt_plus);
        bt3=findViewById(R.id.bt_order);
        tx1=findViewById(R.id.tv);
        tx2=findViewById(R.id.tv_pr);
        et=findViewById(R.id.edit);
        bt1.setOnClickListener(view -> {
            int quantity=Integer.parseInt(tx1.getText().toString());
            if(quantity>0)
            {
                quantity--;
                tx1.setText(quantity+"");
            }
                }
        );
        bt2.setOnClickListener(view ->
        {
            int quantity=Integer.parseInt(tx1.getText().toString());
            quantity++;
            tx1.setText(quantity+"");
        });
        bt3.setOnClickListener(view -> {
            int order=Integer.parseInt(tx1.getText().toString());
            tx2.setText((order*price)+"");
        });
    }
}