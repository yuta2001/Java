import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        System.out.println("Hello 2023-7-8");
        Scanner scanner = new Scanner(System.in);
        System.out.println("文字を入力してください!!");
        String input_str = scanner.nextLine();
        System.out.println(input_str + "が入力されました!!");

        scanner.close();
    }
}
