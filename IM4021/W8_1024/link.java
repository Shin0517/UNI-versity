import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class practice_1024 {
    public static void rearrangeOddNumbers(List<Integer> numbers) {
        ListIterator<Integer> iterator = numbers.listIterator();
        LinkedList<Integer> oddNumbers = new LinkedList<>();
        
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 != 0) {
                oddNumbers.add(number);
                iterator.remove();
            }
        }

        numbers.addAll(oddNumbers);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>(List.of(11, 22, 3, 14, 5, 66, 7));
        rearrangeOddNumbers(numbers);
        System.out.println("List with Odd Numbers Rearranged: " + numbers);
    }
}
