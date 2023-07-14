package practice05;

public class practice05_6 {
    // 配列のメソッドを呼び出す
    // 引数に配列型を指定::printArray(int[] array)

    // public static void printArray(int[] array) {
    // for (int elemnt : array) {
    // System.out.print(elemnt);
    // }
    // }

    // public static void main(String[] args) throws Exception {
    // int[] array = { 1, 2, 3, 4, 5 };
    // printArray(array);配列を渡す
    // }

    public static int[] makeArray(int size) throws Exception {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray;// 配列を戻す
    }

    public static void main(String[] args) throws Exception {
        int[] array = makeArray(3);
        // arrayの全要素を出力
        for (int i : array) {
            System.out.print(i);
        }
    }
}
