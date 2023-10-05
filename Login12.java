import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login12 {
    private static Map<String, String> userDatabase = new HashMap<>();

    public static void main(String[] args) {
      
        userDatabase.put("pengguna1", "password1");
        userDatabase.put("pengguna2", "password2");

   
        Scanner scanner = new Scanner(System.in);


        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

    
        if (isValidLogin(username, password)) {
            System.out.println("Login berhasil, Selamat Datang di Beranda " + username + "!");
        } else {
            System.out.println("Login gagal. Username dan password salah.");
        }

    
        scanner.close();
    }


    private static boolean isValidLogin(String username, String password) {
      
        if (userDatabase.containsKey(username)) {
           
            String storedPassword = userDatabase.get(username);
            return storedPassword.equals(password);
        }
        return false; 
    }
}

