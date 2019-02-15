package br.com.fiap.loja.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.loja.bean.Produto;

  


public class EstoqueBO {
	
	public static Produto consultarProduto(int codigo) {
		Produto produto = new Produto();		
		
		switch (codigo) {
		case 401:		
			
			tem.out.println("Camiseta branca");
			break;
		case 402:
			System.out.println("Camiseta azul");
			break;
		case 403:
			System.out.println("Camiseta rosa");
			break;
		default:
			System.out.println("Produto n�o encontrado");
			break;
		}
		
		return listaProdutos;
	}
}
