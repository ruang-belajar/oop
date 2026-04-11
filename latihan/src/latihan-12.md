
Buat file **GameTebakAngka.java**.
```java
import java.util.Random;
import java.util.Scanner;

public class GameTebakAngka {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean sudahTerjawab = false;
        Integer tryCount = 0;

        Random random = new Random();
        int jawaban = random.nextInt(1,100);

        while(!sudahTerjawab) {

            System.out.print("Masukkan tebakan Anda: ");
            int tebakanUser = scanner.nextInt();

            if(jawaban>tebakanUser) {
                System.out.println("terlalu kecil");
            }
            if(jawaban<tebakanUser) {
                System.out.println("terlalu besar");
            }

            if(jawaban==tebakanUser) {
                System.out.println("TEBAKAN ANDA BENAR");
                sudahTerjawab = true;
            }

            System.out.println();
        }
        System.out.println("Anda berhasil menjawab: ");
        System.out.println(tryCount.toString()+"x tebakan");

        scanner.close();
    }
}

```