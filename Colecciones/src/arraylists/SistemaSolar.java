package arraylists;

import java.util.ArrayList;

public class SistemaSolar {

		private ArrayList<Planeta> sistemaSolar;
	public SistemaSolar() {
		
		ArrayList<Planeta> sistemaSolar = new ArrayList<Planeta>();
	}

	public void AddPlanetas(Planeta p1) {
		boolean repetido = false;
		
		for(int i=0; i < sistemaSolar.size(); i++) {
			
			
			if(sistemaSolar.get(i) == p1) {
				repetido = true;
			}
		
		}
		if (repetido == false) {
			 sistemaSolar.add(p1);
		}
	}

	@Override
	public String toString() {
		return "SistemaSolar [" + sistemaSolar + "]";
	}
	
	
}
