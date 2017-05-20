package com.example.tincho.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int contador;
boolean contar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador =0;
        contar = false;
    }

    public void contador(View vista){

        if (contar) {
            contador ++;
        }else{ contador--;}


    TextView viu = (TextView)findViewById(R.id.textView);
    viu.setText("Contador: " + contador);
    }
    public void setContar(View vista){
        contar = !contar;
    }

}
