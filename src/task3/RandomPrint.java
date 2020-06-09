package task3;

import java.util.Random;

public class RandomPrint {
    public void printRandomNumbers(int count) {
        Random random = new Random();
        int[] ms = new int[count];
        for (int i = 0; i < count; i++) {
            ms[i] = random.nextInt(1000);
            System.out.print(ms[i] + " ");
        }
        for (int i = 1; i < count; i++) {
            System.out.print("\n" + ms[i]);
        }
    }
}
