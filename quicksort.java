import java.util.*;
public class Main {
    public static void main(String args[]) {
      Random rand = new Random(); //create a random object
      int[] numbers = new int[10]; //create an array, length of 10
      for(int i = 0; i < numbers.length; i++){ //randomly assign 10 integers from 0 -99 to the int array
          numbers[i] = rand.nextInt(100);//
      }
      System.out.println("Before: " + Arrays.toString(numbers)); // print out all the int in the array before sorting
     
      quicksort(numbers, 0, numbers.length - 1);
       System.out.println("After: " + Arrays.toString(numbers)); // print out all the int in the array after sorting
    }
    
    private static void quicksort(int[] array, int lowIndex, int highIndex){
        if ( lowIndex >= highIndex) {
            return;
        }
        int pivot = array[highIndex];
        int leftPointer = lowIndex; 
        int rightpointer = highIndex;
        while(leftPointer < rightpointer){
            while(array[leftPointer] <= pivot && leftPointer < rightpointer){
            leftPointer++;
            }
            while(array[rightpointer] >= pivot && leftPointer < rightpointer){
                rightpointer--;
            }
            swap(array, leftPointer, rightpointer);
        }
        swap(array, leftPointer, highIndex);
        
        quicksort(array, lowIndex, leftPointer - 1);
        quicksort(array, leftPointer + 1, highIndex);
    }
    
    private static void swap(int[] array, int index1, int index2){
        int tempValue = array[index1];
        array[index1] = array[index2];
        array[index2] = tempValue;
    }
        
}

