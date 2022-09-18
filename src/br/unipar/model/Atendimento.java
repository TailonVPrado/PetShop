package br.unipar.model;

import java.util.Date;

public class Atendimento {
    private Integer id;
    private Animal animal;
    private Date dtAtendimento;
    private Consulta consulta;
    private Banho banho;
    private AtendimentoEnum stAtendimento;

    public Atendimento() {
        this.stAtendimento = AtendimentoEnum.ABERTO;
    }

    public Atendimento(Integer id, Animal animal, Date dtAtendimento, Consulta consulta, Banho banho) {
        this.id = id;
        this.animal = animal;
        this.dtAtendimento = dtAtendimento;
        this.consulta = consulta;
        this.banho = banho;
        this.stAtendimento = AtendimentoEnum.ABERTO;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Date getDtAtendimento() {
        return dtAtendimento;
    }

    public void setDtAtendimento(Date dtAtendimento) {
        this.dtAtendimento = dtAtendimento;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Banho getBanho() {
        return banho;
    }

    public void setBanho(Banho banho) {
        this.banho = banho;
    }

    public AtendimentoEnum getStAtendimento() {
        return stAtendimento;
    }

    public void setStAtendimento(AtendimentoEnum stAtendimento) {
        this.stAtendimento = stAtendimento;
    }

    @Override
    public String toString() {
        return "Atendimento{" + "id=" + id + ", animal=" + animal + ", dtAtendimento=" + dtAtendimento + ", consulta=" + consulta + ", banho=" + banho + ", stAtendimento=" + stAtendimento + '}';
    }
    
    public Double vlAtendimento (Atendimento atendimento){
        Double vlTotal = 0.0;
        
        vlTotal = vlTotal + atendimento.getBanho().getVlBanho();
        vlTotal = vlTotal + atendimento.getBanho().getTosa().getVlTosa();
        vlTotal = vlTotal + atendimento.getConsulta().getVlConsulta();
        
        for(Exame exame: atendimento.getConsulta().getListaExame()){
            vlTotal = vlTotal + exame.getVlExame();
        }
        for(Vacina vacina: atendimento.getConsulta().getListaVacina()){
            vlTotal = vlTotal + vacina.getVlVacina();
        }
        for(Medicamento medicamento: atendimento.getConsulta().getListaMedicamento()){
            vlTotal = vlTotal + medicamento.getVlMedicamento();
        }
        vlTotal = vlTotal + atendimento.getConsulta().getInternacao().getVlInternacao();
        vlTotal = vlTotal + atendimento.getConsulta().getInternacao().getQtdeDiasInternado() 
                          * atendimento.getConsulta().getInternacao().getCantinho().getVlDiaria();
        return vlTotal;
    }
   
    public void finalizaAtendimento(){
        this.stAtendimento = AtendimentoEnum.ENCERRADO;
        this.consulta.getInternacao().finalizaInternacao();
    }
}
