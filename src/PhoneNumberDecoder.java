import java.util.HashMap;
import java.util.Map;

public class PhoneNumberDecoder {

    //Create a program that converts a phone number with letters to one with only numbers.
    //Number	Letter
    //0	none
    //1	none
    //2	ABC
    //3	DEF
    //4	GHI
    //5	JKL
    //6	MNO
    //7	PQRS
    //8	TUV
    //9	WXYZ

    //All inputs will be formatted as a string representing
    // a proper phone number in the format XXX-XXX-XXXX or (XXX)XXX-XXXX, using numbers and capital letters.


    public void textToNum(String number) {
        char[] chars = number.toCharArray();
        int toReplace = 0;
        for (int i = 0 ; i < chars.length; i++) {
            if(Character.isAlphabetic(chars[i])) {
                String letter = String.valueOf(chars[i]);
                toReplace = numbers(letter);
                chars[i] = (char) (toReplace + '0');
            }
        }
        String replaced = String.valueOf(chars);
        System.out.println(replaced);
    }


    public int numbers(String letter) {

        int numberToReplace = 0;
        Map<Integer, String> numbers = new HashMap<>();

        numbers.put(2, "ABC");
        numbers.put(3, "DEF");
        numbers.put(4, "GHI");
        numbers.put(5, "JKL");
        numbers.put(6, "MNO");
        numbers.put(7, "PQRS");
        numbers.put(8, "TUV");
        numbers.put(9, "WXYZ");


        for(Map.Entry<Integer, String> stringEntry : numbers.entrySet())
        {
            if(stringEntry.getValue().contains(letter)) {
                numberToReplace = stringEntry.getKey();
                break;
            }
        }

        return numberToReplace;
    }


}
