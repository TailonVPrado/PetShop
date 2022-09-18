package br.unipar.model;

import java.util.ArrayList;
import java.util.Date;

public class MedicoVet extends Pessoa{
    private Integer nrCRm;
    private String especializacao;

    
    public MedicoVet() {
    }

    public MedicoVet(Integer id, String nome, String cpf, Date dtNasc, ArrayList<Telefone> listaTelefones, Endereco endereco) {
        super(id, nome, cpf, dtNasc, listaTelefones, endereco);
    }
 
    public Integer getNrCRm() {
        return nrCRm;
    }

    public void setNrCRm(Integer nrCRm) {
        this.nrCRm = nrCRm;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public String toString() {
        return "MedicoVet{" +super.toString()+ ", nrCRm=" + nrCRm + ", especializacao=" + especializacao +'}';
    }
}
