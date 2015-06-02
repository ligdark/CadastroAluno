package com.example.williancordeiro.cadastroaluno;

import android.widget.EditText;
import android.widget.RatingBar;

import cadastro.modelo.Aluno;

/**
 * Created by willian.cordeiro on 02/06/2015.
 */
public class FormularioHelper {
    private EditText nome;
    private EditText site;
    private EditText telefone;
    private EditText endereco;
    private RatingBar  nota;

    public FormularioHelper(Formulario formulario) {
        nome = (EditText) formulario.findViewById(R.id.nome);
        site = (EditText) formulario.findViewById(R.id.site);
        telefone = (EditText) formulario.findViewById(R.id.telefone);
        endereco = (EditText) formulario.findViewById(R.id.endereco);
        nota = (RatingBar) formulario.findViewById(R.id.nota);
    }

    public Aluno pegaAlunoDoFormulario() {
        Aluno aluno = new Aluno();
        aluno.setNome(nome.getText().toString());
        aluno.setSite(site.getText().toString());
        aluno.setTelefone(telefone.getText().toString());
        aluno.setEndereco(endereco.getText().toString());
        aluno.setNota(Double.valueOf(nota.getRating()));

        return aluno;
    }
}
