import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class Homework4JavaLoops {
   public static void main(String[] args){		
      Scanner scnr = new Scanner (System.in);
      System.out.print("Enter how long you wish the array to be (Press ENTER when done): ");
      int arrayLength = scnr.nextInt();
      System.out.println("");      
      int [] numArray = new int [arrayLength];
      System.out.print("Enter any " + arrayLength + " numbers you wish (Press ENTER when done): ");
      for (int i = 0; i < arrayLength; i++){
         numArray[i] = scnr.nextInt();
      }
      System.out.println("");
      System.out.print("Your array is: ");                               // outputs the first X numbers that the user typed in (depends what they selected above)
      for(int h = 0; h < arrayLength; h++){                                 
         System.out.print(numArray[h]);                                  // prints those numbers in the order in which they were typed
         System.out.print(" ");
      }
      System.out.println("");
      Arrays.sort(numArray);                                             // sorts the array in numerical order
      System.out.print("The array sorted in numerical order is: ");      // outputs the array in (now) numerical order
      for(int j = 0; j < arrayLength; j++){
         System.out.print(numArray[j]);
         System.out.print(" ");                                          // prints the above statements
      }
      System.out.println("");
      System.out.print("The even numbers in the array are: ");           // tells the user which numbers are even throughout the array that they constructed
      for(int m = 0; m < arrayLength; m++){
         if (numArray[m] % 2 == 0){                                      // checks to see if the number in question is divisible by 2, with a remainder of 0, 
            System.out.print(numArray[m] + " ");                         // proving that it is an even number, prints these numbers separately 
         }
         else{
         }
      }
      
      
   } 
      
} 
        

