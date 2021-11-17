//assignments question 4 of collection
package collections;
import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class assign4Collection {

	public static void main(String[] args) {
		
	
		List<LocalDate> ll=new LinkedList<>();
		ll.add(LocalDate.of(1999,Month.APRIL,19));
		ll.add(LocalDate.of(2004,Month.FEBRUARY,28));
		ll.add(LocalDate.of(2001,Month.JANUARY,8));
		ll.add(LocalDate.of(2000,Month.JULY,21));
		ll.add(LocalDate.of(2003,Month.JUNE,10));
		ll.add(LocalDate.of(2005,Month.DECEMBER,25));
		ll.add(LocalDate.of(2006,Month.OCTOBER,10));
		ll.add(LocalDate.of(2008,Month.MARCH,8));
		ll.add(LocalDate.of(2009,Month.SEPTEMBER,20));
		ll.add(LocalDate.of(1997,Month.NOVEMBER,29));
		
		for(LocalDate ld: ll)
		{
			if(ld.isLeapYear())
			{
				System.out.println("Your date of birth is "+ld+" and it was leap year");
			}
			else
			{
				System.out.println("Your date of birth is "+ld+" and it was not leap year");
			}
		}
	
}
}

