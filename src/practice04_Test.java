import java.util.Scanner;

public class practice04_Test {
    public static void main(String[] args) {

        // 練習4-1
        // int[] points = new int[4];
        // double[] weights = new double[5];
        // boolean[] answers = new boolean[3];
        // String[] names = new String[3];

        int[] moneyList = { 121902, 8302, 55100 };
        int[] moneyList_2 = { 121902, 8302, 55100 };

        // 練習4-2
        for (int i = 0; i < moneyList.length; i++) {
            System.out.println(moneyList[i]);
        }

        // 練習4-3
        for (int val : moneyList_2) {
            System.out.println(val);
        }

        // 練習4-5
        int[] numbers = { 3, 4, 9 };
        System.out.println("1桁の数字を入力してください!!");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int result : numbers) {
            if (result == input) {
                System.out.println("当たり!!");
            }
        }
        scanner.close();
    }
}
