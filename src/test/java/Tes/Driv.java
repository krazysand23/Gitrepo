package Tes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class Driv {

	@Test
public void run() {
	HashMap<String, String> abc=new HashMap<String, String>();
	abc.put("sandesh","rawal");
	Set<Entry<String, String>> n=abc.entrySet();
	Iterator<Entry<String, String>> p=n.iterator();
	while(p.hasNext()) {
		Entry<String, String> a=p.next();
		System.out.println(a.getKey());
		System.out.println(a.getValue());
	}
}
}
