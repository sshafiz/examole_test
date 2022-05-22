package practice2.forlooppractice;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//ArrayList<datatype>variablename=new ArrayList<datatype>();
		
ArrayList<String>car=new ArrayList<String>();		
	
	car.add("toyota");
	car.add("bmw");
	car.add("marsedes");
	car.add("honda");
	car.add("tesla");
	
	//add country name.
	
//ArrayList<String>countryname= new ArrayList<String>();	
	
	//countryname.add("bangladesh");
	//countryname.add("usa");
	//countryname.add("japan");
	//countryname.add("france");
	//countryname.add("greece");
	
	
	//accsess
	
	//countryname.get(4);
	//System.out.println(countryname.get(4));
	
	
	//change
	
	//countryname.set(2, "german");
	//System.out.println(countryname.set(2, "german"));
	
	//remove
	//countryname.remove(2);
	//System.out.println(countryname.remove(2));
	
	//arraylist forllop

	
	
ArrayList<String>countryname= new ArrayList<String>();	
	
	countryname.add("bangladesh");
	countryname.add("usa");
	countryname.add("japan");
	countryname.add("france");
	countryname.add("greece");
	
	for(int a=0;a<countryname.size();a=a+1) {
	
	System.out.println(countryname.get(a));
	
	}
	}
}
