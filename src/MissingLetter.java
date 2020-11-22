import java.util.Arrays;

public class MissingLetter {


    //Create a function that takes an array of increasing letters and return the missing letter.

    //    Tests will always have exactly one letter missing.
    //    The length of the test array will always be at least two.
    //    Tests will be in one particular case (upper or lower but never both).



    public char missingLetter(String[] letters) {

        Arrays.sort(letters);
        String allTogether = "";

        for(String singleString: letters) {
            allTogether += singleString;
        }
        char[] chars = allTogether.toCharArray();
        char missingLetter = ' ';
        char i = chars[0];
        int counter = 0;
        while (counter < chars.length) {

            if(i != chars[counter]) {
               missingLetter = i;
                break;
            }
            counter++;
            i++;
        }

        return missingLetter;

    }


}
