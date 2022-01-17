import java.util.Scanner;

public class MonthSchedule {
    Scanner scanner = new Scanner(System.in);
    Day[] day;

    public MonthSchedule(int num) {
        day = new Day[num];
        for (int i = 0; i < num; i++) {
            day[i] = new Day();
        }
    }

    public void input() {
        int n;
        String todo;
        System.out.println("날짜(1~30)?");
        n=scanner.nextInt();
        System.out.println("할일(빈칸없이입력)?");
        todo = scanner.next();
        day[n].setWork(todo);
    }

    public void view() {
        int n;
        System.out.println("날짜(1~30)?");
        n=scanner.nextInt();
        System.out.print(n+"일의 할 일은");
        day[n].show();
    }

    public void finish() {
        System.out.println("프로그램을 종료합니다.");
    }

    public void run() {
        int input=0;

        while(input!=3) {
            System.out.println("이번달 스케쥴 관리 프로그램");
            System.out.println("할일(입력:1, 보기:2, 끝내기:3) >>");
            input = scanner.nextInt();
            if (input == 1)
                input();
            else if (input == 2)
                view();
            else if (input == 3)
                finish();
        }
    }
}
