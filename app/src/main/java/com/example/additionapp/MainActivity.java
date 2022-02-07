package com.example.additionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Button addButton;
    TextView putView;
    EditText Number1, Number2;
    private Spinner spinner;
    private static final String[] paths = {"Pilih Tipe Excavator","Liebherr 9350", "Hitachi 2500", "Komatsu PC 1250"};
    int n1, n2, ans;
    String ans1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //list the items
        addButton = findViewById(R.id.addButton);
        putView = findViewById(R.id.putView);
        Number1 = findViewById(R.id.Number1);
        Number2 = findViewById(R.id.Number2);

        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        //add numbers when button is clicked
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //get the 2 number given by the user
                n1 = Integer.parseInt(Number1.getText().toString());

                String excavator_data = spinner.getSelectedItem().toString();
                if(excavator_data.equals("Liebherr 9350")){ ans =n1*6;}
                else if(excavator_data.equals("Hitachi 2500")){ ans = n1 * 7;}
                ans1=String.valueOf(ans);
                putView.setText(ans1);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}