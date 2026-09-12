package com.pasold.kombi.dtos;

public class EntradaUpgradeDto {

    private String peca;
    private String descricao;
    private Double custoAprox;
    private Integer prioridade; //de 1-10, sendo 10 urgente e 1 fodase

    public EntradaUpgradeDto() {
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
}
