import java.util.Scanner;

public class Lianlian {

	/**public static void main(String[] args) {
	      double[] myList = {1.9, 2.9, 3.4, 3.5};

	      // 打印所有数组元素
	      for (double element: myList) {
	         System.out.println(element);
	      }
	      */
	      
	      
	      /**public static void main(String[] args) {
	    	  double[] myList = {1.9, 2.9, 3.4, 3.5};
	    	  
	    	  // 打印所有数组元素
	    	  for (double element: myList) {
	    		  System.out.println(element);
	    	  }
	      
	      
				public static void main(String[] args) {
	    		  int[] Array = {1, 2, 3, 5};
	    
	    		  for (int i = 0; i < Array.length; i++) {
	    		    System.out.println(Array[i] + " ");
	    		  }
	    		  */
	    		  
	    		 
	  
	    public static void main(String[] args) {  
	        Scanner scan = new Scanner(System.in); 
			
	        // 从键盘接收数据  

			//next方式接收字符串
	        System.out.println("next方式接收：");
	        // 判断是否还有输入
	        if(scan.hasNext()){   
	        	String str1 = scan.next();
	        	System.out.println("输入的数据为："+str1);  
	        }  
	   }
		
	}


