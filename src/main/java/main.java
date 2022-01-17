
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class main {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("이름을 입력하세요>>");
            String s = scanner.next();
            a.add(s);
        }

        for (String s : a) {
            System.out.print(s);
        }

    }



}


