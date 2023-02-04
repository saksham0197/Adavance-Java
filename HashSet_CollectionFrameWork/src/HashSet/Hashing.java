package HashSet;
import java.util.HashSet;
import java.util.Iterator;


public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet <Integer> set = new HashSet <Integer>();
		
		// add()
	    set.add(100);
	    set.add(200);
	    set.add(300);
	    set.add(400);
	    set.add(200);
	    
	    System.out.println(set);
	    
	    //size()
	    System.out.println("The Size of set is : "+ set.size());
	    
	    //search()
	    if(set.contains(300)) {
	    	System.out.println("it is present bro");
	    }
	    if(!set.contains(700)) {
	    	System.out.println("it is Not present bro");
	    }
	    
	    //Delete()
	    set.remove(100);
	    System.out.println("ohh great!! 100 is removed");
	    
	 
	    
	    //isEmpty()
	    if(!set.isEmpty());
	    System.out.println("Set is Not Empty");

	}

}
