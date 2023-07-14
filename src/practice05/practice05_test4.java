package practice05;

public class practice05_test4 {
    public static void main(String[] args) throws Exception {
        double triangleArea = calcTraiangleArea(10.0, 5.0);
        System.out.println("三角形の面積: " + triangleArea + "平方cm");
        double circleArea = calcCircleArea(10.0);
        System.out.println("円の面積: " + circleArea + "平方cm");
    }

    public static double calcTraiangleArea(double bottom, double height) {
        double area = (bottom * height) / 2;
        return area;
    }

    public static double calcCircleArea(double radius) {
        double area = radius * radius * 3.14;
        return area;
    }
}
