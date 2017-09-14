package ar.edu.unq.cpi.examenes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unq.cpi.examen.examen.ResolucionDeExamen;
import ar.edu.unq.cpi.examen.pregunta.PreguntaMultipleChoice;
import ar.edu.unq.cpi.examen.pregunta.PreguntaNumerica;
import ar.edu.unq.cpi.examen.respuesta.RespuestaMultipleChoice;
import ar.edu.unq.cpi.examen.respuesta.RespuestaNumerica;

public class CuatroRespuestasTest {

	@Test
	public void testPuntaje() {
		ResolucionDeExamen reso = new ResolucionDeExamen();

		PreguntaNumerica losTrescientos = new PreguntaNumerica(12, 300);
		losTrescientos.setRangoAproximado(250, 320, 3);

		reso.addToRespuestas(new RespuestaMultipleChoice(new PreguntaMultipleChoice(5, "c")));
		reso.addToRespuestas(new RespuestaMultipleChoice(new PreguntaMultipleChoice(10, "a")));
		reso.addToRespuestas(new RespuestaMultipleChoice(new PreguntaMultipleChoice(20, "d")));
		reso.addToRespuestas(new RespuestaNumerica(losTrescientos));
		
		reso.getRespuestas().get(0).setValor("c");
		reso.getRespuestas().get(1).setValor("c");
		reso.getRespuestas().get(2).setValor("d");
		reso.getRespuestas().get(3).setValor("280");
		
		assertEquals(28, reso.getPuntajeObtenido());
	}

}
