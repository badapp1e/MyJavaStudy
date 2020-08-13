import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
章节4：控制执行流程
 */
public class Chapter4Practice {
    /*
    4.3.2实例
     */
    static void printChar() {
        for (char i = 0; i < 128; i++) {
            if (Character.isLowerCase(i)) {
                System.out.println("value " + (int)i + ": " + i);
            }
        }
    }

    /*
    练习4：打印素数
     */
    static void printPrimeNumber() {
        List<Integer> primeNumbers = new ArrayList<Integer>();
        primeNumbers.add(2);
        for (int i = 2; i < 100; i++) {
            for (int j = 0; j < primeNumbers.size(); j++) {
                if (i % primeNumbers.get(j) == 0) break;
                if (Math.pow(primeNumbers.get(j), 2) > i || j == primeNumbers.size() - 1) {
                    primeNumbers.add(i);
                    System.out.println(primeNumbers.get(primeNumbers.size() - 1));
                    break;
                }
            }
        }
    }

    /*
    练习5：循环输出二进制数
     */
    static void bitOperation() {
        int a = 0x55555555;
        for (int i = 31; i >= 0; i--) {
            System.out.print((1 << i & a) != 0 ? "1" : "0");
        }
    }

    /*
    练习:9：斐波那契数列
     */
    static void fibonacci(int len) {
        int[] f = new int[len];
        f[0] = f[1] = 1;
        for (int i = 0; i < len; i++) {
            if (i == 0)
                System.out.print(f[i]);
            else if (i == 1) {
                System.out.print("、" + f[i]);
            }
            else {
                f[i] = f[i - 2] + f[i - 1];
                System.out.print("、" + f[i]);
            }
        }
    }

    /*
    练习10：吸血鬼数字
     */
    static void vampireNum() {
        for (int i = 10; i <= 99; i++) {
            for (int j = i; j >= i && j <= 99; j++) {
                int product = i * j;
                if (product % 100 == 0 || product < 1000) continue;

                int[] t1 = { i % 10, i / 10, j % 10, j / 10 },
                        t2 = { product / 1000, (product / 100) % 10, (product / 10) % 10, product % 10};

                Arrays.sort(t1);
                Arrays.sort(t2);

                int flag = 1;
                for (int k = 0; k < 4; k++) {
                    if (t1[k] != t2[k]) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1) System.out.println(product + " = " + i + " * " + j);
            }
        }
    }

    public static void main(String[] args) {
        vampireNum();
    }
}
