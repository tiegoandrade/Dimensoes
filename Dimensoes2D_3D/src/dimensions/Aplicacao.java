package dimensions;

public class Aplicacao {

	public static void main(String[] args) {
		
		//Cria��o dos objetos
		Ponto2D p1 = new Ponto2D (8 , 9);
		// Quando se passa um objeto como par�metro para o "println"
		// Ele ir� chamar o toString().
		System.out.println (p1);
		
		//Cria��o dos objetos
		Ponto3D p2 = new Ponto3D (10, 5.8, 14);
		System.out.println(p2);
	}

}
