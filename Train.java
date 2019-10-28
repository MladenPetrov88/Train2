import java.util.*;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        List<Integer> passengers = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            passengers.add(Integer.parseInt(array[i]));
        }

        while (!input.equals("end")) {
            String[] temp = input.split(" ");
            if (temp[0].equals("Add")) {
                passengers.add(Integer.parseInt(temp[1]));
            } else {
                for (int i = 0; i < passengers.size(); i++) {
                    int a = Integer.parseInt(temp[0]);
                    int b = passengers.get(i);
                    if (a + b <= maxCapacity) {
                        passengers.set(i, (a + b));
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (Integer number : passengers) {
            System.out.print(number + " ");
        }
    }
}
