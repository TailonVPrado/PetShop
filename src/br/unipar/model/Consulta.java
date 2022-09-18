package br.unipar.model;

import java.util.ArrayList;
import java.util.Date;

public class Consulta {
    private Integer id;
    private MedicoVet medico;
    private ArrayList<Exame> listaExame;
    private ArrayList<Vacina> listaVacina ;
    private ArrayList<Medicamento> listaMedicamento;
    private Internacao internacao;
    private Date dtConsulta;
    private Double vlConsulta;

    public Consulta() {
    }

    public Consulta(Integer id, MedicoVet medico, ArrayList<Exame> listaExame, ArrayList<Vacina> listaVacina, ArrayList<Medicamento> listaMedicamento, Internacao internacao, Date dtConsulta, Double vlConsulta) {
        this.id = id;
        this.medico = medico;
        this.listaExame = listaExame;
        this.listaVacina = listaVacina;
        this.listaMedicamento = listaMedicamento;
        this.internacao = internacao;
        this.dtConsulta = dtConsulta;
        this.vlConsulta = vlConsulta;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MedicoVet getMedico() {
        return medico;
    }

    public void setMedico(MedicoVet medico) {
        this.medico = medico;
    }

    public ArrayList<Exame> getListaExame() {
        return listaExame;
    }

    public void setListaExame(ArrayList<Exame> listaExame) {
        this.listaExame = listaExame;
    }

    public ArrayList<Vacina> getListaVacina() {
        return listaVacina;
    }

    public void setListaVacina(ArrayList<Vacina> listaVacina) {
        this.listaVacina = listaVacina;
    }

    public ArrayList<Medicamento> getListaMedicamento() {
        return listaMedicamento;
    }

    public void setListaMedicamento(ArrayList<Medicamento> listaMedicamento) {
        this.listaMedicamento = listaMedicamento;
    }

    public Internacao getInternacao() {
        return internacao;
    }

    public void setInternacao(Internacao internacao) {
        this.internacao = internacao;
    }

    public Date getDtConsulta() {
        return dtConsulta;
    }

    public void setDtConsulta(Date dtConsulta) {
        this.dtConsulta = dtConsulta;
    }

    public Double getVlConsulta() {
        return vlConsulta;
    }

    public void setVlConsulta(Double vlConsulta) {
        this.vlConsulta = vlConsulta;
    }

    @Override
    public String toString() {
        return "Consulta{" + "id=" + id + ", medico=" + medico + ", listaExame=" + listaExame + ", listaVacina=" + listaVacina + ", listaMedicamento=" + listaMedicamento + ", internacao=" + internacao + ", dtConsulta=" + dtConsulta + ", vlConsulta=" + vlConsulta + '}';
    }
}
