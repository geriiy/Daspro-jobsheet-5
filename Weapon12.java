import java.util.Scanner;

public class Weapon12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.print("Masukkan jarak: ");
        int jarak = input12.nextInt();
        String Hasil;

    Hasil = (jarak <= 5) ? "gunakan melee weapon" : "gunakan range weapon";
    System.out.println("karena jarak pertarungan " + jarak + " meter maka " + Hasil);
    }
    
}
