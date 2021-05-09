package javaprg;

public class stinghandling {


	    public static void main(String[] args) 
	    {
	        String s1 = "Hello";
	        String s2 = "World";
	        String s3 = "";
	        String s4 = "                       This is a STRING        ";
	        System.out.println("String 1:"+s1);
	        System.out.println("String 2:"+s2);
	        System.out.println("String concatenation:"+s1.concat(s2));
	        System.out.println("String length of first string:"+s1.length());
	        System.out.println("String comparison of two strings:"+s1.compareTo(s2));
	        System.out.println("String 2 empty or not:"+s2.isEmpty());
	        System.out.println("String 3 empty or not:"+s3.isEmpty());
	        System.out.println("Before trimming:"+s4);
	        System.out.println("After String trim:"+s4.trim());
	        System.out.println("String toLowerCase():"+s1.toLowerCase());
	        System.out.println("String toUpperCase():"+s2.toUpperCase());
	        System.out.println("String replace():"+(s1.replace("H", "B")));
	        System.out.println("Character Position value:"+s2.charAt(0));
	        System.out.println("String equals():"+s1.equals(s2));
	        
	    }
}
