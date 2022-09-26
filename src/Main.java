import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 4, 4, 4, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("Медведь", "Собака", "Кошка", "Медведь", "Кошка", "Медведь", "Кошка", "Медведь"));
        printOddNumbers(nums);
        printEvenNumbers(nums);
        printUniqueWords(words);
        printNumberOfRepeats(words);


    }

    //    1st Task
    public static void printOddNumbers(List<Integer> list) {
        for (Integer number : list) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

    //    2nd Task
    public static void printEvenNumbers(List<Integer> list) {
        Collections.sort(list);
        int temp = 0;
        for (Integer number : list) {
            if (number % 2 == 0 && temp != number) {
                System.out.println(number);
                temp = number;
            }
        }
    }

//    3rd Task
    public static void printUniqueWords(List<String> list) {
        Set<String> uniqueWords = new HashSet<>(list);
        System.out.println(uniqueWords);
    }

//    4th Task
    public static void printNumberOfRepeats(List<String> list) {
        Set<String> unique = new HashSet<>(list);
        System.out.println(list.size() - unique.size());
    }

}