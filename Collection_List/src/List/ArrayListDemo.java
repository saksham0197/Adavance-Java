package List;
import java.util.*;  
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Google");
		al.add("Amazon");
		al.add("Infosys");
		al.add("Microsoft");
		al.add("TCS");
		al.add("Tech Mahindra");
		al.add("Accenture");
		
		System.out.println(al);
		
		//Traversing list through Iterator  
		
	    Iterator itr=al.iterator();//getting the Iterator  
		while(itr.hasNext())//check if iterator has the elements 
		{
	    System.out.println(itr.next());
		}
		
		System.out.println("=====FOR LOOP====");
		  for(String fruit:al)    
		    System.out.println(fruit); 
		  
		  System.out.println("=====get set Method in list====");			
		  System.out.println("Returning element: "+al.get(1));
		  al.set(3, "Exzeo");
		  System.out.println(al);
		  
		  System.out.println("=====Sorting of List====");		  
		  Collections.sort(al);
		  System.out.println(al);

	}

}
