public class RecuresionArray {

    //Write a function that finds the sum of an array. Make your function recursive.
    //Return 0 for an empty array.

    public int sumArray(int[] numbers, int num) {

        if (num <= 0 || numbers.length == 0) {
            return 0;
        }
       return sumArray(numbers, num -1) + numbers[num -1];

    }




}
