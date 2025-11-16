package basics;

import java.util.Arrays;

public class StringsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello";
		String s2 = "hello"; // It doesn't create a new instance
		System.out.println(s1 == s2); // true; == operator is used for address comparison.
		System.out.println(s1.equals(s2)); // true; .equals() method is used for content comparison.
		
		System.out.println(s2.length()); // length() is a method
		
		String s3 = new String("hello"); // Creates a new string object in heap memory and the literal "hello" will be placed in the string constant pool.
		s3.concat("world");
		System.out.println(s3); // hello, as strings are immutable.
		
		System.out.println(s1 == s3); // false
		System.out.println(s1.equals(s3)); // true
		
		s3 = s3.concat("world");
	    System.out.println(s3); // helloworld, still hello object is not modified. A new string is created
		
	    StringBuilder sb = new StringBuilder("hello");
	    sb.append("world");
	    System.out.println(sb); // helloworld, as StringBuilder objects are mutable.
	    
	    sb.setCharAt(1, 'o');
	    System.out.println(sb); // holloworld
	    
	    String s4 = "This is Test";
	    System.out.println(s4.charAt(0)); //T; s4[0]; this doesn’t work in JAVA
	    System.out.println(s4.substring(1,3)); //hi
	    System.out.println(s4.indexOf("is")); //2
	    System.out.println(s4.lastIndexOf("s")); //10
	    System.out.println(s4.endsWith("Test")); //true
	    System.out.println(s4.endsWith("est")); //true
	    System.out.println(s4.endsWith("Best")); //false
	    System.out.println(s4.startsWith("This")); //true
	    System.out.println(s4.isEmpty()); //false
	    System.out.println(s4.equals("This is Test")); //true
	    System.out.println(s4.equalsIgnoreCase("this is Test")); //true
	    System.out.println(s4.concat(" String")); //This is Test String
	    System.out.println(s4.toUpperCase()); //THIS IS TEST
	    System.out.println(s4.toLowerCase()); //this is test
	    
	    String[] arr = s4.split(" ");
	    System.out.println(Arrays.toString(arr)); // [This, is, Test]
	    
	    // Sort string
	    char[] ca = s1.toCharArray();
        Arrays.sort(ca);
        System.out.println(ca); // ehllo
        
        char ch = 'a';
        System.out.println(ch); // a
        ch = 90;
        System.out.println(ch); // Z
        
        Character chh = 'a';
        System.out.println(Character.isLetter(chh)); // true
        System.out.println(Character.isDigit(chh)); // false
        System.out.println(Character.isUpperCase(chh)); // false
        System.out.println(Character.toUpperCase(chh)); // A
        System.out.println(chh.charValue()); // a
        
        Character chhh = 'b';
        System.out.println(Character.compare(chh, chhh)); // -1
        System.out.println(chh == chhh); // false
        System.out.println('a' + 1);
        
        Character chhhh = '4';
        // isDigit
        if (chhhh >= '0' && chhhh <='9') {
        	System.out.println("YES DIGIT");
        }
        
        Character chhhhh = 'Z';
        if ((chhhhh >= 'A' && chhhhh <= 'Z') || (chhhhh >= 'a' && chhhhh <= 'z')) {
        	System.out.println("YES LETTER");
        }
	}

}
