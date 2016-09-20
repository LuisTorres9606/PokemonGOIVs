package lfsoft.pokemongoivs;


import android.app.SearchManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * Luis Fernando Torres Calderón
 */
public class Search extends AppCompatActivity {

    Animation open,close,clock,anticlock,view_o,view_c;
    boolean isOpen = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_pokemon);

        final FloatingActionButton CGeneracion = (FloatingActionButton) findViewById(R.id.More);
        final FloatingActionButton Segunda = (FloatingActionButton) findViewById(R.id.Segunda);
        final FloatingActionButton Tercera = (FloatingActionButton) findViewById(R.id.Tercera);
        final FloatingActionButton Cuarta = (FloatingActionButton) findViewById(R.id.Cuarta);
        final FloatingActionButton Quinta = (FloatingActionButton) findViewById(R.id.Quinta);
        final FloatingActionButton Sexta = (FloatingActionButton) findViewById(R.id.Sexta);
        clock = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_clock);
        anticlock = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_anticlock);
        open = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.close);
        close = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.open);
        view_o = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.view_o);
        view_c = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.view_c);

        final TextView GS = (TextView)findViewById(R.id.GS) ;
        final TextView GT = (TextView)findViewById(R.id.GT) ;
        final TextView GC = (TextView)findViewById(R.id.GC) ;
        final TextView GQ = (TextView)findViewById(R.id.GQ) ;
        final TextView GSX = (TextView)findViewById(R.id.GSX) ;

        CGeneracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (isOpen){
                    CGeneracion.startAnimation(clock);
                    Segunda.startAnimation(close);Segunda.setClickable(true);
                    GS.startAnimation(view_o);
                    Tercera.startAnimation(close);Tercera.setClickable(true);
                    GT.startAnimation(view_o);
                    Cuarta.startAnimation(close);Cuarta.setClickable(true);
                    GC.startAnimation(view_o);
                    Quinta.startAnimation(close);Quinta.setClickable(true);
                    GQ.startAnimation(view_o);
                    Sexta.startAnimation(close);Sexta.setClickable(true);
                    GSX.startAnimation(view_o);
                    isOpen = false;

                }else{
                   CGeneracion.startAnimation(anticlock);
                   Segunda.startAnimation(open);Segunda.setClickable(false);
                   GS.startAnimation(view_c);
                   Tercera.startAnimation(open);Tercera.setClickable(false);
                   GT.startAnimation(view_c);
                   Cuarta.startAnimation(open);Cuarta.setClickable(false);
                   GC.startAnimation(view_c);
                   Quinta.startAnimation(open);Quinta.setClickable(false);
                   GQ.startAnimation(view_c);
                   Sexta.startAnimation(open);Sexta.setClickable(false);
                   GSX.startAnimation(view_c);
                   isOpen = true;

                }
            }
        });
        ListView listView_main = (ListView) findViewById(R.id.listado);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.pokemon));
        listView_main.setAdapter(adapter);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_principal, menu);

        SearchView searchView = (SearchView)menu.findItem(R.id.menu_search).getActionView();
        SearchManager searchManager = (SearchManager)getSystemService(SEARCH_SERVICE);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
