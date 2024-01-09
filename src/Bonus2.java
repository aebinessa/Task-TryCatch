import java.util.Scanner;

public class Bonus2 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String validUsername = "Coded";
        String validPassword = "Coded_admin";

        for (int attempt = 0; attempt <= 5; attempt++) {
            try {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();

                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                if (!username.equals(validUsername) || !password.equals(validPassword)) {
                    throw new Exception("Invalid credentials");

                }
                System.out.println("Login successful!");

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}