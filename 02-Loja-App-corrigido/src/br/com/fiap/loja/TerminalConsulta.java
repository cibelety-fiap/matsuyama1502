package br.com.fiap.loja;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.fiap.loja.bo.EstoqueBO;
import br.com.fiap.to.ProdutoTO;

public class TerminalConsulta {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Scanner e = new Scanner(System.in);

		System.out.println("--- LOJA ABC ---");
		System.out.println(hoje.format(formatador));


		System.out.println("\nInforme o c�digo do produto: ");

		int codProduto = e.nextInt();
		e.close();
		
		
		ProdutoTO produto = EstoqueBO.consultarProduto(codProduto);
		
		System.out.println(produto.getDescricao());
		
		
	}
}
