package com.app.saintjimmy.iphome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ReceitaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receita);
        Toolbar toolbarReceita = findViewById(R.id.toolbarReceita);
        setSupportActionBar(toolbarReceita);
    }
}
