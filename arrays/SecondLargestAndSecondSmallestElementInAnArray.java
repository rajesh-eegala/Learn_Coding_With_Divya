/*Problem Statement:
Given an array, find the second smallest and second largest element in the array.
Print ‘-1’ in the event that either of them doesn’t exist.
 */
package arrays;
import java.util.Scanner;
public class SecondLargestAndSecondSmallestElementInAnArray {
    public static int getSecondLargestElement(int [] arr){
        int largest = arr[0];
        int secondLargest = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]!=largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static int getSecondSmallestElement(int [] arr){
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]!=smallest && arr[i]<secondSmallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in an array: ");
        int n = s.nextInt();
        // Use the CreateArray class to get the array
        int [] arr = CreateAndPrintArray.getArray(n);
        int secondLargest = getSecondLargestElement(arr);
        int secondSmallest = getSecondSmallestElement(arr);
        System.out.println("The second largest element in an array is: " +secondLargest);
        System.out.println("The second smallest element in an array is: " +secondSmallest);
    }
}
