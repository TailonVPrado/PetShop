package br.unipar.model;

import java.util.ArrayList;
import java.util.Date;

public class ProprietarioAnimal extends Pessoa{
    public ProprietarioAnimal(Integer id, String nome, String cpf, Date dtNasc, ArrayList<Telefone> listaTelefones, Endereco endereco) {
        super(id, nome, cpf, dtNasc, listaTelefones, endereco);
    }

    public ProprietarioAnimal() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
