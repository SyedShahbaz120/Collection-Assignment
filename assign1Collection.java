//assignment 1 of collections
package collections;
import java.util.TreeMap;
import java.util.*;
 


public class assign1Collection
{
	public static void main(String[] args) {
		Long a = Long.valueOf(8722728269L);
		Long b = 1111122222l;
		Long c = 1111444322l;
		
		contact o1 = new contact(a , " steve", " steve@gamil.com" , Gender.male);
		contact o2 = new contact(b ,  " eleven",  " eleven@gamil.com" , Gender.female);
		contact o3 = new contact(c ,  " mike",  " mike@gamil.com" , Gender.male);
	
		
		TreeMap<Long,contact> i = new TreeMap<Long,contact>(Collections.reverseOrder());
		i.put(a,o1);
		i.put(b,o2);
		i.put(c,o3);
		
		System.out.println("key - Value pairs: ");
		for (Map.Entry<Long, contact> entry : i.entrySet())
		{
			System.out.println(entry.getKey()+ " = " +entry.getValue());
		}
		
		System.out.println("keys: ");
		for (Map.Entry<Long, contact> entry : i.entrySet())
		{
			System.out.println(entry.getKey());
		}
		
		
		System.out.println("values: ");
		for (Map.Entry<Long, contact> entry : i.entrySet())
		{
			System.out.println(entry.getValue());
		}
				
	}
}

enum Gender{
	male,female;
}

class contact{
	
    Long phone_no;
	String name;
	String email;
	Gender gender;
	
	public contact(Long phone_no, String name,String email, Gender gender)
	{
		this.phone_no= phone_no;
		this.name= name;
		this.email=email;
		this.gender= gender;
	}
	@Override
	public String toString()
	{
		return "name: " +name + " phone_no: " + phone_no+ " email: " + email;
	}
	
}






