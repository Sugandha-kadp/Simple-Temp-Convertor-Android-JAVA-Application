package com.example.tempcal2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtInput;
    RadioGroup radioGroup;
    RadioButton rdCelcius , rdFahrenhite;
    Button btnCal;
    TextView txtAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         edtInput = findViewById(R.id.edtInput);
         radioGroup = findViewById(R.id.radioGroup);
         rdCelcius = findViewById(R.id.rdCelcius);
         rdFahrenhite = findViewById(R.id.rdFahrenhite);
         btnCal = findViewById(R.id.btnCal);
         txtAns = findViewById(R.id.txtAns);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    public void calculateAns(View view){
        String value = edtInput.getText().toString();
        float ans;

        if(TextUtils.isEmpty(value)){
            Toast.makeText(this, "Please Enter Value ! ", Toast.LENGTH_SHORT).show();
        }else {
            Float temp = Float.parseFloat(value);
            Calculations cal = new Calculations();

            if (rdCelcius.isChecked()){
                //implement when Celciusos rd button is checked
                ans = cal.convertCelciusToFahrenheit(temp);

            }else if (rdFahrenhite.isChecked()){
                //implement when Fahrenhite rd button is checked
                ans = cal.convertFahrenheitToCelcius(temp);

            }else {
                Toast.makeText(this, "Please select Temp type ! ", Toast.LENGTH_SHORT).show();
                ans = 0.0f;
            }

            txtAns.setText(new Float(ans).toString());

        }
    }



}