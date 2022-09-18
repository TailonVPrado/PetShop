package br.unipar.model;
public class Cidade {
    private Integer id;
    private String descricao;
    private Estado estado;

    public Cidade() {
    }

    public Cidade(Integer id, String descricao, Estado estado) {
        this.id = id;
        this.descricao = descricao;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{" + "id=" + id + ", descricao=" + descricao + ", estado=" + estado + '}';
    }
    
}
