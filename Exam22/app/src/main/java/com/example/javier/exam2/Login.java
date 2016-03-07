package com.example.javier.exam2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Login extends Activity {

    private TextView text1, text2, text3;
    private EditText edit1, edit2;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        edit1 = (EditText) findViewById(R.id.user);
        edit2 = (EditText) findViewById(R.id.pass);
        btn1 = (Button) findViewById(R.id.button);
        text3 = (TextView) findViewById(R.id.text3);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");

        text1.setTypeface(custom_font);
        text2.setTypeface(custom_font);
        edit1.setTypeface(custom_font);
        edit2.setTypeface(custom_font);
        btn1.setTypeface(custom_font);
        text3.setTypeface(custom_font);

    }


    public void enter(View view){
        Intent intent = new Intent(this,enter.class);
        startActivity(intent);
    }



}
