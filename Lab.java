package lab1;

public class Lab 
{
	public static void labExample(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j; 
                }  
            }  
            int sNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = sNumber;  
        }  
    }  
	 
	public static void main(String a[]){  
	        int[] arr1 = {11,22,35,2,4,7,99,10,101,199,20,1,2,4,5,6,7};  
  
	        labExample(arr1);
	         
	        System.out.println("Selection Sort");  
	        for(int i:arr1){  
	            System.out.print(i+" ");  
	        }  
	    }  
	
}


