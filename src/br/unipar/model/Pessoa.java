package br.unipar.model;

import java.util.ArrayList;
import java.util.Date;

public class Pessoa {
    private Integer id;
    private String nome;
    private String cpf;
    private Date dtNasc;
    private boolean stAtivo;    
    private ArrayList<Telefone> listaTelefones; 
    private Endereco endereco;

    public Pessoa() {
        stAtivo = true;
    }

    public Pessoa(Integer id, String nome, String cpf, Date dtNasc, ArrayList<Telefone> listaTelefones, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.stAtivo = true;
        this.listaTelefones = listaTelefones;
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public boolean isStAtivo() {
        return stAtivo;
    }

    public void setStAtivo(boolean stAtivo) {
        this.stAtivo = stAtivo;
    }

    public ArrayList<Telefone> getListaTelefones() {
        return listaTelefones;
    }

    public void setListaTelefones(ArrayList<Telefone> listaTelefones) {
        this.listaTelefones = listaTelefones;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", dtNasc=" + dtNasc + ", stAtivo=" + stAtivo + ", listaTelefones=" + listaTelefones + ", endereco=" + endereco + '}';
    }

    
}
