package br.unipar.model;
public class Estado {
    private Integer id;
    private String descricao;
    private String sigla;
    private Pais pais; 

    public Estado() {
    }

    public Estado(Integer id, String descricao, String sigla, Pais pais) {
        this.id = id;
        this.descricao = descricao;
        this.sigla = sigla;
        this.pais = pais;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Estado{" + "id=" + id + ", descricao=" + descricao + ", sigla=" + sigla + ", pais=" + pais + '}';
    }
    
}
