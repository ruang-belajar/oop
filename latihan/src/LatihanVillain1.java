import java.util.Scanner;

public class LatihanVillain1 {
    public static void main(String[] args) {
        String command = "";
        Scanner scanner = new Scanner(System.in);

        SuperHero player = null;
        String namaDepan;
        String namaBelakang;
        String alias;

        while(!command.equalsIgnoreCase("Q")) {

            System.out.println();
            System.out.println("MENU");
            System.out.println("=================");
            System.out.println("1. Set SuperHero");
            System.out.println("2. Set Villain");
            System.out.println("9. Nama Panggilan");
            System.out.println("Q. QUIT");
            System.out.print("Command:");
            command = scanner.nextLine();

            if(command.equals("1")) {
                namaDepan = scanner.nextLine();
                namaBelakang = scanner.nextLine();
                alias = scanner.nextLine();
                player = new SuperHero(namaDepan, namaBelakang, alias);
            }
            if(command.equals("2")) {
                namaDepan = scanner.nextLine();
                namaBelakang = scanner.nextLine();
                alias = scanner.nextLine();
                player = new Villain(namaDepan, namaBelakang, alias);
            }
            if(command.equals("9")) {
                System.out.println(player.namaPanggilan());
            }

        }

        System.out.println("\nEXIT PROGRAM");
    }
}