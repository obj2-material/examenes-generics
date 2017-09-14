package ar.edu.unq.cpi.examen.respuesta;

import ar.edu.unq.cpi.examen.pregunta.PreguntaNumerica;

public class RespuestaNumerica extends RespuestaAPregunta<PreguntaNumerica> {
	private int valor;

	public RespuestaNumerica(PreguntaNumerica preg) { super(preg); }

	@Override
	public boolean esCorrecta() { return this.getValor() == this.getPregunta().getRespuestaCorrecta(); }
	
	public boolean estaEnRango() { return this.getPregunta().getRangoAproximado().isEnRango(this.getValor()); }

	@Override
	public int getPuntajeObtenido() {
		if (this.estaEnRango() && !this.esCorrecta()) {
			return this.getPregunta().getPuntajeAproximado();
		} else {
			return super.getPuntajeObtenido();
		}
	}

	public int getValor() { return this.valor; }
	
	@Override
	public void setValor(String valor) { this.valor = new Integer(valor); }
}
