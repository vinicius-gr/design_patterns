package observer;


import observable.Observado;

public class Home_broker implements Observador{

	String valores;
	
	private Observado dadosValores;
	
	public Home_broker(Observado dadosValores) {
		this.dadosValores = dadosValores;
		this.dadosValores.registrarObservador(this);
	}
	
	public void atualizar(String valores){
		this.valores = valores;
	
		exibir();
	}
	
	public void exibir(){
		System.out.println("\n\n============Novos Valores - "+(this)+ " ==========\n");
		
		System.out.println(this.valores);
	}

}
