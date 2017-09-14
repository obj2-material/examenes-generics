package ar.edu.unq.cpi.examen.respuesta;

import ar.edu.unq.cpi.examen.pregunta.PreguntaMultipleChoice;

public class RespuestaMultipleChoice extends RespuestaAPregunta<PreguntaMultipleChoice> {

	public RespuestaMultipleChoice(PreguntaMultipleChoice preg) { super(preg); }

	private String opcionElegida;

	@Override
	public boolean esCorrecta() {
		return this.getOpcionElegida().equals(this.getPregunta().getOpcionCorrecta());
	}

	public String getOpcionElegida() { return this.opcionElegida; }

	@Override
	public void setValor(String valor) { this.opcionElegida = valor; }
}
