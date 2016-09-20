package lfsoft.pokemongoivs;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SearchResult extends AppCompatActivity {

    String query;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_result);

        Intent searchIntent = getIntent();
        if(Intent.ACTION_SEARCH.equals(searchIntent.getAction())) {
            query = searchIntent.getStringExtra(SearchManager.QUERY);
            getSupportActionBar().setTitle(query);
            Toast.makeText(SearchResult.this, "Resultados con: "+ query, Toast.LENGTH_SHORT).show();
        }


        String[] countries = getResources().getStringArray(R.array.pokemon);
        ArrayList<String> searchResults = new ArrayList<String>();
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].toLowerCase().contains(query.toLowerCase()))
                searchResults.add(countries[i]);
        }

        ListView listView_search_results = (ListView) findViewById(R.id.resultado);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, searchResults);
        listView_search_results.setAdapter(adapter);
    }
}
