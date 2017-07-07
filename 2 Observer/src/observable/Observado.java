package observable;

import observer.Observador;

public interface Observado {
	void registrarObservador(Observador o);
	void removerObservador(Observador o);
	void notificarObservadores();
	
}
