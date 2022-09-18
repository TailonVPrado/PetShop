package br.unipar.model;

import java.util.Date;

public class Exame {
    private Integer id;
    private String dsExame;
    private Enum<ExameEnum> tpExame;
    private Date dtExame;
    private Double vlExame = 0.0;

    public Exame() {
    }

    public Exame(Integer id, String dsExame, Enum<ExameEnum> tpExame, Date dtExame, Double vlExame) {
        this.id = id;
        this.dsExame = dsExame;
        this.tpExame = tpExame;
        this.dtExame = dtExame;
        this.vlExame = vlExame;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDsExame() {
        return dsExame;
    }

    public void setDsExame(String dsExame) {
        this.dsExame = dsExame;
    }

    public Enum<ExameEnum> getTpExame() {
        return tpExame;
    }

    public void setTpExame(Enum<ExameEnum> tpExame) {
        this.tpExame = tpExame;
    }

    public Date getDtExame() {
        return dtExame;
    }

    public void setDtExame(Date dtExame) {
        this.dtExame = dtExame;
    }

    public Double getVlExame() {
        return vlExame;
    }

    public void setVlExame(Double vlExame) {
        this.vlExame = vlExame;
    }

    @Override
    public String toString() {
        return "Exame{" + "id=" + id + ", dsExame=" + dsExame + ", tpExame=" + tpExame + ", dtExame=" + dtExame + ", vlExame=" + vlExame + '}';
    }
    
    
}
