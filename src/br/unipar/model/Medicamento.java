package br.unipar.model;
public class Medicamento {
    private Integer id;
    private String nomeMedicamento;
    private Double vlMedicamento = 0.0;

    public Medicamento() {
    }

    public Medicamento(Integer id, String nomeMedicamento, Double vlMedicamento) {
        this.id = id;
        this.nomeMedicamento = nomeMedicamento;
        this.vlMedicamento = vlMedicamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }

    public Double getVlMedicamento() {
        return vlMedicamento;
    }

    public void setVlMedicamento(Double vlMedicamento) {
        this.vlMedicamento = vlMedicamento;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "id=" + id + ", nomeMedicamento=" + nomeMedicamento + ", vlMedicamento=" + vlMedicamento + '}';
    }

    
}
