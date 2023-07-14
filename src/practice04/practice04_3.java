package practice04;

public class practice04_3 {
    public static void main(String[] args) {
        int[] ary = { 1, 2, 3, 4, 5 };

        int count = 0;

        for (int i = 0; i < ary.length; i++) {
            // 要素の中から該当するもの
            if (ary[i] >= 3) {
                count++;
            }
        }

        System.out.println("3以上の数字は" + count + "つあります");
    }
}
