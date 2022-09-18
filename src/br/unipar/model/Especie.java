package br.unipar.model;
public class Especie {
    private Integer id;
    private String dsEspecie;

    public Especie() {
    }

    public Especie(Integer id, String dsEspecie) {
        this.id = id;
        this.dsEspecie = dsEspecie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDsEspecie() {
        return dsEspecie;
    }

    public void setDsEspecie(String dsEspecie) {
        this.dsEspecie = dsEspecie;
    }

    @Override
    public String toString() {
        return "Especie{" + "id=" + id + ", dsEspecie=" + dsEspecie + '}';
    }
}
