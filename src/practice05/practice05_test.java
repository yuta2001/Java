package practice05;

public class practice05_test {
    public static void main(String[] args) throws Exception {
        introduceOneself();

    }

    // 練習5-1
    public static void introduceOneself() throws Exception {
        String name = "yuta";
        int num = 22;
        double height = 163;
        char eto = '牛';

        System.out.println("あなたの名前は" + name);
        System.out.println("あなたの年齢は" + num);
        System.out.println("あなたの身長は" + height);
        System.out.println("あなたの干支は" + eto);
    }
}
