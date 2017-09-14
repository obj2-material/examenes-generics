package ar.edu.unq.cpi.examen.respuesta;

import ar.edu.unq.cpi.examen.pregunta.Pregunta;

public abstract class RespuestaAPregunta<T extends Pregunta> {
	private T pregunta;
	
	public RespuestaAPregunta(T preg) {
		super();
		this.pregunta = preg;
	}
	
	public T getPregunta() { return this.pregunta; }
	
	public int getPuntajeObtenido() { return this.esCorrecta() ? this.getPregunta().getPuntajeMaximo() : 0; }

	public abstract boolean esCorrecta();

	public abstract void setValor(String valor);
}
