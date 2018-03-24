package com.example.lenovo.imcalculette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static java.lang.Math.pow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BTN1 = (Button) findViewById(R.id.butt1);
        final android.widget.Spinner Spn1 = (android.widget.Spinner)findViewById(R.id.Spinner1);
        //CheckBox Cb1 = (CheckBox) findViewById(R.id.checkB1);
        //CheckBox Cb2 = (CheckBox) findViewById(R.id.checkB2);
        final EditText ETxt1 = (EditText) findViewById(R.id.editT1);
        final EditText ETxt2 = (EditText) findViewById(R.id.editT2);
        final EditText ETxt3 = (EditText) findViewById(R.id.editT3);
        final TextView Tview1 = (TextView) findViewById(R.id.TxtV1);
        final TextView Tview2 = (TextView) findViewById(R.id.TxtV2);



        BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Log.i("Tagggggg",ETxt1.getText().toString().trim());
                if (ETxt1.getText().toString().isEmpty() || ETxt2.getText().toString().isEmpty() || ETxt3.getText().toString().isEmpty() ) {
                    Toast.makeText(getApplicationContext(),R.string.ErrorMsg,Toast.LENGTH_LONG).show();
                }
                else {
                    int pos = Spn1.getSelectedItemPosition();
                    float V0 = Float.parseFloat(ETxt1.getText().toString().trim());
                    if (V0 > 18) {

                            float V1 = Integer.parseInt(ETxt2.getText().toString().trim());

                            float V2 = Integer.parseInt(ETxt3.getText().toString().trim());
                            float Resultat = V2 / ((V1 / 100) * (V1 / 100));
                            Tview1.setText("Votre IMC " + Resultat + " Kg/m2");

                            if (Resultat < 16) {
                                Tview2.setText(" ==> Anorxie ou dénutrition <==");
                            } else if (16 < Resultat && Resultat < 18.5) {
                                Tview2.setText("==> Maigreur <==");
                            } else if (18.5 < Resultat && Resultat < 25) {
                                Tview2.setText("==> Corpulation normale <==");
                            } else if (25 < Resultat && Resultat < 30) {
                                Tview2.setText("==> Surpoids <==");
                            } else if (30 < Resultat && Resultat < 35) {
                                Tview2.setText("==> Obésité modérée classe 1 <==");
                            } else if (35 < Resultat && Resultat < 40) {
                                Tview2.setText("==> Obésité élevée classe 2 <==");
                            } else if (Resultat > 40) {
                                Tview2.setText("==> Obésité massive <==");
                            }

                        } else {
                            Tview1.setText("NULL");
                            Tview2.setText("Vous n'êtes pas adulte, veuillez consulter le lien suivant \n https://www.calculersonimc.fr/imc-enfant.html ");
                        }
                    }

                }
        });


    }
}