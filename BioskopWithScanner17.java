import java.util.Scanner;

public class BioskopWithScanner17 {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner (System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String [4][2];
        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc17.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc17.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc17.nextInt();
            sc17.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc17.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}