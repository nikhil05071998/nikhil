package zeal;

public class class1 
{
public static void main(String[] args) 
{
	String x ="nokia";
	//1. name.length() 
	
	System.out.println(x.length());
	
	//2 name.charAt(index)
	
		System.out.println(x.charAt(3));
		
	//3 name.concat("sring")
		
	String b= " 2.1";
	System.out.println(x.concat(b));
	
	//4 name.touppercase
	
	System.out.println(x.toUpperCase());
	
	//5 name.tolowercase
	
	System.out.println(x.toLowerCase());
	
	//6 name.startswith
	
//	System.out.println(x.startsWith("no"));
	//System.out.println(x.startsWith("NO"));
	
	//7 name.endswith
	
	//System.out.println(x.endsWith("kia"));
	//System.out.println(x.endsWith("KIA"));
	
	//8 name.equels()
	
	String m ="NIKHIL";
	String n ="nikhil";
	System.out.println(m.equals(n));
	
	//9 name.equalsIgnoreCase()
	
	System.out.println(m.equalsIgnoreCase(n));
	
	//10 name.== operator()
	
	System.out.println(m==n);
	
	//11 name.substring(index)
	
	System.out.println(m.substring(3));
	System.out.println(m.substring(1,4));
	
	//12 name.trim()
	
	String v =" NIKHIL ";
	System.out.println(v.trim());
	System.out.println(v.length());
	
	}	
}