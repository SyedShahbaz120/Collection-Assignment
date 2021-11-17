//collections A2

package collections;
import java.util.*;  
public class Assign2Collection {

	public static void main(String[] args) {
	
		
		product p1 = new product("Kurkure");
		product p2 = new product("oreo");
		product p3 = new product("cocacola");
		product p4 = new product("pepsi");
		product p5 = new product("maggi");
		product p6 = new product("redbull");
		product p7 = new product("mountaindew");
		product p8 = new product("parleG");
		product p9 = new product("pizza");
		product p10 = new product("burger");
		
		
		HashSet<product> set=new HashSet<product>();  
        set.add(p1);    
        set.add(p2);    
        set.add(p3);  
        set.add(p4); 
        set.add(p5);    
        set.add(p6);    
        set.add(p7);  
        set.add(p8);
        set.add(p9);  
        set.add(p10);
        
        System.out.println(set);
		
  
	}
}
		
	
	class product
	{
		String name ;
		public product(String name)
		{
			this.name = name;
		}
		
		@Override
		public String toString()
		{
			return "Product name: " +name;
		}
		
		
	}
	


