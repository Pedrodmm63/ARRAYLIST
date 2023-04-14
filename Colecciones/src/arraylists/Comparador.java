package arraylists;

import java.util.Comparator;

public class Comparador implements Comparator<Planeta> {

	public int compare(Planeta o1, Planeta o2) {
			
		return (int) (o1.getDistancia() - o2.getDistancia());

	}

}
