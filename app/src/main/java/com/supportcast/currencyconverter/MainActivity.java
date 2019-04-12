package com.supportcast.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getConversion(View view) {
        // get user currency
        EditText currencyEditText = (EditText)findViewById(R.id.currencyEditText);
        Double currencyInput = Double.parseDouble(currencyEditText.getText().toString());

        // use capital Double to use toString() method
        Double convertedCurrency = currencyInput * 0.7649;

        Toast.makeText(getApplicationContext(), convertedCurrency.toString(), Toast.LENGTH_LONG).show();
    }
}
