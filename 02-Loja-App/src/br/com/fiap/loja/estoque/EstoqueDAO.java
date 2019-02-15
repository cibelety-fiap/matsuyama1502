package br.com.fiap.loja.estoque;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.loja.bean.Produto;

public class EstoqueDAO {
	
	public static List<Produto> listaProdutos = new ArrayList<Produto>();

	public static void carregarProds() {
		listaProdutos.add(new Produto(401, 30.0, 40, "Camiseta Branca"));
		listaProdutos.add(new Produto(402, 35.0, 15, "Camiseta Azul"));
		listaProdutos.add(new Produto(403, 40.0, 32, "Camiseta Rosa"));
	}
	
	
}
