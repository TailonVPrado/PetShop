package br.unipar.model;
/* Essa classe é mais para representar um "quarto" de um animal, 
 * para evitar superlotacao, dessa forma cadastramos com o 
 * identificador no sistema e vemos se ele esta ativo ou nao
*/
public class Cantinho {
    private Integer id;
    private Double vlDiaria = 0.0;
    private boolean stDisponivel;
    
    public Cantinho() {
        this.stDisponivel = true;
    }

    public Cantinho(Integer id, Double vlDiaria) {
        this.id = id;
        this.vlDiaria = vlDiaria;
        this.stDisponivel = true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getVlDiaria() {
        return vlDiaria;
    }

    public void setVlDiaria(Double vlDiaria) {
        this.vlDiaria = vlDiaria;
    }

    public boolean isStDisponivel() {
        return stDisponivel;
    }

    public void setStDisponivel(boolean stDisponivel) {
        this.stDisponivel = stDisponivel;
    }

    @Override
    public String toString() {
        return "Cantinho{" + "id=" + id + ", vlDiaria=" + vlDiaria + ", stDisponivel=" + stDisponivel + '}';
    }
    
    
}
