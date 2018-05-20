package com.example.acme.csci3130_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String STR = "Hello World!";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** This method displays the entered text on screen
     *      bt1 = button
     *      txt1 =  textbox to enter text
     *      disp1 = he display box where the entered text will be displayed
     *          after clicking the button.
     */

    public void sendMessage(View view) {
        //display message when btn1 is clicked
        EditText txt = (EditText) findViewById(R.id.txt1);
        String msg = txt.getText().toString();

        TextView disp = findViewById(R.id.disp1);
        disp.setText(msg);

    }


}
