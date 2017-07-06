/*
 *here we are creating an application for the binary Search
 */
import java.util.Arrays;
import java.util.Scanner;
//here we are creating the class binary
public class Binary {
//here we are creating the main class
	public static void main(String[] args) {
			// TODO Auto-generated method stub

	// here we are using Scanner to take input from the user

			Scanner scanner=new Scanner(System.in);
			System.out.println("please enter the size of the integer array");
			int size=scanner.nextInt();
			int[] binary=new int[size];
			System.out.println("Please enter "+size+" elements");
			//here we are applying the for loop condition for checking he size
			for(int i=0;i<size;i++){
				binary[i]=scanner.nextInt();
			}
			
			System.out.println("Enter the element to search");
			int element =scanner.nextInt();

			// here we are sorting the array for the  binary search array should be sorted one.

			Arrays.sort(binary);
			for(int i=0;i<binary.length;i++){
				System.out.println(binary[i]);
				
			}

			int result=searchElement(binary,element);
			if(result==-1){
				System.out.println("Element is not found");
			}
			else{
				System.out.println("Element found at position "+result);
			}
		}

	//here we are creating the  Method to search the specific element in the array

		private static int searchElement(int[] binary, int element) {
			// TODO Auto-generated method stub
			
	//here we are applying the Logic to search an element in the array according to binary search

			int start=0;
			int end=binary.length-1;
			do{
				int mid=(start+end)/2;
				if(element==binary[mid]){
					
					return mid;
				}
				if(element<binary[mid]) {
					
					end=end-1;
				}
				if(element>binary[mid]){
					start=start+1;
				}
				
				
			}while(start<=end);
			return -1;
		}

	

	}


