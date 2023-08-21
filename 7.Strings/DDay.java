import java.util.*;
public class DDay
{
	public static void main(String[] args) {
	
	
	
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	
	while(n-- >0)
	{
	    String str=sc.next();
	    String temp="";
	    
	     for(int i=0;i<str.length();i++)  {
	      
	      if(str.charAt(i)-i -'a'>0)
	      temp+= (char) (str.charAt(i)-i);
	      
	      else {
	          int diff= 'a'- (str.charAt(i)-i)-1;
	          temp+= (char) ('z'-diff);
	      }
	      
	      
	  }
	  
	    if(!IsPalindrome(temp))
	      System.out.print(str);
	    
	}
	

	}
	
	public static boolean IsPalindrome(String str) {
	    
	    int n=str.length()-1;
	    
	    for(int i=0;i<str.length()/2;i++){
	        if(str.charAt(i)!=str.charAt(n-i)) return false;
	    }
	    
	    return true;
	}
	
	
}
