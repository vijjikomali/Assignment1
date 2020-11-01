import java.util.Arrays; 
  
class SortingArray1 { 
    
	
	// Writing a Function to get Sum of the numbers
	static int findSum(int arr[], int n) 
	{ 
	    int min = getMin(arr, n); 
	    int max = getMax(arr, n); 
	  
	    return min + max; 
	} 
	
	
	// Writing a Function to get the Product of the numbers 
	static int findProduct(int arr[], int n) 
	{ 
	    int min = getMin(arr, n); 
	    int max = getMax(arr, n); 
	  
	    return min * max; 
	} 
	  
	  
    // Writing a Function to get Minimum number
	static int getMin(int arr[], int n) 
    { 
		int res = arr[0]; 
		for (int i = 1; i < n; i++) 
        res = Math.min(res, arr[i]); 
		return res; 
    } 
  
// Writing a Function to get Maximum number
	static int getMax(int arr[], int n) 
	{ 
		int res = arr[0]; 
		for (int i = 1; i < n; i++) 
			res = Math.max(res, arr[i]); 
		return res; 
	} 
  



  
		// Printing the Functions requirement
	      
	    public static void main (String[] args) { 
	    int arr[] = { 99, 29, 521, 48, 67 }; 
	    int n = arr.length; 
	  
	    // Printing the Sum of Min and Max element 
	        System.out.println ("Sum = " + findSum(arr, n)); 
	  
    // Printing the  Product of Min and Max element 
        System.out.println( "Product = " + findProduct(arr, n)); 
        
    // Printing  the Maximum Number element
        System.out.println("Maximum number =" +getMax(arr,n));
    
    // Printing the Minimum number element
        
  
        System.out.println("Minimum number =" +getMin(arr,n));
          
          
    } 
} 