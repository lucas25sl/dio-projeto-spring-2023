package me.dio.service;

import me.dio.domain.model.Produto;

public interface ProdutoService {

	Produto findById(Long id);
	
	Produto create(Produto produtoToCreate);
}
