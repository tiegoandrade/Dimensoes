package dimensions;

public class Ponto3D extends Ponto2D {
	
	// Atributos que representam as coordenadas Z.
	private double coordenadaZ;
	
	// Construtor que recebe valores para as coordenadas X , Y e Z
	// Recebe os valores de X e Y do construtor da superclasse.
	public Ponto3D (double coordenadaX, double coordenadaY, double coordenadaZ){
		super(coordenadaX,coordenadaY);
		this.coordenadaZ = coordenadaZ;
	}
	
	// M�todo para acessar o atributo coordenada Y.
	public double getcoordenadaZ(){
		return coordenadaZ;
	}
	
	// M�todo que sobrescreve o m�todo "toString()"
	// Chama o m�todo toString() da superclasse.
	public String toString(){
		return super.toString() + " | A coordenada Z �: " + coordenadaZ;
	}
}
