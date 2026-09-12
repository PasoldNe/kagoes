package com.pasold.kombi.model;

import jakarta.persistence.*;

@Entity
public class UpgradeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String peca;
    private String descricao;
    private Double custoAprox;
    private Integer prioridade;
    private String status;

    public UpgradeEntity() {
    }

    public UpgradeEntity(Integer id, String peca, String descricao, Double custoAprox, Integer prioridade, String status) {
        this.id = id;
        this.peca = peca;
        this.descricao = descricao;
        this.custoAprox = custoAprox;
        this.prioridade = prioridade;
        this.status = status;
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
