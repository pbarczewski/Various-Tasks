public class Consecutive {


    //Create a function that determines whether elements in an array can be re-arranged
    // to form a consecutive list of numbers where each number appears exactly once.


     public boolean cons(int[] numbers) {

         int min = numbers[0] ;
         int max = numbers[0];

         for(int i = 0  ; i < numbers.length ; i++) {
             if(min > numbers[i]) {
                 min = numbers[i];
             }
             if(max < numbers[i] ) {
                 max = numbers[i];
             }
         }
         int sumOfFirstArray = sum2(max);
         int sumOfSecondArray = sum(numbers, numbers.length);

         if(sumOfFirstArray == sumOfSecondArray) {
             return true;
         }

        return false;

     }

     public int sum(int[] number, int counter) {

         if(counter <= 0) {
             return 0;
         }

         return sum(number, counter -1) + number[counter - 1];
     }


     public int sum2(int number) {

         if(number <= 0) {
             return 0;
         }
         return sum2(number -1 ) + number ;

     }
}
