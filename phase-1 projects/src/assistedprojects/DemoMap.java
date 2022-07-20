package assistedprojects;

import java.util.*;
public class DemoMap {

	public static void main(String[] args) {
		// map
		
				//Hashmap
				HashMap<Integer,String> hm=new HashMap<Integer,String>();      
			      hm.put(1,"vijay");    
			      hm.put(2,"kumar");    
			      hm.put(3,"ulasa");   
			       
			      System.out.println("\nThe elements of Hashmap are ");  
			      for(Map.Entry m:hm.entrySet()){    
			       System.out.println(m.getKey()+" "+m.getValue());    
			      }
			      
			     //HashTable
			       
			      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
			      
			      ht.put(4,"ram");  
			      ht.put(5,"lakshman");  
			      ht.put(6,"bharath");  
			      ht.put(7,"shatragn");  

			      System.out.println("\nThe elements of HashTable are ");  
			      for(Map.Entry n:ht.entrySet()){    
			       System.out.println(n.getKey()+" "+n.getValue());    
			      }
			      
			      
			      //TreeMap
			      
			      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
			      map.put(8,"lava");    
			      map.put(9,"kusa");    
			      map.put(10,"ulasa");       
			      
			      System.out.println("\nThe elements of TreeMap are ");  
			      for(Map.Entry l:map.entrySet()){    
			       System.out.println(l.getKey()+" "+l.getValue());    
			      }   
	}

}
