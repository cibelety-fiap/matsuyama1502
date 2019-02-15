package br.com.fiap.loja.bo;

import org.apache.log4j.Logger;

import br.com.fiap.to.ProdutoTO;

public class EstoqueBO {
	
	private static Logger log = Logger.getLogger(EstoqueBO.class);
	
	public static ProdutoTO consultarProduto(int codigo) {
		
		switch (codigo) {
		case 401:
			log.debug("Entrou no caso 401");
			return new ProdutoTO(codigo, "Camiseta branca", 4, 2.99);
		case 402:
			log.debug("Entrou no caso 402");
			return new ProdutoTO(codigo, "Camiseta azul", 4, 2.99);
		case 403:
			log.debug("Entrou no caso 403");
			return new ProdutoTO(codigo, "Camiseta rosa", 4, 2.99);
		default:
			log.error("produto não fois encontrado");
			return new ProdutoTO(-1, "Produto não encontrado", 0, 0);
		}
	}

}
