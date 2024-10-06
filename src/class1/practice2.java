package class1;

public class practice2 {
    public static void main(String[] args) {
        float[] array1 = {1.1f, 2.3f, 4.7f, 7.5f};
        double[] array2 = new double[4];

        System.out.println("배열 크기 : " + array1.length);

        for (int i = 0; i < array1.length; i++) {
            System.out.println(i +"배열 요소 : " + array1[i]);
            array2[i] = array1[i];
            System.out.printf(i + "배열2 요소 : " + array2[i]);
            System.out.println();
        }
    }
}
