package com.pasold.kombi.model;

import jakarta.persistence.*;

@Entity
public class AbastecimentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    @Column(name = "kmRodado")
    private Double quilometragem;
    private String combustivel;
    private Double litrosAbastecidos;
    private Double valorPago;
    private Double kmPorLitro;
    private Double custoPorKm;

    public AbastecimentoEntity() {
    }

    public AbastecimentoEntity(Long id, String modelo, Double quilometragem, String combustivel, Double litrosAbastecidos, Double valorPago, Double kmPorLitro, Double custoPorKm) {
        this.id = id;
        this.modelo = modelo;
        this.quilometragem = quilometragem;
        this.combustivel = combustivel;
        this.litrosAbastecidos = litrosAbastecidos;
        this.valorPago = valorPago;
        this.kmPorLitro = kmPorLitro;
        this.custoPorKm = custoPorKm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Double getLitrosAbastecidos() {
        return litrosAbastecidos;
    }

    public void setLitrosAbastecidos(Double litrosAbastecidos) {
        this.litrosAbastecidos = litrosAbastecidos;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public Double getKmPorLitro() {
        return kmPorLitro;
    }

    public void setKmPorLitro(Double kmPorLitro) {
        this.kmPorLitro = kmPorLitro;
    }

    public Double getCustoPorKm() {
        return custoPorKm;
    }

    public void setCustoPorKm(Double custoPorKm) {
        this.custoPorKm = custoPorKm;
    }
}
