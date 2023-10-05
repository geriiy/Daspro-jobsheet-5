import java.util.Scanner;

public class PemilihanPercobaan212 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float uas = input12.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input12.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input12.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input12.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);


        if (total<=39) {
            System.out.println("Nilai Anda adalah E");
        } 
        else if (total<=50) {
            System.out.println("Nilai Anda adalah D");
        } 
        else if (total<=60) {
            System.out.println("Nilai Anda adalah C");
        } 
        else if (total<=65) {
            System.out.println("Nilai Anda adalah C+");
        }
        else if (total<=73) {
            System.out.println("Nilai Anda adalah B");
        }
        else if (total<=80) {
            System.out.println("Nilai Anda adalah B+");
        }
        else {
            System.out.println("Nilai Anda adalah A");
            
        }

    }
    
}
