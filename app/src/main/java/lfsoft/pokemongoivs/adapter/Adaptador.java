package lfsoft.pokemongoivs.adapter;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import lfsoft.pokemongoivs.R;


/**
 * Luis Fernando Torres Calderón
 */
public class Adaptador extends BaseAdapter {
    private Context mContext;

    public Adaptador(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return pokedex.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(250,250));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(15, 20, 20, 15);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(pokedex[position]);

        return imageView;
    }
    // references to our images
    private Integer[] pokedex = {
            R.drawable.bulbasaur, R.drawable.ivysaur,R.drawable.venusaur,
            R.drawable.charmander, R.drawable.charmeleon, R.drawable.charizard,
            R.drawable.squirtle, R.drawable.wartortle,R.drawable.blastoide,
            R.drawable.caterpie, R.drawable.metapod, R.drawable.butterfly,
            R.drawable.weedle, R.drawable.kakuna,R.drawable.beedrill,

            R.drawable.pidgey, R.drawable.pidgeotto, R.drawable.pidgeot,
            R.drawable.rattata,R.drawable.raticate, R.drawable.spearow,
            R.drawable.fearow, R.drawable.ekans, R.drawable.arbok,
            R.drawable.pikachu, R.drawable.raichu,R.drawable.sandshrew,

            R.drawable.sandslash, R.drawable.nidoran, R.drawable.nidorina,
            R.drawable.nidoqueen, R.drawable.nidorans,R.drawable.nidorino,
            R.drawable.nidoking, R.drawable.clefairy, R.drawable.clefable,
            R.drawable.vulpix, R.drawable.ninetales,
            R.drawable.jigglypuff, R.drawable.wigglytuff,R.drawable.zubat,

            R.drawable.golbat,R.drawable.oddish, R.drawable.gloom,
            R.drawable.vileplume, R.drawable.paras, R.drawable.parasect,
            R.drawable.venonat, R.drawable.venomoth,
            R.drawable.diglett,R.drawable.dugtrio, R.drawable.meowth,
            R.drawable.persian, R.drawable.psyduck, R.drawable.golduck,

            R.drawable.mankey,R.drawable.primeape, R.drawable.growlithe,
            R.drawable.arcanine, R.drawable.poliwag, R.drawable.poliwhrl,
            R.drawable.poliwrath,R.drawable.abra, R.drawable.kadabra,
            R.drawable.alakazam, R.drawable.machop, R.drawable.machoke,

            R.drawable.machamp,R.drawable.bellsprout, R.drawable.weepinbell,
            R.drawable.victreebel, R.drawable.tentacool, R.drawable.tentacruel,
            R.drawable.geodude,R.drawable.graveler, R.drawable.golem,
            R.drawable.ponyta, R.drawable.rapidash, R.drawable.slowpoke,

            R.drawable.slowbro,R.drawable.magnemite, R.drawable.magneton,
            R.drawable.farfetchd, R.drawable.doduo, R.drawable.dodrio,
            R.drawable.seel,R.drawable.dewgong, R.drawable.grimer,
            R.drawable.muk, R.drawable.shellder, R.drawable.cloyster,

            R.drawable.gastly,R.drawable.haunter, R.drawable.gengar,
            R.drawable.onix, R.drawable.drowzee, R.drawable.hypno,
            R.drawable.krabby,R.drawable.kingler, R.drawable.voltorb,
            R.drawable.electroide, R.drawable.exeggcute, R.drawable.exeggutor,

            R.drawable.cubone,R.drawable.marowak, R.drawable.hitmonlee,
            R.drawable.hitmonchan, R.drawable.lickitung, R.drawable.koffing,
            R.drawable.weezing,R.drawable.rhyhorm, R.drawable.rhydon,
            R.drawable.chansey, R.drawable.tangela, R.drawable.kangaskhan,

            R.drawable.horsea,R.drawable.seadra, R.drawable.golden,
            R.drawable.seaking, R.drawable.staryu, R.drawable.starmie,
            R.drawable.mr_mine,R.drawable.scyther, R.drawable.jynx,R.drawable.electabuzz,
            R.drawable.magmar, R.drawable.pinsir, R.drawable.tauros,

            R.drawable.magikarp,R.drawable.gyarados, R.drawable.lapras,
            R.drawable.ditto, R.drawable.eevee, R.drawable.vaporeon,
            R.drawable.jolteon,R.drawable.flareon,
            R.drawable.porygon, R.drawable.omanyte, R.drawable.omastar,
            R.drawable.kabuto, R.drawable.kabutops,

            R.drawable.aerodactyl,R.drawable.snorlax, R.drawable.articuno,
            R.drawable.zapdos, R.drawable.moltres, R.drawable.dratini,
            R.drawable.dragonair,R.drawable.dragonite, R.drawable.mewtwo,
            R.drawable.mew
    };
}
