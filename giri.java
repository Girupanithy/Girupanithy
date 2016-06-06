import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	String reverse = "";
     
    public String reverseString(String str)
    {
        if(str.length() == 1)
        {
            return str;
        } 
        else 
        {
            reverse += str.charAt(str.length()-1)
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }
    public static void main(String arg[])
    {
        Ideone srr = new Ideone();
        Scanner scan=new Scanner(System.in);
        String input;
        input=scan.next();
        System.out.println(srr.reverseString(input));
		
	}
}
