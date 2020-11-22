public class UnmixString {


//lPaeesh le pemu mnxit ehess rtnisg!
// Oh, sorry, that was supposed to say: Please help me
// unmix these strings!
//
//Somehow my strings have all become mixed up;
// every pair of characters has been swapped.
// Help me undo this so I can understand my strings again.


    public String unmix(String sentence) {

        char[] chars = sentence.toCharArray();

        for(int i = 1 ; i < chars.length ; i+=2) {

             char temp = chars[i - 1];
             chars[i - 1 ] = chars[i];
             chars[i] = temp;

        }

        String unmixed = String.valueOf(chars);

        return unmixed;

    }


}
