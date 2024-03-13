package OOPs2_generics;

import java.util.*;

	// [1]
//	class Student {
//	}
//	class EnggStudent extends Student {
//	}
//	class Test	{
//	    public static void main(String args[])	{
//	    	ArrayList<Student> al1 = new ArrayList<>();
//	        ArrayList<EnggStudent> al2 = new ArrayList<>();
//	        al1 = al2; 
//	    }
//	}	
// this program throws a compiler error as ArrayList EnggStudent cannot be converted to ArrayList Student.
//	application of Generics failed during inheritance.
//	Unlike arrays, different instantiations of a generic type are not compatible with each other, not even explicitly.

	// 	[2]
// This incompatibility may be softened by the wildcard if ? is used as an actual type parameter.
//	class Student
//	{
//	
//	}
//	class EnggStudent extends Student
//	{
//	
//	}
//
//	class Test
//	{
//	    public static void main(String args[])
//	    {
//	        ArrayList<?> al1 = new ArrayList<>(); // ? is known as wildcard and is used as unknown type.
//	        ArrayList<EnggStudent> al2 = new ArrayList<EnggStudent>();
//	        al1 = al2;
//	    }
//	}	

//	[3]	
// Java code to illustrate working
// of Wildcards in Generics
	import java.util.*;

	// Parent class
	class Student	{
	    void print()	    {
	        System.out.println("Student");
	    }
	}
	class EnggStudent extends Student	{
	    void print()	    {
	        System.out.println("EnggStudent");
	    }
	}
	class MgmtStudent extends Student	{
	    void print()	    {
	        System.out.println("MgmtStudent");
	    }
	}

	public class wildCardsInGenerics
	{
	    static void printStudents(ArrayList<? extends Student> al)
	    {
	        for (Student s: al) {
	        	s.print();
	        }
	    }
	    
	    public static void main (String[] args) {
	        ArrayList<EnggStudent> al1 = new ArrayList<>(); 
	        // Adding EnggStudent to al1
	        al1.add(new EnggStudent());
	        al1.add(new EnggStudent());	        
	        // Creating ArrayList of MgmtStudent
	        ArrayList<MgmtStudent> al2 = new ArrayList<>();	        
	        // Adding MgmtStudent to al2
	        al2.add(new MgmtStudent());	        
	        // Calling the general purpose StringIndexOutOfBoundsException
	        printStudents(al1);
	        printStudents(al2);
	    }
	}