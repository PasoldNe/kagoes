package com.pasold.kombi.dtos;

public class RetornoAbastecimentoDto {
    private String modelo;
    private Double quilometragem;
    private Double litrosAbastecidos;
    private Double valorPago;
    private Double kmPorLitro;
    private Double custoPorKm;

    public RetornoAbastecimentoDto() {
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
