package br.com.casadocodigo.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created with IntelliJ IDEA.
 * User: rodrigoalmeida
 * Date: 04/04/13
 * Time: 21:59
 * To change this template use File | Settings | File Templates.
 */
public class DashboardActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }

    public void selecionarOpcao(View view) {

        switch (view.getId()){
            case R.id.novaViagem :
                startActivity(new Intent(this, ViagemActivity.class));
                break;
            case R.id.txtNovoGasto:
                startActivity(new Intent(this, GastoActivity.class));
                break;
            case R.id.minhasViagens:
                startActivity(new Intent(this, ViagemListActivity.class));
                break;
            case R.id.config:
                startActivity(new Intent(this, ViagemListActivity.class));
                break;
        }

    }


}
