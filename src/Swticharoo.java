public class Swticharoo {

    //Create a function that takes a string and returns a new string with its first and last characters swapped, except under three conditions:
    //If the length of the string is less than two, return "Incompatible.".
    //If the first and last characters are the same, return "Two's a pair.".

    //Notes
    //
    //Tests are case sensitive (e.g. "A" and "a" are not the same character).

    public String flipEndChars(String flipMe) {

        char[] chars = flipMe.toCharArray();

        if(flipMe.length() == 2) {
            return "Incompatible.";
        }
        if(chars[0] == chars[flipMe.length() - 1]) {
            return  "Two's a pair";
        }
            char temp = chars[0];
            chars[0] = chars[flipMe.length() - 1];
            chars[flipMe.length() - 1] = temp;

            return String.valueOf(chars);

    }


}
