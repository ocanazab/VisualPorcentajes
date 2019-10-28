package com.nachobazan.visualporcentajes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button miBotonA;
    private Button miBotonB;
    private Button miBotonC;
    private Button miBotonD;
    private Button miBotonE;
    private Button miBotonF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializamos los botones
        inicializaBotones();

        //Creamos los distintos escuchadores para cada botón.
        miBotonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Has pulsado el botón A",Toast.LENGTH_SHORT).show();
            }
        });
        miBotonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Has pulsado el botón B",Toast.LENGTH_SHORT).show();
            }
        });
        miBotonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Has pulsado el botón C",Toast.LENGTH_SHORT).show();
            }
        });
        miBotonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Has pulsado el botón D",Toast.LENGTH_SHORT).show();
            }
        });
        miBotonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Has pulsado el botón E",Toast.LENGTH_SHORT).show();
            }
        });
        miBotonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Has pulsado el botón F",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void inicializaBotones(){
        miBotonA=findViewById(R.id.botonA);
        miBotonB=findViewById(R.id.botonB);
        miBotonC=findViewById(R.id.botonC);
        miBotonD=findViewById(R.id.botonD);
        miBotonE=findViewById(R.id.botonE);
        miBotonF=findViewById(R.id.botonF);
    }
}
