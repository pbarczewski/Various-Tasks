import java.util.ArrayList;
import java.util.List;

public class Duplicates {

    public List<Integer> findDuplicates(int[] numbers, int n) {

        int counter = 0;
        List<Integer> duplicates = new ArrayList<>();

        for(int i = 0 ; i < numbers.length ; i++ ) {

            for(int j = 0 ; j < numbers.length ; j++) {
                if(numbers[i] == numbers[j]) {
                    counter++;
                }
            }
            if(counter == n && !duplicates.contains(numbers[i])) {
                duplicates.add(numbers[i]);
            }
            counter = 0;
        }

        if(duplicates.size() == 0) {
            System.out.println("There is no duplicates");
        }

        return duplicates;

    }

}
