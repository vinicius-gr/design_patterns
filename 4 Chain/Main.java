




//--- VINICIUS GONZAGA ROCHA _ 11511BCC019 ---




public class Main {

	public static void main(String[] args) {
		Caixa nota100 = new Nota100();
		Caixa nota50 = new Nota50();
		Caixa nota20 = new Nota20();
		Caixa nota10 = new Nota10();
		Caixa nota5 = new Nota5();
		Caixa nota2 = new Nota2();

		nota100.setSucessor(nota50);
		nota50.setSucessor(nota20);
		nota20.setSucessor(nota10);
		nota10.setSucessor(nota5);
		nota5.setSucessor(nota2);
		
		nota100.processaQtde(459);
	}

}
