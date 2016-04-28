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
	
	// M�todo para acessar o atributo coordenada X.
	public double getCoordenadaX() {
		return coordenadaX;
	}

	// M�todo para acessar o atributo coordenada Y.
	public double getCoordenadaY() {
		return coordenadaY;
	}
	
	// M�todo que sobrescreve o m�todo "toString".
	public String toString(){
		 return "A coordenada X �: " + coordenadaX + " | Coordenada Y �: "  +  coordenadaY;
	}
}
