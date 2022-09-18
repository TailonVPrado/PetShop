package br.unipar.model;
public class Endereco {
    private Integer id;
    private Cidade cidade;
    private String cdCEP;
    private String dsBairro;
    private String dsRua;
    private String nrEndereco;
    private String complemento;
    private boolean stAtivo;

    public Endereco() {
        stAtivo = true;
    }

    public Endereco(Integer id, Cidade cidade, String cdCEP, String dsBairro, String dsRua, String nrEndereco, String complemento) {
        this.id = id;
        this.cidade = cidade;
        this.cdCEP = cdCEP;
        this.dsBairro = dsBairro;
        this.dsRua = dsRua;
        this.nrEndereco = nrEndereco;
        this.complemento = complemento;
        this.stAtivo = true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getCdCEP() {
        return cdCEP;
    }

    public void setCdCEP(String cdCEP) {
        this.cdCEP = cdCEP;
    }

    public String getDsBairro() {
        return dsBairro;
    }

    public void setDsBairro(String dsBairro) {
        this.dsBairro = dsBairro;
    }

    public String getDsRua() {
        return dsRua;
    }

    public void setDsRua(String dsRua) {
        this.dsRua = dsRua;
    }

    public String getNrEndereco() {
        return nrEndereco;
    }

    public void setNrEndereco(String nrEndereco) {
        this.nrEndereco = nrEndereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public boolean isStAtivo() {
        return stAtivo;
    }

    public void setStAtivo(boolean stAtivo) {
        this.stAtivo = stAtivo;
    }

    @Override
    public String toString() {
        return "EnderecoProprietario{" + "id=" + id + ", cidade=" + cidade + ", cdCEP=" + cdCEP + ", dsBairro=" + dsBairro + ", dsRua=" + dsRua + ", nrEndereco=" + nrEndereco + ", complemento=" + complemento + ", stAtivo=" + stAtivo + '}';
    }
    
}
