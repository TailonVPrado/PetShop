package br.unipar.model;
public class Raca {
    private Integer id;
    private String dsRaca;
    private Especie especie;

    public Raca() {
    }

    public Raca(Integer id, String dsRaca, Especie especie) {
        this.id = id;
        this.dsRaca = dsRaca;
        this.especie = especie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDsRaca() {
        return dsRaca;
    }

    public void setDsRaca(String dsRaca) {
        this.dsRaca = dsRaca;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Raca{" + "id=" + id + ", dsRaca=" + dsRaca + ", especie=" + especie + '}';
    }

    
}
