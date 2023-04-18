package arraylists;

import java.util.ArrayList;

public class SistemaSolar {

	private ArrayList<Planeta> planetas;

	public SistemaSolar() {

		planetas = new ArrayList<Planeta>();
	}

	public void AddPlanetas(Planeta p1) throws Exception {

		if (planetas.size() <= 3) {
			if (!planetas.contains(p1)) {
				planetas.add(p1);

			} else {
				PlanetaRepetidoException error = new PlanetaRepetidoException("Planeta Repetido");
				throw error;
			}
		} else {
			String texto = "Sistema Solar completo " + planetas.size(); 
			SistemaSolarLlenoException error = new SistemaSolarLlenoException(texto);
			throw error;
		}

	}

	public void ordenar() {
		planetas.sort(new Comparador());
	}

	@Override
	public String toString() {
		return planetas.toString();
	}

}
