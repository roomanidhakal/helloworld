package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    public static final String TAG = "MainActivity"; //for debugging

    private Button count;
    private Button toast;
    private TextView textView;
    private int countNum;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = findViewById(R.id.count);
        toast = findViewById(R.id.toast);
        textView = findViewById(R.id.text);

//        count.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                countNum++;
//                textView.setText(""+countNum);
//            }
//        });
//
//        toast.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    public void count(View view)
    {
        countNum++;
        textView.setText(""+countNum);
    }

    public void toast(View view)
    {
        Toast.makeText(MainActivity.this, "Thia is a toast", Toast.LENGTH_SHORT).show();
    }
}
