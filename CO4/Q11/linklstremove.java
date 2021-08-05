package javaprg;
import java.util.*;
public class linklstremove {
public static void main(String[] args) {
   LinkedList<String> list = new LinkedList<String>();      
        list.add("Bran");
        list.add("Sansa");
        list.add("Snow");
        list.add("Robb");
        list.add("Arya");
        list.add("Rickson");
        

 System.out.println("The Original linked list: " + list);

  list.clear();

  System.out.println("After removing : " + list);
}
}