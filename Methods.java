package JavaRepeat;

import java.security.DomainCombiner;

public class Methods {
	
	//power
//	public static void pow(int a , int b) {
//		int c=1;
//		for(int i=1;i<=b;i++) {
//			c = c*a;
////			System.out.println(c);
//		}
//		System.out.println(c);
//	}
//		
//	public static void main(String[] args) {
//		pow(3,5);
//	}
//		
//----------------------------------------------------------------------------------------------
	
	//Prime or not using function
//		public static void isprime(int a) {
//			int num= a-1;
//			for(int i=2;i<=num;i++) {
//				if(a%i==0) {
//					System.out.println("Is not prime");
////					break;
//				}else {
//					System.out.println("Is prime");
////					break;
//				}
//				break;
//			}
//		}
//		public static void main(String[] args) {
//			isprime(7);
//		}
//		
//----------------------------------------------------------------------------------------
		//evenodd
	
//	public static void oddeven(int a) {
//		if(a%2==0) {
//			System.out.println("Is Even");
//		}else {
//			System.out.println("Number is odd");
//		}
//		
//	}
//	
//	public static void main(String[] args) {
//		oddeven(4);
//	}
	
//--------------------------------------------------------------------------------------------
	//afactorial
//	public static void Factorial(int a) {
//		int fact=1;
//		
//		for(int i=1;i<=a;i++) {
//			fact= fact*i;
//		}
//		System.out.println(fact);
//	}
//	
//	public static void main(String[] args) {
//		Factorial(3);
//	}
//	
//-------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------
	//Fabpnacci series 
	
//	public static void series(int ar) {
//		int a=0,b=1,c;
//		
//		for(int i=1;i<ar;i++) {
//			System.out.println(a);
//			c=a+b;
//			a=b;
//			b=c;
//		}
//	}
//	
//	public static void main(String[] args) {
//		series(10);
//	}
//--------------------------------------------------------------------------------------------

	//Print only even number in array using user defined method
	
//    public static void even(int ar[]) {
//    	
//    	for(int i=0;i<ar.length;i++) {
//       		if(ar[i] % 2==0) {
//    			System.out.println(ar[i]);
//    		}
//    	}
//    }
//	
//    public static void main(String[] args) {
//		int ar[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
//		
//		even(ar);
//	}
//----------------------------------------------------------------------------------------
	
	//Print sum of all number in array using user define method
	
//	public static void sum(int ar[]) {
//		int sum= 0;
//		for(int i=1;i<ar.length;i++) {
//			sum += ar[i];
//		}
//		System.out.println(sum);
//	}
//	
//	public static void main(String[] args) {
//		int ar[] = {1,2,3,4,5,6};
//		
//		sum(ar);
//	}
//	
	
//-------------------------------------------------------------------------------------
    
	public static void reverse(int ar[]) {
		int start = 0, end = ar.length - 1;
		while (start < end) {
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
			
		}
	}
	
    public static void printArray(int ar[]) {
        for (int value : ar) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("Original Array:");
        printArray(ar);

        reverse(ar);  // Call to user-defined reverse method

        System.out.println("Reversed Array:");
        printArray(ar);

	
	}
	
		
		
}
