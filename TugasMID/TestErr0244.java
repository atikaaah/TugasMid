//ATIKAH 13020210244

import java.util.Scanner;

public class TestErr0244 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai integer: ");
        int i = input.nextInt();
        double k = 100.0;
        char c = 's';
        boolean falses = true;
        int j = i + 1;

        System.out.println("j adalah " + j + ", k adalah " + k + ", c adalah " + c + ", dan falses adalah " + falses);
    }
}
