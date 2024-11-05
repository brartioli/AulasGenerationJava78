package collection;

import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {
		HashMap<Long, String> pessoa = new HashMap<>();
		
		pessoa.put(11245678911L, "Sansão ");
		pessoa.put(11245678913L, "Felipe ");
		pessoa.put(11245678912L, "Sansão ");
		System.out.println(pessoa);
		System.out.println(" " + pessoa.get(11245678912L));

	}

}
