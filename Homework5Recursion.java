public class Homework5Recursion{

   public static int sum(int number) {
      if (number > 0){
         return number + sum(number - 2);
      }
      return 0;
   }
   
   public static void main (String[] args) {
      System.out.println(sum(30));
   }
}