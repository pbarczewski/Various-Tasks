public class SevenBoom {

    //Create a function that takes an array of numbers and return "Boom!"
    // if the number 7 appears in the array. Otherwise, return "there is no 7 in the array".


        public void sevenBoom(int[] numbers) {

            Boolean isIt = false;

            for(int i = 0 ; i < numbers.length ; i++) {
                    String number = String.valueOf(numbers[i]);

                    if(number.contains("7")) {
                        isIt = true;
                        break;
                    }

            }

            if(isIt) {
                System.out.println("Boom!");
            } else {
                System.out.println("There is no 7 in the array");
            }

        }

}
