package com.pasold.kombi.dtos;

public class RetornoUpgradeDto {

    private Integer id;
    private String peca;
    private String descricao;
    private Double custoAprox;
    private Integer prioridade; //de 1-10, sendo 10 urgente e 1 fodase
    private String status; //pendente - processand(sendo feito) - realizado

    public RetornoUpgradeDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getCustoAprox() {
        return custoAprox;
    }

    public void setCustoAprox(Double custoAprox) {
        this.custoAprox = custoAprox;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
