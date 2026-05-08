import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    private String title;
    private Map<String, String> items;
    private Scanner scanner = new Scanner(System.in);

    public Menu(String title) {
        this.items = new HashMap<>();
        this.title = title;
    }
    
    public void set(String index, String caption) {
        this.items.put(index, caption);
    }

    public void show() {
        System.out.println();
        System.out.println(this.title);
        System.out.println("=================");
        this.items.forEach((key,caption) -> {
            System.out.println(key+". "+caption);
        });
    }

    public String prompt() {
        try {
            System.out.print("Command:");
            return scanner.nextLine();
        } catch (Exception e) {
            // TODO: handle exception
            return "";
        } 
    }
}
