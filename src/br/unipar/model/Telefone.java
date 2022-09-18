package br.unipar.model;
public class Telefone {
    private Integer id;
    private String DDD;
    private String numero;

    public Telefone() {
    }

    public Telefone(Integer id, String DDD, String numero) {
        this.id = id;
        this.DDD = DDD;
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDDD() {
        return DDD;
    }

    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefone{" + "id=" + id + ", DDD=" + DDD + ", numero=" + numero + '}';
    }
    
}
