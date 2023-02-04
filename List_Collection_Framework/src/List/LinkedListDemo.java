package List;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al = new LinkedList<String>();
		al.add("Google");
		al.add("Amazon");
		al.add("Infosys");
		al.add("Microsoft");
		al.add("TCS");
		al.add("Tech Mahindra");
		al.add("Accenture");
		
		System.out.println(al);
		
		 al.remove("TCS");  
         System.out.println("After invoking remove(object) method: "+al);   
         
         al.remove(0);  
         System.out.println("After invoking remove(index) method: "+al); 
         
         LinkedList<String> al2=new LinkedList<String>();  
         al2.add("PWC");  
         al2.add("HSBC"); 
         
         al.addAll(al2);  
         System.out.println("Updated list : "+al);
         
         al.removeAll(al2);  
         System.out.println("After invoking removeAll() method: "+al); 
         
         al.removeFirstOccurrence("Infosys");  
         System.out.println("After invoking removeFirstOccurrence() method: "+al); 
         
         al.removeLastOccurrence("Tech Mahindra");  
         System.out.println("After invoking removeLastOccurrence() method: "+al); 
         
         al.removeFirst();  
         System.out.println("After invoking removeFirst() method: "+al);
         
         al.removeLast();  
         System.out.println("After invoking removeLast() method: "+al); 
         
         al.clear();  
         System.out.println("After invoking clear() method: "+al); 
         
       


	}

}
