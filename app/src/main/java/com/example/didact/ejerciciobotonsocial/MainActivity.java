package com.example.didact.ejerciciobotonsocial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        //Crear las variable de las vistas que vamos a identificar
    TextView tvPrincipal, tvResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Identificamos las vistas
        tvPrincipal = (TextView)findViewById(R.id.tvPrincipal);
        tvResultado = (TextView)findViewById(R.id.tvResultado);





    }//Fin onCreate

    public void clickbotonFacebook(View view){
        tvPrincipal.setText("Compartir en Facebook");
    }

    public void clickbotonTwitter(View view){
        tvPrincipal.setText("Compartir en Twitter");
    }

    public void clickbotonInstagram(View view){
        tvPrincipal.setText("Compartir en Instagram");
    }

    public void clickbotonResultado(View view) {
        String etiquetaSeleccionada = tvPrincipal.getText().toString();
        tvResultado.setText(etiquetaSeleccionada);
        tvPrincipal.setText("");
        
    }


}//Fin MainActivity
