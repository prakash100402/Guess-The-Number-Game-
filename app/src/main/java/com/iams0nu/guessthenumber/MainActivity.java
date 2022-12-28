package com.iams0nu.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    int randomnumber;



    public void generate(){

    Random r = new Random();
   randomnumber = r.nextInt(50)+1;
    }


    public void guess (View view){
        EditText editText = (EditText) findViewById(R.id.editText);


    int enter_value = Integer.parseInt(editText.getText().toString());

    String message;


    if(enter_value> randomnumber)
    {
        message="Lower!";
    }
    else if (enter_value< randomnumber)
    {
        message="Higher!";
    }
    else
    {
        message="You got it ^_^";
        generate();
    }
    Toast.makeText(this,message,Toast.LENGTH_LONG).show();

}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generate();

    }
}