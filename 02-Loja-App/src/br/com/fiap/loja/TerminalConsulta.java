package br.com.fiap.loja;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import br.com.fiap.loja.bean.Produto;
import br.com.fiap.loja.bo.EstoqueBO;

public class TerminalConsulta {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Scanner e = new Scanner(System.in);

		System.out.println("--- LOJA ABC ---");
		System.out.println(hoje.format(formatador));
		System.out.println("\nInforme o código do produto: ");

		int codProduto = e.nextInt();

		List<Produto>	listaProduto =	EstoqueBO.consultarProduto(codProduto);

		for(Produto item : listaProduto) {
			System.out.println(item.getCodigo());
			System.out.println(item.getDescricao());
			System.out.println(item.getPreco());
			System.out.println(item.getQuantidade());
		}
		
		e.close();
	}
}
