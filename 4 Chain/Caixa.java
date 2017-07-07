
public abstract class Caixa {

	int qtdeSaque;
	Caixa nextNota;

	abstract int getValorDaNota();

	abstract String getNome();

	public void setSucessor(Caixa sucessor) {
		this.nextNota = sucessor;
	}

	public void processaQtde(int valor) {
		if (valor / this.getValorDaNota() >= 1) {
			int qtdeNotas = (int) (valor / this.getValorDaNota());
			valor -= qtdeNotas * this.getValorDaNota();
			System.out.println(qtdeNotas + " notas de " + this.getNome() + " reais");
		}
		if (nextNota != null) {
			nextNota.processaQtde(valor);
		}
	}
}
