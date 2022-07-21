package com.example.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaring Widgets
    EditText editTextNumber;
    TextView textView, textView2, textView4, valueOfPounds;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Intializaling the widgets
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        valueOfPounds = findViewById(R.id.valueOfPounds);

        editTextNumber = findViewById(R.id.editTextNumber);
        button =findViewById(R.id.button);

        //Adding an click event for the button (Executing The convert method when clicked)
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Calling ConvertFromKiloToPound Method
                ConvertFromKiloToPound();
            }
        });

    }

    private void ConvertFromKiloToPound() {
        // tHIS METHOD will convert
        // From kilo to pounds

        String valueEnteredinKILO = editTextNumber.getText().toString();

        //converting string to number
        double Kilo = Double.parseDouble(valueEnteredinKILO);
        //converting kilo to pounds
        double pounds = Kilo * 2.205;

        // displaying the value in text view
        valueOfPounds.setText("" + pounds);
    }
}