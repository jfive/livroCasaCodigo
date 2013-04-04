package br.com.casadocodigo.boaviagem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created with IntelliJ IDEA.
 * User: rodrigoalmeida
 * Date: 02/04/13
 * Time: 23:07
 * To change this template use File | Settings | File Templates.
 */
public class BoaViagemActivity extends Activity {

    private EditText usuario;
    private EditText senha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        this.usuario = (EditText) findViewById(R.id.usuario);
        this.senha = (EditText) findViewById(R.id.senha);

    }

    public void entrarOnCick(View v) {
        String usuarioInformado = usuario.getText().toString();
        String senhaInformado = usuario.getText().toString();

        if("leitor".equals(usuarioInformado) && "123".equals(senhaInformado)){

        } else {
            String messageErro = getString(R.string.erro_autenticacao);
            Toast toast = Toast.makeText(this,messageErro,Toast.LENGTH_SHORT);
            toast.show();
        }


    }


}
