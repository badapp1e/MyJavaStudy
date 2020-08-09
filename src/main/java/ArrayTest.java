import java.util.Arrays;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
        // 声明
        double[] myList = {2.2, 1.1, 3.3, 4.4, 5.5};
        System.out.println(Arrays.toString(myList));

        // 数组复制
        double[] copyList = new double[myList.length];
        System.arraycopy(myList, 0, copyList, 0, myList.length);
        System.out.println(Arrays.toString(copyList));

        // 数组比较
        System.out.println(Arrays.equals(myList, copyList));

        // 排序
        Arrays.sort(myList);
        System.out.println(Arrays.toString(myList));

        // 数组元素查找
        System.out.println(Arrays.binarySearch(myList, 3.3));
        System.out.println(Arrays.binarySearch(myList, 0.0));

        // 二维数组
        int[][] twoDimArray = new int[2][3];
        // 赋值
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = i * twoDimArray[i].length + j;
            }
        }

        // 打印数组
        for (int[] i : twoDimArray
             ) {
            System.out.println(Arrays.toString(i));
        }
    }
}
