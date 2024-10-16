package com.aula.java.controller;


import com.aula.java.entity.ProdutoEntity;
import com.aula.java.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/produtos")
@RequiredArgsConstructor
public class ProdutoController {


    private final ProdutoService produtoService;


    @GetMapping(value = "/todos")
    public ResponseEntity<List<ProdutoEntity>> recuperarTodos(){
        return ResponseEntity.ok(produtoService.findAll());
    }


    @PostMapping(value = "/criar")
    public void criar(@RequestBody ProdutoEntity produto){
        produtoService.save(produto);
    }
}
