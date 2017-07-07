


package main;



//--- VINICIUS GONZAGA ROCHA _ 11511BCC019 ---




import observable.Observado;
import observable.Server;
import observer.Home_broker;
import observer.Observador;

public class Main {

	public static void main(String[] args) {
		Server servidor = new Server();
		Observador hb1 = new Home_broker(servidor);
		Observador hb2 = new Home_broker(servidor);
		Observador hb3 = new Home_broker(servidor);
		
		servidor.setValores("Petrobras: 20.54 \nVale: 30.01 \nOCX:47.59");
		servidor.setValores("Petrobras: 19.54 \nVale: 12.01 \nOCX:88.09");
	}

}
