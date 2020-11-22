public class Palindrome {


    //A string is an almost-palindrome if, by changing only one character,
    // you can make it a palindrome. Create a function that returns true if
    // a string is an almost-palindrome and false otherwise.



    public boolean almostPalindrome(String palindrome) {

        char[] chars = palindrome.toCharArray();

        int counter = 0;
        int howManyDifferences = 0;

        int counter2 = chars.length -1;
        while (counter < chars.length / 2 ) {

            if(chars[counter] != chars[counter2]) {
                howManyDifferences++;
            }

            counter++;
            counter2--;
        }

        if (howManyDifferences > 1) {
            return false;
        }


        return true;
    }

}
