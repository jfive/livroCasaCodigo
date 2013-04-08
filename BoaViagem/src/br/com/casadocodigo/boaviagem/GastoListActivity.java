package br.com.casadocodigo.boaviagem;

import android.*;
import android.R;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rodrigoalmeida
 * Date: 08/04/13
 * Time: 19:37
 * To change this template use File | Settings | File Templates.
 */
public class GastoListActivity extends ListActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(this, R.layout.simple_list_item_1, listarGastos()));
        ListView listView = getListView();
        listView.setOnItemClickListener(this);
    }

    private List<String> listarGastos() {
        return Arrays.asList("Sanduíche R$ 19,90", "Taxi Aeroporto - Hotel R$ 34,00", "Revista R$ 12,00");
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView textView = (TextView) view;
        String mensagem = "Gasto Selecionado: " + textView.getText();
        Toast.makeText(getApplicationContext(), mensagem, Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, GastoListActivity.class));
    }
}
