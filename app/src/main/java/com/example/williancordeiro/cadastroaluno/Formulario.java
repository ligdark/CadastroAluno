package com.example.williancordeiro.cadastroaluno;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RatingBar;

import cadastro.modelo.Aluno;

/**
 * Created by willian.cordeiro on 01/06/2015.
 */
public class Formulario extends Activity {
    private FormularioHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario);

        helper = new FormularioHelper(this);

        Aluno aluno = helper.pegaAlunoDoFormulario();
    }
}
