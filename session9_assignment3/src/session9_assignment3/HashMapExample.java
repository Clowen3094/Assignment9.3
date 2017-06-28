/*an application having a Generic HashMap
  with Empcode as key and EmpName as value.*/

package session9_assignment3;
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<String,String> hm = new HashMap<String,String>();
	hm.put("one", "apple");
	hm.put("two", "orange");
	hm.put("three", "banana");
	
	
	
	Set<String> key = hm.keySet();
	for (String str:key){
		System.out.println(hm.get(str));
	}
	
	
	
	}

}
