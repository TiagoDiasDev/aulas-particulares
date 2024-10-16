package com.aula.java.service;


import com.aula.java.entity.ProdutoEntity;
import com.aula.java.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {


    private final ProdutoRepository produtoRepository;

    public List<ProdutoEntity> findAll(){
        return produtoRepository.findAll();
    }

    public void save(ProdutoEntity produtoEntity){
        produtoRepository.save(produtoEntity);
    }

}
