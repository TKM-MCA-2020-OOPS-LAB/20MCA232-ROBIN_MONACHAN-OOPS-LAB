package javaprg;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class linkedhastset {

				public static void main(String[] args) {
					
					Set<Integer> s = new LinkedHashSet<Integer>();
					System.out.println("Enter the limit to be added");
					Scanner inp=new Scanner(System.in);
					int n=inp.nextInt();
					System.out.println("Enter the Number:");
					while(n!=0) {
						int e = inp.nextInt();
						s.add(e);
						n--;
					}
					System.out.println("Set is "+s);
					
					
					System.out.println("Enter the number to be deleted:");
					int d= inp.nextInt();
					
					if(s.remove(d)) {
						System.out.println("Removed!!"+s);
					
					}
					else {
						System.out.println("Element is not in the set");
					}
					
					Iterator<Integer> l = s.iterator();
					while(l.hasNext())
					System.out.println(l.next());
				}
					
}
