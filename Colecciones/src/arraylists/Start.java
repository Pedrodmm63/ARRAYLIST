package arraylists;

import java.util.ArrayList;


public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Planeta> sistemaSolar = new ArrayList<Planeta>();
				
		Planeta tierra = new Planeta("Tierra", 35.65d, 468.1325d);
		sistemaSolar.add(tierra);
		
		Planeta mercurio = new Planeta("Mercurio", 21.4d, 9875.654d);
		sistemaSolar.add(mercurio);
		
		Planeta venus = new Planeta("Venus", 32.1d,365.215d);
		sistemaSolar.add(venus);
		
		
		//sistemaSolar.add(tierra);
		
		//AL AÑADIR LOS NOMBRES Y DESPUES CAMBIARLOS SE VA A QUEDAR CON EL NOMBRE CAMBIADO SIEMPRE AL ULTIMO QUE LE ASIGNASTE INDEPENDIENTEMENTE DE HABER CREADO
		//OTRO OBJETO QUE ALMACENA EL OBJETO PRINCIPAL
		tierra.setNombre("Tierrina");
		
		//ELIMINA EL OBJETO DE LA POSICION INDICADA
		//sistemaSolar.remove(0);
		//ELIMINA EL OBJETO QUE TU LE INDIQUES Y SI QUIERES ELIMINAR MAS DE UNO TIENES QUE PONERLO LAS VECES QUE TU QUIERAS
		//sistemaSolar.remove(tierra);
		
//		Planeta otroPlaneta = sistemaSolar.get(0);
//		System.out.println(otroPlaneta);
//		otroPlaneta.setNombre("PedroLandia");
//		System.out.println(otroPlaneta);
		sistemaSolar.sort(new Comparador());
		
		System.out.println(sistemaSolar);
		
		
	}

}
