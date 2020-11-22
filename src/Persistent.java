public class Persistent {

    //Create a function that takes a number and returns
    // its multiplicative persistence, which is the number of times
    // you must multiply the digits in num until you reach a single digit.


    public int bugger(int x) {

        int counter = 0;

        while (true) {

            char[] numbers = Integer.valueOf(x).toString().toCharArray();


            if(numbers.length > 1) {
                x = 1;
                counter++;
                for (int i = 0; i < numbers.length; i++) {
                    int number = Character.getNumericValue(numbers[i]);
                    x *= number;
                }
            }

            if(numbers.length == 1) {
                return counter;
            }

        }


    }

}
