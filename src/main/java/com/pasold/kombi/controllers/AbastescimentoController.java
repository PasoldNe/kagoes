package com.pasold.kombi.controllers;

import com.pasold.kombi.dtos.EntradaAbastecimentoDto;
import com.pasold.kombi.dtos.RetornoAbastecimentoDto;
import com.pasold.kombi.services.AbastecimentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/veiculos/abastecimento")
public class AbastescimentoController {

    private final AbastecimentoService abastecimentoService;

    public AbastescimentoController(AbastecimentoService abastecimentoService) {
        this.abastecimentoService = abastecimentoService;
    }

    @PostMapping
    public ResponseEntity<RetornoAbastecimentoDto> entrada(@RequestBody EntradaAbastecimentoDto entrada){
        RetornoAbastecimentoDto saida = abastecimentoService.calculo(entrada);
        return ResponseEntity.ok().body(saida);
    }
}
