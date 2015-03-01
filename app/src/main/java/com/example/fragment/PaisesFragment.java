package com.example.fragment;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.caxas.fragmentbookbiblio.R;

/**
 * Created by henryyerrybravosanchez on 2/25/15.
 */
public class PaisesFragment extends ListFragment{
    String[] paises={
            "Peru",
            "Argentina",
            "Mexico",
            "Bolivia",
            "Chile",
            "Brazil",
            "España"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        //relacionamos la lista con el layout
        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, paises));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
       // Toast.makeText(getActivity(),"pais eleegido en la lista: "+paises[position], Toast.LENGTH_LONG).show();
        String paisE=paises[position];
        DetalleFragment fragment=(DetalleFragment)getFragmentManager().findFragmentById(R.id.detalleFragment);

        if(fragment!=null&&fragment.isInLayout()){
            fragment.setPaisElegido(paisE);
        }else {
            Intent intent= new Intent(getActivity(), DetalleActivity.class);
            intent.putExtra("pais", paisE);
            startActivity(intent);
        }
    }

    
}
