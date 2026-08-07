
import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public PerformOperation isOdd() {
        return a -> a % 2 != 0;
    }

    public PerformOperation isPrime() {
        return a -> {
            if (a < 2) return false;
            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return a -> {
            int original = a;
            int reverse = 0;

            while (a > 0) {
                reverse = reverse * 10 + a % 10;
                a /= 10;
            }

            return original == reverse;
        };
    }

    public boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
}

public class Solution {

    public static void main(String[] args) throws Exception {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int ch = Integer.parseInt(s[0]);
            int num = Integer.parseInt(s[1]);

            PerformOperation op;
            boolean ret = false;

            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                System.out.println(ret ? "ODD" : "EVEN");
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                System.out.println(ret ? "PRIME" : "COMPOSITE");
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                System.out.println(ret ? "PALINDROME" : "NOT PALINDROME");
            }
        }
    }
}
