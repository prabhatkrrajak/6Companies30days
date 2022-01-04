import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}

// } Driver Code Ends


class GfG
 {
	String encode(String str)
	{
          //Your code here
          int count = 0;
          StringBuilder sb = new StringBuilder();
          for(int i = 0;i<str.length()-1;i++){
              count++;
              char chforward = str.charAt(i+1);
              char chcurr = str.charAt(i);
              if(chforward != chcurr){
                  sb.append(chcurr);
                  sb.append(count);
                  count = 0;
              }
          }
          sb.append(str.charAt(str.length()-1));
          sb.append(count+1);
          return sb.toString();
    }
	
 }
