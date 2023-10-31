import java.util.Scanner;
public class BioskopWithScanner17_2 {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("======================================");
            System.out.println("     Selamat Datang Di Bioskop 1E");
            System.out.println("======================================");
            System.out.println("- Menu 1 : Input Data Penonton");
            System.out.println("- Menu 2 : Tampilkan Daftar Penonton");
            System.out.println("- Menu 3 : Exit");
            System.out.println("======================================");
            System.out.print("Masukkan Pilihan Anda : ");
            int choice = sc17.nextInt();
            sc17.nextLine(); 

             switch (choice) {
                case 1:
                System.out.print("Masukkan Nama : ");
                nama = sc17.nextLine();
                System.out.print("Masukkan Baris: ");
                baris = sc17.nextInt();
                System.out.print("Masukkan Kolom: ");
                kolom = sc17.nextInt();
                sc17.nextLine();

                penonton [baris - 1][kolom - 1]= nama;
                break;
            
                case 2:
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);

                        }
                    }
                }
                break;

                case 3:
                    System.out.println("Terima kasih!");
                    return; 
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang benar.");
            }

            System.out.print("Kembali ke menu? (y/n) : ");
            next = sc17.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
    }
}
}
