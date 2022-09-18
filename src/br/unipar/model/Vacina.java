package br.unipar.model;
public class Vacina {
    private Integer id;
    private String nomeVacina;
    private Double vlVacina = 0.0;
    private String observacao;

    public Vacina() {
    }

    public Vacina(Integer id, String nomeVacina, Double vlVacina, String observacao) {
        this.id = id;
        this.nomeVacina = nomeVacina;
        this.vlVacina = vlVacina;
        this.observacao = observacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public Double getVlVacina() {
        return vlVacina;
    }

    public void setVlVacina(Double vlVacina) {
        this.vlVacina = vlVacina;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Vacina{" + "id=" + id + ", nomeVacina=" + nomeVacina + ", vlVacina=" + vlVacina + ", observacao=" + observacao + '}';
    }


}
