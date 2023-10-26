package com.example.trabalholockotimista.Controllers;

import com.example.trabalholockotimista.Entities.NewConta;
import com.example.trabalholockotimista.Services.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/conta")
@CrossOrigin
public class Contralador {
    @Autowired
    private ContaService contaService;

    @PostMapping("/sacar")
    public ResponseEntity<NewConta> sacar(@RequestParam String numeroConta, @RequestParam BigDecimal valor) throws Exception {
        NewConta conta = contaService.sacar(numeroConta, valor);
        return ResponseEntity.ok(conta);
    }

    @PostMapping("/depositar")
    public ResponseEntity<NewConta> depositar(@RequestParam String numeroConta, @RequestParam BigDecimal valor) throws Exception {
        NewConta conta = contaService.depositar(numeroConta, valor);
        return ResponseEntity.ok(conta);
    }
}