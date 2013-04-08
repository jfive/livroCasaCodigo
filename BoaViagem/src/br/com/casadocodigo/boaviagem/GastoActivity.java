package br.com.casadocodigo.boaviagem;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GastoActivity extends Activity{

    private Button dataGasto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gasto);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();

        dataGasto = (Button) findViewById(R.id.data);
        dataGasto.setText(formato.format(calendar.getTime()));

    }

    public void selecionarData(View view) {
        showDialog(view.getId());
    }

}
