public class PrimeNumbers {


    //Create a function that finds how many prime numbers there are, up to the given integer.


    public int primeNumbers(int number) {

        int howManyPrime = 0;
        int primeNumbers = 0;
        while (number >= 1) {

            for(int i = 1 ; i <= number ; i++) {
                if(number % i == 0) {
                    howManyPrime++;
                }
            }
            if(howManyPrime == 2) {
                primeNumbers++;
            }

            howManyPrime = 0;
            number--;
        }

        System.out.println(primeNumbers);
        return howManyPrime;
    }


}
