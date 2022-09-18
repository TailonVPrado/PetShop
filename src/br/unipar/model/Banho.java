package br.unipar.model;

import java.util.Date;

public class Banho {
    private Integer id;
    private Tosa tosa;
    private Date dtBanho;
    private Double vlBanho = 0.0;

    public Banho() {
    }

    public Banho(Integer id, Tosa tosa, Date dtBanho) {
        this.id = id;
        this.tosa = tosa;
        this.dtBanho = dtBanho;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Tosa getTosa() {
        return tosa;
    }

    public void setTosa(Tosa tosa) {
        this.tosa = tosa;
    }

    public Date getDtBanho() {
        return dtBanho;
    }

    public void setDtBanho(Date dtBanho) {
        this.dtBanho = dtBanho;
    }

    public Double getVlBanho() {
        return vlBanho;
    }

    public void setVlBanho(Double vlBanho) {
        this.vlBanho = vlBanho;
    }

    @Override
    public String toString() {
        return "Banho{" + "id=" + id + ", tosa=" + tosa + ", dtBanho=" + dtBanho + ", vlBanho=" + vlBanho + '}';
    }    
}
