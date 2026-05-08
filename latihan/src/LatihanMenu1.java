import java.util.Scanner;

public class LatihanMenu1 {
    public static void main(String[] args) {
        String command = "";

        // prep menu
        Menu menu = new Menu("MENU");

        // setup menu
        menu.set("1","Run");
        menu.set("2","Stay");
        menu.set("8","Show");
        menu.set("Q","QUIT");

        while(!command.equalsIgnoreCase("Q")) {
            menu.show();
            command = menu.prompt();

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
