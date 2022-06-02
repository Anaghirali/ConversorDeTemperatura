package com.example.conversordetemp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //Declaração das váriaveis
    EditText edtTemp;
    Button btnTela2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Conectando as váriaveis por IDs
        edtTemp = findViewById(R.id.edtTemp);
        btnTela2 = findViewById(R.id.btnTela2);


        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

        //Criando uma intent e mandando a String Temp para a tela 2
                String Temp = edtTemp.getText().toString();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putString("Temp",Temp);


                intent.putExtras(bundle);
                startActivity(intent);


            }
        });








    }
}