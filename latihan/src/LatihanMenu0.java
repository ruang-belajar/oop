/* contoh pembuatan menu tanpa tanpa class */
/* lihat LatihanMenu1.java untuk menu dengan menggunakan class */
import java.util.Scanner;

public class LatihanMenu0 {
    public static void main(String[] args) {
        String command = "";
        Scanner scanner = new Scanner(System.in);

        while(!command.equalsIgnoreCase("Q")) {

            System.out.println();
            System.out.println("MENU");
            System.out.println("=================");
            System.out.println("1. Run");
            System.out.println("2. Stay");
            System.out.println("9. Show");
            System.out.println("Q. QUIT");
            System.out.print("Command:");
            command = scanner.nextLine();

            if(command.equals("1")) {
                // perintah untuk command 1
                System.out.println("DO RUN");
            }
            if(command.equals("2")) {
                // perintah untuk command 2
                System.out.println("DO STAY");
            }
            if(command.equals("9")) {
                // perintah untuk command 9
                System.out.println("SHOW STAT");
            }

        }

        System.out.println("\nEXIT PROGRAM");
    }
}
