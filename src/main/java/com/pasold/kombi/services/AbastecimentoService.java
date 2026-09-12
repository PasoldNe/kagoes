package com.pasold.kombi.services;
import com.pasold.kombi.dtos.EntradaAbastecimentoDto;
import com.pasold.kombi.dtos.RetornoAbastecimentoDto;
import org.springframework.stereotype.Service;

@Service
public class AbastecimentoService {

    public AbastecimentoService() {
    }

    public RetornoAbastecimentoDto calculo (EntradaAbastecimentoDto entrada){
        RetornoAbastecimentoDto saida = new RetornoAbastecimentoDto();
        saida.setCombustivel(entrada.getCombustivel());
        saida.setCustoPorKm(custoPorKm(entrada));
        saida.setKmPorLitro(kmPorLitro(entrada));
        saida.setLitrosAbastecidos(entrada.getLitrosAbastecidos());
        saida.setModelo(entrada.getModelo());
        saida.setQuilometragem(entrada.getQuilometragem());
        saida.setValorPago(entrada.getValorPago());
        return saida;
    }

    private Double kmPorLitro(EntradaAbastecimentoDto entrada){
        return entrada.getQuilometragem()/entrada.getLitrosAbastecidos();
    }

    private Double custoPorKm(EntradaAbastecimentoDto entrada){
        return Math.round(entrada.getValorPago()/entrada.getLitrosAbastecidos())/kmPorLitro(entrada);
    }
}
