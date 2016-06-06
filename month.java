import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.SimpleDateFormat;
class Date_DDMMYY
{   
    public static void main(String args[])throws IOException
    {   
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int l, y, d, m;
        String dd, mm, yy;
 
       
        int maxdays[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
 
       
        String month[]={ "", "January", "February", "March", "April", "May", "June", "July", "August",
                         "September", "October", "November", "December" };
 
       
        String date = br.readLine(); 
 
        l = date.length(); 
 
        if(l==8) 
        {
            dd = date.substring(0,2); 
            mm = date.substring(2,4); 
            yy = date.substring(4); 
            d = Integer.parseInt(dd); 
            m = Integer.parseInt(mm); 
            y = Integer.parseInt(yy); 
 
            if((y%400==0) || ((y%100!=0)&&(y%4==0))) 
            {
                maxdays[2]=29;
            }
             
            
 
            if(m<0 || m>12 || d<0 || d>maxdays[m] || y<0 || y>9999) // Performing Date Validation
            {
            System.out.println("The day, month or year are outside acceptable limit");
            }
 
            else
            {
                
               
                System.out.println(month[m]);
            }
        }
 
        else
            System.out.println("Wrong Input");
    }
}
