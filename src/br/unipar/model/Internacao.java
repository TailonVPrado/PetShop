package br.unipar.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Internacao {
    private Integer id;
    private Cantinho cantinho;
    private Date dtInternacao;
    private Date dtAlta;
    private Double vlInternacao = 0.0;
    private int qtdeDiasInternado;
    public Internacao() {
    }

    public Internacao(Integer id, Cantinho cantinho, Date dtInternacao, Double vlInternacao, int qtdeDiasInternado) {
        this.id = id;
        this.cantinho = cantinho;
        this.dtInternacao = dtInternacao;
        this.vlInternacao = vlInternacao;
        this.qtdeDiasInternado = qtdeDiasInternado;
        cantinho.setStDisponivel(false);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cantinho getCantinho() {
        return cantinho;
    }

    public void setCantinho(Cantinho cantinho) {
        this.cantinho = cantinho;
        cantinho.setStDisponivel(false);
    }

    public Date getDtInternacao() {
        return dtInternacao;
    }

    public void setDtInternacao(Date dtInternacao) {
        this.dtInternacao = dtInternacao;
    }

    public Date getDtAlta() {
        return dtAlta;
    }

    public void setDtAlta(Date dtAlta) {
        this.dtAlta = dtAlta;
    }

    public Double getVlInternacao() {
        return vlInternacao;
    }

    public void setVlInternacao(Double vlInternacao) {
        this.vlInternacao = vlInternacao;
    }

    public int getQtdeDiasInternado() {
        return qtdeDiasInternado;
    }

    public void setQtdeDiasInternado(int qtdeDiasInternado) {
        this.qtdeDiasInternado = qtdeDiasInternado;
    }

    @Override
    public String toString() {
        return "Internacao{" + "id=" + id + ", cantinho=" + cantinho + ", dtInternacao=" + dtInternacao + ", dtAlta=" + dtAlta + ", vlInternacao=" + vlInternacao + ", qtdeDiasInternado=" + qtdeDiasInternado + '}';
    }
    
    public void finalizaInternacao(){
        this.cantinho.setStDisponivel(true);
        this.dtAlta = new Date();
    }
}
