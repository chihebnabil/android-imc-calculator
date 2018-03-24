package com.example.lenovo.imcalculette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Spinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        android.widget.Spinner Spn1 = (android.widget.Spinner)findViewById(R.id.Spinner1);
        int pos = Spn1.getSelectedItemPosition();
    }
}
