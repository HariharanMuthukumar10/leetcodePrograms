import java.util.Arrays;
import java.util.Scanner;

public class ArrayManupulations {
	
	Scanner sc = new Scanner(System.in);
	static ArrayManupulations obj=new ArrayManupulations();
	
	//get the integer array from user
	public int[] getIntArray(int size) {
		
		int[] intArray = new int[size];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<size;i++) {
			intArray[i]=sc.nextInt();
		}
		
		return intArray;
	}
	
	//get the String array from user
	public String[] getStringArray(int size) {
		String [] stringArray=new String[size];
		for(int i=0;i<size;i++) {
			stringArray[i]=sc.next();
		}
		
		return stringArray;		
	}
	
	//To sort the array with intermediate swap variable
	public int[] sortIntArray(int[] intArray) {
		//Arrays.sort(intArray);        //in build method
		int swap;
		for(int i=0;i<intArray.length;i++) {
			for(int j=i+1;j<intArray.length;j++) {
				if(intArray[i]<intArray[j]) {
					swap = intArray[i];
					intArray[i]=intArray[j];
					intArray[j]=swap;
				}
			}
		}
		return intArray;
	}
	
	//to printArray
	void printArray(int[]intArray) {
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}
	
	//to find maximum in the array
	public int maxElement(int[] intArray) {
		int max = 0;
		for(int i=0;i<intArray.length;i++) {
			for(int j=i+1;j<intArray.length;j++) {
				max=intArray[i]<=intArray[j]?intArray[j]:intArray[i] ;
					max=intArray[j];
			}
		}
		return max ;
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		
		int[] intArray = obj.getIntArray(size);  
		String[] stringArray = obj.getStringArray(size);
		int[] sortedArray = obj.sortIntArray(intArray);
		System.out.println("The sorted Array is...");
		obj.printArray(sortedArray);
		int max =obj.maxElement(intArray);
		System.out.println(max);
	}
}
