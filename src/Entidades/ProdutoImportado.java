package Entidades;

public class ProdutoImportado extends Produtos {

	private double taxaImportacao;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, double preco, double taxaImportacao) {
		super(nome, preco);
		this.taxaImportacao = taxaImportacao;
	}

	public double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}

	public double precoTotal() {
		return getPreco() + taxaImportacao;
	}

	@Override
	public final String etiquetaPreco() {
		return super.getNome() + " $ " + String.format("%.2f", precoTotal()) + " ( Taxa de Importação: $ " + String.format("%.2f", taxaImportacao) + " )" ;
	}
}
