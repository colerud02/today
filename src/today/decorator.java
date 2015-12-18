package today;

import java.util.ArrayList;

public class decorator {
	public static void main(String[] args) {
		ArrayList<ortamint> hangIt = new ArrayList<ortamint>();
		for (int i = 0; i < 666; i++) {
			hangIt.add(new ortamint());

		}
		for (int i = 0; i < hangIt.size(); i++) {
			
			hangIt.get(i).hang();
		}
	}
}
