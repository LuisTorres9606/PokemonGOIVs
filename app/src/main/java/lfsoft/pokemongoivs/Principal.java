package lfsoft.pokemongoivs;


import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import lfsoft.pokemongoivs.adapter.Adaptador;

public class Principal extends AppCompatActivity {

    String [] Nombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contenedor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // LLAMA EL ARRAY DEL @STRINGS
        Resources res = getResources();
        Nombres = res.getStringArray(R.array.pokemon);

        //INICIALIZA EL FLOATING BUTTON Y LUEGO LANZA A OTRO ACTIVITY
        FloatingActionButton Cvista = (FloatingActionButton) findViewById(R.id.Add);
        Cvista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(Principal.this,Search.class );
                startActivity(Intent);
            }
        });

        //GENERA EL GRIDVIEW
        GridView gridview = (GridView) findViewById(R.id.Cuadricula);
        gridview.setAdapter(new Adaptador(this));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(Principal.this, "" + Nombres[position],
                        Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Principal.this,Calculadora.class );
                intent.putExtra("position", position);
                startActivity(intent);

            }
        });
    }

}
