package br.unipar.model;
public class Tosa {
    private Integer id;
    private String dsObservacao;
    private Double vlTosa = 0.0;

    public Tosa() {
    }

    public Tosa(Integer id, String dsObservacao, Double vlTosa) {
        this.id = id;
        this.dsObservacao = dsObservacao;
        this.vlTosa = vlTosa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
    }

    public Double getVlTosa() {
        return vlTosa;
    }

    public void setVlTosa(Double vlTosa) {
        this.vlTosa = vlTosa;
    }

    @Override
    public String toString() {
        return "Tosa{" + "id=" + id + ", dsObservacao=" + dsObservacao + ", vlTosa=" + vlTosa + '}';
    }
        
}
