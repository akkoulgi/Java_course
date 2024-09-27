package exception_;

public class Demo {

	public static void main(String[] args) {

		  String ptr=null;
		  try {
		  if (ptr.equals("gfg")) 
			  
			 throw new NullPointerException("Handled null poinyter");

		  
		  else
		  
		  System.out.print("Not Same"); // Null pointer 
		  
		  ;
		  }
		 catch (Exception e) {

			 e.printStackTrace();
		 }
		
		int a = Integer.parseInt("yuas"); // Number format exception
      System.out.println(a);
		
		 int i =10;
		 
		 System.out.println(i/0);
		 
		  int arr[] = new int[3];
		  
		  //arr[4]=9;
		         
      //System.out.println(arr[4]);
      
      
      
      String sm="india";
      
      
      try {
      	
      for (int j = 0; j <= sm.length(); j++) {
			
      	System.out.println(sm.charAt(6));
      	
      	
		}
  
      } // end of try block
      
      
      catch(StringIndexOutOfBoundsException e) {
      	
      	e.printStackTrace();
      	System.out.println("Handled string out of bounds");
      	
      }
      
      catch(ArrayIndexOutOfBoundsException e) {
      	
      	e.printStackTrace();
      	System.out.println("Handled string out of bounds");
      	
      }
      
      
      
      finally {
  		System.out.println(+20+"is the value"); // 20 is the value	
  		System.out.println("new line");

		}
      
		
		//System.out.println(st/0);
	}

		
		
	

}
