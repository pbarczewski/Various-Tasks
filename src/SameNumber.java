import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SameNumber {

    //Write a function that returns true if two arrays have the same number of unique elements, and false otherwise.


    public boolean same(int[] numbers, int[] otherNumbers) {

        List<Integer> withoudDup = new ArrayList<>();
        List<Integer> secondArrayWithoutDup = new ArrayList<>();


        for(int i = 0 ; i < numbers.length ; i++) {
            if(!withoudDup.contains(numbers[i])) {
                withoudDup.add(numbers[i]);
            }
        }
        for(int i = 0 ; i < otherNumbers.length ; i++) {
            if(!secondArrayWithoutDup.contains(otherNumbers[i])) {
                secondArrayWithoutDup.add(otherNumbers[i]);
            }
        }

        if(withoudDup.size() == secondArrayWithoutDup.size()) {
            return true;
        }

        return false;

    }



}
