package com.example.konversisuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText edCelcius,edKelvin,edFarenheit,edReamur;
Button btnKonversi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edCelcius = (EditText)findViewById(R.id.input_celcius);
        edKelvin = (EditText)findViewById(R.id.input_kelvin);
        edFarenheit = (EditText)findViewById(R.id.input_farenheit);
        edReamur = (EditText)findViewById(R.id.input_reamur);

        btnKonversi = (Button)findViewById(R.id.btn_konversi);

        btnKonversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double  celcius= Double.parseDouble(String.valueOf(edCelcius.getText()));
                Double reamur =  celcius * 4/5;
                Double farenheit = celcius * 9/5 + 32;
                Double kelvin = celcius + 273;

                edReamur.setText(reamur.toString());
                edFarenheit.setText(farenheit.toString());
                edKelvin.setText(kelvin.toString());



            }
        });


    }
}
