package me.dio.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.domain.model.Produto;
import me.dio.domain.repository.ProdutoRepository;
import me.dio.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	
	private final ProdutoRepository produtoRepository;
	
	public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}

	@Override
	public Produto findById(Long id) {
		return
	produtoRepository.findById(id).orElseThrow(NoSuchElementException::new);			
	}

	@Override
	public Produto create(Produto produtoToCreate) {
	
	if (produtoRepository.existsByDescricao(produtoToCreate.getDescricao())) {
			throw new IllegalArgumentException("This Barra number already exists.");
		}
		return produtoRepository.save(produtoToCreate);
	}

}
