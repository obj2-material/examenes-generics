package ar.edu.unq.cpi.examen.pregunta;

public abstract class Pregunta {

	private int puntajeMaximo;
	
	public Pregunta(int puntajeMaximo) { this.puntajeMaximo = puntajeMaximo; }
	
	public int getPuntajeMaximo() { return this.puntajeMaximo; }
}
