package com.example.aluno.passar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent caminhao = getIntent();
        Bundle caixa = caminhao.getExtras();
        String encomenda = caixa.getString("a");

        Toast.makeText(getBaseContext(),encomenda,Toast.LENGTH_LONG).show();
    }
}
