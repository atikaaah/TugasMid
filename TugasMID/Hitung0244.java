//ATIKAH 13020210244

import java.util.Scanner;

public class Hitung0244 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai mil: ");
        double mil = input.nextDouble();

        double meter = mil * 1609.0;

        System.out.println("Hasil " + mil + " mil = " + meter + " meter");
    }
}
