package lfsoft.pokemongoivs;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Luis Fernando Torres Calderón
 */
public class Pokedex extends AppCompatActivity {
    String Nombre [];
    ImageView Nick;
    TextView Nombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pokedex);


        Bundle b = getIntent().getExtras();
        int Position = 0; // or other values
        if(b != null)
            Position = b.getInt("position");



        Resources res = getResources();
        TypedArray Ima;
        Nombre = res.getStringArray(R.array.pokemon);
        Ima = res.obtainTypedArray(R.array.Imagenes);

        Nick = (ImageView)findViewById(R.id.Nick);
        Nombres = (TextView)findViewById(R.id.Nombres);

        Nombres.setText(Nombre[Position]);
        Nick.setImageDrawable(Ima.getDrawable(Position));
    }
}
