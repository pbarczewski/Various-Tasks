import java.util.Iterator;

public class ReverseOdd {

    //Given a string, reverse all the words which have odd length. The even length words are not changed.
    //There is exactly one space between each word and no punctuation is used.


    public String reverse(String word) {


        String[] strings = word.split(" ");
        StringBuilder reversed = new StringBuilder();

        String newWord = "";

        if(strings.length > 1) {
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].length() % 2 != 0) {
                    newWord = new StringBuilder(strings[i]).reverse().toString();
                } else {
                    newWord = strings[i];
                }
                reversed.append(newWord);
                if (i != strings.length - 1) {
                    reversed.append(" ");
                }

            }
        } else {
            reversed = new StringBuilder(strings[0]).reverse();
        }


        return reversed.toString();

    }


}
