package br.unipar.model;
public class Pagamento {    
    private Integer id;
    private Atendimento atendimento;
    private Enum<PagamentoEnum> formaPgto;
    private Double vlPgto;
    private Double vlDesconto;
    
    public Pagamento() {
    }

    public Pagamento(Integer id, Atendimento atendimento, Enum<PagamentoEnum> formaPgto) {
        this.id = id;
        this.atendimento = atendimento;
        this.formaPgto = formaPgto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public Enum<PagamentoEnum> getFormaPgto() {
        return formaPgto;
    }

    public void setFormaPgto(Enum<PagamentoEnum> formaPgto) {
        this.formaPgto = formaPgto;
    }

    public Double getVlPgto() {
        return vlPgto;
    }

    public void setVlPgto(Double vlPgto) {
        this.vlPgto = vlPgto;
    }

    public Double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(Double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "id=" + id + ", atendimento=" + atendimento + ", formaPgto=" + formaPgto + '}';
    }
    

    public void finalizaPagamento(){
        Double vlDesc = 0.0;
        Double vlAtendimento = atendimento.vlAtendimento(this.atendimento);
        
        if (this.formaPgto.equals(PagamentoEnum.DINHEIRO) || this.formaPgto.equals(PagamentoEnum.PIX)) {
            vlDesc = vlAtendimento * 0.1;
        }else if (this.formaPgto.equals(PagamentoEnum.DEBITO)) {
            vlDesc = vlAtendimento * 0.05;
        }
        
        /*seta o valor do pagamento e o desconto do mesmo*/
        this.vlPgto = vlAtendimento - vlDesc;
        this.vlDesconto = vlDesc;
        
        /*seta o atemdimento como PAGO*/
        this.atendimento.setStAtendimento(AtendimentoEnum.PAGO);
    }
    
}
