import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class HashMaps {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		
		map.put(1, "um");
		map.put(2, "dois");
		map.put(3, "tres");
		
		Set<Integer> chaves = map.keySet();
		Collection<String> valores = map.values();
		
		for(Integer chave : chaves)
			System.out.println(chave);
		
		for(String valor : valores)
			System.out.println(valor);
	}
}
