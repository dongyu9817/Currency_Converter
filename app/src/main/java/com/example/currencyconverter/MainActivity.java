package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction (View view){
        Log.i("Info", "button pressed" );
        EditText myTextField = (EditText) findViewById (R.id.myTextField);
        // Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        String str = myTextField.getText().toString();
        gotoActivity2(str);
    }

    public void gotoActivity2 (String s){
        Intent intent = new Intent (this,Main2Activity.class);
        intent.putExtra("message", s);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
