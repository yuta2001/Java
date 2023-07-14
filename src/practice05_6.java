public class practice05_6 {
    public static void printArray(int[] array) {
        for (int elemnt : array) {
            System.out.print(elemnt);
        }
    }

    public static void mian(String[] args) throws Exception {
        int[] array = { 1, 2, 3, 4, 5 };
        printArray(array);
    }
}
