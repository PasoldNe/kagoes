package com.pasold.kombi.controllers;

import com.pasold.kombi.dtos.EntradaUpgradeDto;
import com.pasold.kombi.dtos.RetornoUpgradeDto;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculos/upgrades")
public class UpgradeController {

    public UpgradeController() {
    }

    /*@PostMapping
    public ResponseEntity<RetornoUpgradeDto> upgrade (@RequestBody EntradaUpgradeDto entrada){
        RetornoUpgradeDto saida = new RetornoUpgradeDto();

        return saida;
    }
*/
}
