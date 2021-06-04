package Assignment3;
import java.util.*;
import java.util.Scanner;

public class frequencyInArraySorted {
	public static void main(String args[]) {
	//taking inputs from user to initialize an array over which its element's frequency will be calculated subsequently
	int [] arr;//declaring the array
	Scanner sc = new Scanner(System.in);
	System.out.print("Ener the size of the array");
	int n = sc.nextInt();
	System.out.print("Enter the elements of this array");
	arr = new int[n]; //initializing the array, allocating memory to it
	
	for (int k=0;k<n;k+=1) {
		arr[k]= sc.nextInt();
	}
	//initializing an array which will store the frequencies of each element, it is of same size as the user arra ybecoz min frequency of each element can be 1 
	
	int [] frequencyArray = new int[n];
	//to mark that the array position is visited and counted once in user array we will mark that position also in frequency array
	int visitedMarker = -1;
	//calculating the frequency of each element in user array
	for (int i = 0;i<n;i+=1) {
		//counting the element visited
		int count = 1;
		//iterating to the remaining array to count the frequency of elemnt present in ith position of user array
		for(int j =i+1;j<n;j+=1) {
			if (arr[i]==arr[j]) {
				count+=1;
				frequencyArray[j]= visitedMarker;
			}
		}
		//now putting the frequency of ith position element  
		if(frequencyArray[i]!=visitedMarker) {
			frequencyArray[i]=count;
		}
	}
	//now printing the result which is the sorted frequency array
	Arrays.sort(frequencyArray);   
	System.out.println("Elements of array sorted in ascending order: ");  
	 
	for (int g = 0; g <n; g++)   
	{ 
		if(frequencyArray[g]!=-1) {
	System.out.println(frequencyArray[g]); }  
	}   
	}
}
