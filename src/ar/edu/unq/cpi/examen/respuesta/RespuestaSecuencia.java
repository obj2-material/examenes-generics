package ar.edu.unq.cpi.examen.respuesta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ar.edu.unq.cpi.examen.pregunta.PreguntaSecuencia;

public class RespuestaSecuencia extends RespuestaAPregunta<PreguntaSecuencia> {
	private List<String> secuenciaElegida;
	
	public RespuestaSecuencia(PreguntaSecuencia preg) { super(preg); }

	@Override
	public boolean esCorrecta() {
		return this.getSecuenciaElegida().equals(this.getPregunta().getSecuenciaCorrecta())
				|| 
				this.getSecuenciaElegidaAlReves().equals(this.getPregunta().getSecuenciaCorrecta());
	}

	@Override
	public void setValor(String valor) { this.secuenciaElegida = Arrays.asList(valor.split("-")); }
	
	public List<String> getSecuenciaElegida() { return this.secuenciaElegida; }
	
	public List<String> getSecuenciaElegidaAlReves() { 
		List<String> nuevaSecuencia = new ArrayList<>(this.secuenciaElegida);
		Collections.reverse(nuevaSecuencia);
		return nuevaSecuencia;
	}
}
