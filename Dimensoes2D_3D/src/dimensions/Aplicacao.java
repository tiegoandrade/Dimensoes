package dimensions;

public class Aplicacao {

	public static void main(String[] args) {
		
		//Criação dos objetos
		Ponto2D p1 = new Ponto2D (8 , 9);
		// Quando se passa um objeto como parâmetro para o "println"
		// Ele irá chamar o toString().
		System.out.println (p1);
		
		//Criação dos objetos
		Ponto3D p2 = new Ponto3D (10, 5.8, 14);
		System.out.println(p2);
	}

}
