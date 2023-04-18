package arraylists;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		SistemaSolar sistemaSolar = new SistemaSolar();

		Planeta tierra = new Planeta("Tierra", 35.65d, 468.1325d);
		Planeta mercurio = new Planeta("Mercurio", 21.4d, 9875.654d);
		Planeta venus = new Planeta("Venus", 32.1d, 365.215d);
		Planeta marte = new Planeta("Marte", 38.1d, 315.295d);
		Planeta jupiter = new Planeta("Jupiter", 39.1d, 365.218d);

		try {
			sistemaSolar.AddPlanetas(tierra);

		} catch (PlanetaRepetidoException e) {
			e.printStackTrace();
		}
		try {
			sistemaSolar.AddPlanetas(mercurio);

		} catch (PlanetaRepetidoException e) {
			e.printStackTrace();
		}
		try {
			sistemaSolar.AddPlanetas(venus);
		} catch (PlanetaRepetidoException e) {
			e.printStackTrace();
		}
		try {
			sistemaSolar.AddPlanetas(marte);
		} catch (PlanetaRepetidoException e) {
			e.printStackTrace();
		}
		try {
			sistemaSolar.AddPlanetas(jupiter);
		} catch (PlanetaRepetidoException e) {
			e.printStackTrace();
		}
		
		try {
			sistemaSolar.AddPlanetas(tierra);
		} catch (PlanetaRepetidoException e) {
			e.printStackTrace();
		}

		// sistemaSolar.AddPlanetas(tierra);

		// AL AÑADIR LOS NOMBRES Y DESPUES CAMBIARLOS SE VA A QUEDAR CON EL NOMBRE
		// CAMBIADO SIEMPRE AL ULTIMO QUE LE ASIGNASTE INDEPENDIENTEMENTE DE HABER
		// CREADO
		// OTRO OBJETO QUE ALMACENA EL OBJETO PRINCIPAL
		// tierra.setNombre("Tierrina");

		// ELIMINA EL OBJETO DE LA POSICION INDICADA
		// sistemaSolar.remove(0);
		// ELIMINA EL OBJETO QUE TU LE INDIQUES Y SI QUIERES ELIMINAR MAS DE UNO TIENES
		// QUE PONERLO LAS VECES QUE TU QUIERAS
		// sistemaSolar.remove(tierra);

//		Planeta otroPlaneta = sistemaSolar.get(0);
//		System.out.println(otroPlaneta);
//		otroPlaneta.setNombre("PedroLandia");
//		System.out.println(otroPlaneta);
		sistemaSolar.ordenar();
		;

		// List listaPlanetas = sistemaSolar.subList(0, sistemaSolar.size());
		System.out.println(sistemaSolar);
		// System.out.println(listaPlanetas);

	}

}
