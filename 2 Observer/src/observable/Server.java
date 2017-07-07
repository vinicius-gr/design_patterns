package observable;


import java.util.ArrayList;

import observer.Observador;

public class Server implements Observado{
	
	public String valor;
	public ArrayList<Observador> observadores;
	
	public Server (){
		observadores = new ArrayList<Observador>();
	}
		
	@Override
	public void registrarObservador(Observador o) {
		observadores.add(o);
	}

	@Override
	public void removerObservador(Observador o) {
		int i = observadores.indexOf(o);
		if(i >= 0)
			observadores.remove(i);
	}

	@Override
	public void notificarObservadores() {
		for(int i=0; i<observadores.size(); i++){
			Observador observador = (Observador) observadores.get(i);
			observador.atualizar(valor);
		}
	}
	
	public void valoresAlterados(){
		notificarObservadores();
	}
	
	public void setValores(String valores){
		this.valor = valores;
		
		valoresAlterados();
	}

}
