package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String text = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn1 = (Button)findViewById(R.id.button_1);
           btn1.setOnClickListener(this);

        Button btn2 = (Button) findViewById(R.id.button_2);
         btn2.setOnClickListener(this);

        Button btn3 = (Button) findViewById(R.id.button_3);
        btn3.setOnClickListener(this);

        Button btn4 = (Button) findViewById(R.id.button_4);
        btn4.setOnClickListener(this);

        Button btn5 = (Button) findViewById(R.id.button_5);
        btn5.setOnClickListener(this);

        Button btn6 = (Button) findViewById(R.id.button_6);
        btn6.setOnClickListener(this);

        Button btn7 = (Button) findViewById(R.id.button_7);
        btn7.setOnClickListener(this);

        Button btn8 = (Button) findViewById(R.id.button_8);
        btn8.setOnClickListener(this);

        Button btn9 = (Button) findViewById(R.id.button_9);
        btn9.setOnClickListener(this);

        Button btn0 = (Button) findViewById(R.id.button_0);
        btn0.setOnClickListener(this);

        Button btnclear = (Button) findViewById(R.id.clear_button);
        btnclear.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        //Toast t = Toast.makeText(this,"Hello",Toast.LENGTH_LONG);
      // t.show();
       // Toast t2 = Toast.makeText(this,"supakit",Toast.LENGTH_LONG);
       // t2.show();
       TextView tv = (TextView)findViewById(R.id.digit_text_view);

      int id = view.getId();

        if(text.length() != 6) {


            if (id == R.id.button_1) {
                text += "1";
                tv.setText(text);


            } else if (id == R.id.button_2) {
                text += "2";
                tv.setText(text);

            } else if (id == R.id.button_3) {
                text += "3";
                tv.setText(text);

            } else if (id == R.id.button_4) {
                text += "4";
                tv.setText(text);

            } else if (id == R.id.button_5) {
                text += "5";
                tv.setText(text);

            } else if (id == R.id.button_6) {
                text += "6";
                tv.setText(text);

            } else if (id == R.id.button_7) {
                text += "7";
                tv.setText(text);

            } else if (id == R.id.button_8) {
                text += "8";
                tv.setText(text);

            } else if (id == R.id.button_9) {
                text += "9";
                tv.setText(text);
            }
            else if (id == R.id.button_0) {
                text += "0";
                tv.setText(text);
            }


        }
          if (id == R.id.clear_button) {
              text = "";
              tv.setText(text);
        }

        }
}


