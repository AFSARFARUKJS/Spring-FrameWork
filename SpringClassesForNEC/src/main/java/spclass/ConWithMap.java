package spclass;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ConWithMap {

	private Map<String,String> m;

	public ConWithMap(Map<String, String> m) {
		super();
		this.m = m;
	}
	
	
	public void showMap() {
		
		Set<String> st = m.keySet();
		Iterator<String> ite = st.iterator();
		while(ite.hasNext()) {
			String key = ite.next();
			String value = m.get(key);
			
			System.out.println(key + " : " + value);
		}
	}
}
