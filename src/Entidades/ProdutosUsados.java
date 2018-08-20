package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutosUsados extends Produtos {

	private Date dataFabricacao ;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public ProdutosUsados() {
		super();
	}

	public ProdutosUsados(String nome, double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	@Override
	public String etiquetaPreco() {
		return super.getNome() + " (usado) $ " + String.format("%.2f", super.getPreco()) + "( Data de Fabricação: "
				+ sdf.format(dataFabricacao) + " )";

	}
}
