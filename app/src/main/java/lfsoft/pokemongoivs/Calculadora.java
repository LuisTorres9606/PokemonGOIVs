package lfsoft.pokemongoivs;

import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    ImageView Iperfil,PEvolucion,SEvolucion,TEvolucion;
    EditText Puntos;
    TextView Tnombre,CPuntos1,CPuntos2,CPuntos3,CPuntos4;
    String Nom [];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secundario);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Resources res = getResources();
        TypedArray Ima;
        Nom = res.getStringArray(R.array.pokemon);
        Ima = res.obtainTypedArray(R.array.Imagenes);

        //////
        Iperfil = (ImageView)findViewById(R.id.Perfil);
        Tnombre = (TextView)findViewById(R.id.NombrePerfil);
        Puntos = (EditText)findViewById(R.id.Puntos);
        /////
        PEvolucion = (ImageView)findViewById(R.id.Pri);
        SEvolucion = (ImageView)findViewById(R.id.Seg);
        TEvolucion = (ImageView)findViewById(R.id.Tre);
        //////
        CPuntos1 = (TextView) findViewById(R.id.CP1);
        CPuntos2 = (TextView)findViewById(R.id.CP2);
        CPuntos3 = (TextView)findViewById(R.id.CP3);
        CPuntos4 = (TextView)findViewById(R.id.CP4);
        //////

        Bundle b = getIntent().getExtras();
        int Position = 0; // or other values
        if(b != null)
            Position = b.getInt("position");
        //////
        Tnombre.setText(Nom[Position]);
        Iperfil.setImageDrawable(Ima.getDrawable(Position));


        switch(Position) {
            case 0: case 3: case 6: case 9: case 12: case 15: case 28: case 31: case 42: case 59: case 62: case 65: case 68:case 73: case 91: case 146:
                PEvolucion.setImageDrawable(Ima.getDrawable(Position+1));
                SEvolucion.setImageDrawable(Ima.getDrawable(Position+2));
                break;
            case 1: case 4: case 7: case 10: case 13: case 16: case 29: case 32: case 43:case 60: case 63: case 66: case 69:case 74: case 92: case 147:
                PEvolucion.setImageDrawable(Ima.getDrawable(Position-1));
                SEvolucion.setImageDrawable(Ima.getDrawable(Position+1));
                break;
            case 2: case 5: case 8: case 11: case 14: case 17: case 30: case 33: case 44:case 61: case 64: case 67: case 70:case 75: case 93: case 148:
                PEvolucion.setImageDrawable(Ima.getDrawable(Position-2));
                SEvolucion.setImageDrawable(Ima.getDrawable(Position-1));
                break;
            case 132:
                PEvolucion.setImageDrawable(Ima.getDrawable(Position+1));
                SEvolucion.setImageDrawable(Ima.getDrawable(Position+3));
                TEvolucion.setImageDrawable(Ima.getDrawable(Position+2));
                break;
            case 18: case 20: case 22: case 24: case 26: case 34: case 36: case 38: case 40:case 45: case 47: case 49: case 51:case 53:
            case 55: case 57: case 71: case 76: case 78: case 80: case 83: case 85: case 87:case 89: case 95: case 97: case 99: case 101: case 103:
            case 108: case 110: case 115: case 117: case 119: case 128: case 137: case 139:
                TEvolucion.setImageDrawable(Ima.getDrawable(Position+1));
                break;
            case 19: case 21: case 23: case 25: case 27: case 35: case 37: case 39: case 41:case 46: case 48: case 50: case 52:case 54:
            case 56: case 58: case 72: case 77: case 79: case 81: case 84: case 86: case 88:case 90: case 96: case 98: case 100: case 102: case 104:
            case 109: case 111: case 116: case 118: case 120: case 129: case 138: case 140:
                TEvolucion.setImageDrawable(Ima.getDrawable(Position-1));
                break;
            case 82: case 94:case 105: case 106: case 107: case 112: case 113: case 114: case 121: case 122: case 123: case 124: case 125: case 126:
            case 127: case 130: case 131: case 133: case 134: case 135: case 136: case 141: case 142: case 143: case 144: case 145:case 149: case 150:
                CPuntos4.setText("No Tiene Evoluciones Registradas");
        }



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        final int finalPosition = Position;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Intent intent = new Intent(Calculadora.this,Pokedex.class );
                intent.putExtra("position", finalPosition);
                startActivity(intent);
            }
        });

    }
}
