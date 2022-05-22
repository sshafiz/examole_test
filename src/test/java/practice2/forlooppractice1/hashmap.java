package practice2.forlooppractice1;

import java.util.HashMap;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//city and country 3
HashMap<String,String>citycountry=new HashMap<String,String>();

citycountry.put("dhaka", "bangladesh");
	
citycountry.put("delhi", "india");
citycountry.put("sydney", "australlia");	
	
	//System.out.println(citycountry);

//access
//citycountry.get("dhaka");{
	//System.out.println(citycountry.get("dhaka"));}
	
//loop through HashMap	
//print key

 for(String i: citycountry.keySet ()){
	
	System.out.println(i);
	}
	//print value
 for(String i:citycountry.values()) {
	 System.out.println(i);
 }
	
	
	//print key and value
 for(String i:citycountry.keySet()) {
	 System.out.println(" key "+i+" value "+citycountry.get(i));{
		 
 }
 
 
 
	}
	
	
	
	
	
	}

}
