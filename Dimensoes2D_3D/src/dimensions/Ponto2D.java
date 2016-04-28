package dimensions;

public class Ponto2D {
	
	// Atributos que representam as coordenadas X e Y.
	private double coordenadaX;
	private double coordenadaY;
	
	// Construtor que recebe valores para as coordenadas X e Y.
	public Ponto2D (double coordenadaX, double coordenadaY){
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;		
	}
	
	// Método para acessar o atributo coordenada X.
	public double getCoordenadaX() {
		return coordenadaX;
	}

	// Método para acessar o atributo coordenada Y.
	public double getCoordenadaY() {
		return coordenadaY;
	}
	
	// Método que sobrescreve o método "toString".
	public String toString(){
		 return "A coordenada X é: " + coordenadaX + " | Coordenada Y é: "  +  coordenadaY;
	}
}
