package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.ProdutoImportado;
import Entidades.Produtos;
import Entidades.ProdutosUsados;

public class programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		List <Produtos> lista = new ArrayList<>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Informe a quantidade de produtos: ");
		int qtd = ler.nextInt();
		ler.nextLine();

		for (int cont = 1; cont <= qtd; cont++) {
			System.out.println("Prdouto #" + cont + ", dados: ");
			System.out.print("Comum, usado ou importado (c/u/i) ? ");
			char tipo = ler.next().charAt(0);

			if (tipo == 'c') {
				System.out.print("Nome: ");
				ler.nextLine();
				String nome = ler.nextLine();
				System.out.print("Preço: ");
				double preco = ler.nextDouble();
				
				lista.add(new Produtos(nome, preco));
				
			}

			else if (tipo == 'u') {
				System.out.print("Nome: ");
				ler.nextLine();
				String nome = ler.nextLine();
				System.out.print("Preço: ");
				double preco = ler.nextDouble();
				System.out.print("Data de Fabricação: ");
				Date dataFabricacao = sdf.parse(ler.next());
				
				lista.add(new ProdutosUsados(nome, preco, dataFabricacao));
			}
			
			else {
				System.out.print("Nome: ");
				ler.nextLine();
				String nome = ler.nextLine();
				System.out.print("Preço: ");
				double preco = ler.nextDouble();
				System.out.print("Taxa de importação: ");
				double taxaImportacao = ler.nextDouble();
				
				lista.add(new ProdutoImportado(nome, preco, taxaImportacao));
			}
		}
		
		System.out.println("");
		
		System.out.println("Etiquetas de preço: ");
		
		for ( Produtos listaProdutos : lista) {
			System.out.println(listaProdutos.etiquetaPreco());
		}
		
		ler.close();
	}

}
