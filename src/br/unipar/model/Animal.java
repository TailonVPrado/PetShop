package br.unipar.model;

import java.util.Date;

public class Animal {
    private Integer id;
    private String nome;
    private Date dtNasc;
    private ProprietarioAnimal proprietarioAnimal;
    private Raca raca;
    private Enum<SexoEnum> sexo;

    public Animal() {
    }

    public Animal(Integer id, String nome, Date dtNasc, ProprietarioAnimal proprietarioAnimal, Raca raca, Enum<SexoEnum> sexo) {
        this.id = id;
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.proprietarioAnimal = proprietarioAnimal;
        this.raca = raca;
        this.sexo = sexo;
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

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public ProprietarioAnimal getPorprietarioAnimal() {
        return proprietarioAnimal;
    }

    public void setPorprietarioAnimal(ProprietarioAnimal porprietarioAnimal) {
        this.proprietarioAnimal = porprietarioAnimal;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Enum<SexoEnum> getSexo() {
        return sexo;
    }

    public void setSexo(Enum<SexoEnum> sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nome=" + nome + ", dtNasc=" + dtNasc + ", proprietarioAnimal=" + proprietarioAnimal + ", raca=" + raca + ", sexo=" + sexo + '}';
    }
    
}
