package com.example.conversordetemp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
        //Declarando váriaveis que vão ser utilizadas nesta tela
    TextView tvF, tvK;
    Button btnvoltar;

        //pegando o id do activity_main2.xml e vinculando-os
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvF = findViewById(R.id.tvF);
        tvK = findViewById(R.id.tvK);
        btnvoltar = findViewById(R.id.btnvoltar);

        //Instanciando classes para pegar os valores da outra tela
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        //convertendo String para double e inserindo as formulas para os calculos
        double Temp = Double.parseDouble(bundle.getString("Temp")) ;
        double FormF = (Temp * 9 / 5) + 32;
        double FormK = Temp + 273.15;


        //exibindo o resultado
        tvF.setText(FormF + "°F");
        tvK.setText(FormK + "°K");

        btnvoltar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
}