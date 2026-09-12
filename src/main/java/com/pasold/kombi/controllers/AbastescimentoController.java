package com.pasold.kombi.controllers;

import com.pasold.kombi.dtos.EntradaAbastecimentoDto;
import com.pasold.kombi.dtos.RetornoAbastecimentoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/veiculos/abastecimento")
public class AbastescimentoController {


    public AbastescimentoController() {
    }

    @PostMapping
    public ResponseEntity<RetornoAbastecimentoDto> entrada(@RequestBody EntradaAbastecimentoDto entrada){
        RetornoAbastecimentoDto saida = new RetornoAbastecimentoDto(); //temporario para colocar o service ainda :/
        //TODO service


        return ResponseEntity.ok().body(saida);
    }
}
