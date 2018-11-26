package com.example.fernandolasa.myapplication;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewdado;
    private Random rng = new Random();
    private TextView contador_text, tiros;
    private Integer contador = 1;
    private Integer cantidad_tiros = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador_text = findViewById(R.id.contador);
        tiros = findViewById(R.id.tiros);
        contador_text.setText("" + contador);
        imageViewdado = findViewById(R.id.image_view_dado);
        imageViewdado.setImageResource(R.mipmap.dado1);
        imageViewdado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rolldado();
            }
        });
    }

    private void rolldado() {
        int randomNumber = rng.nextInt(6)+ 1;
        cantidad_tiros = cantidad_tiros + 1;
        tiros.setText("Tiros realizados: " + cantidad_tiros);
        switch (randomNumber) {
            case 1:
                imageViewdado.setImageResource(R.mipmap.dado1);
                contador = contador + 1;
                contador_text.setText("" + contador);
                break;
            case 2:
                imageViewdado.setImageResource(R.mipmap.dado2);
                contador = contador + 2;
                contador_text.setText("" + contador);
                break;
            case 3:
                imageViewdado.setImageResource(R.mipmap.dado3);
                contador = contador + 3;
                contador_text.setText("" + contador);
                break;
            case 4:
                imageViewdado.setImageResource(R.mipmap.dado4);
                contador = contador + 4;
                contador_text.setText("" + contador);
                break;
            case 5:
                imageViewdado.setImageResource(R.mipmap.dado5);
                contador = contador + 5;
                contador_text.setText("" + contador);
                break;
            case 6:
                imageViewdado.setImageResource(R.mipmap.dado6);
                contador = contador + 6;
                contador_text.setText("" + contador);
                //Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
