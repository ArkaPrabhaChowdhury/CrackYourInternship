import java.util.*;

class duplicateNum {
    public static void main(String[] args) {
        int a[] = { 3, 1, 3, 4, 2 };
        Arrays.sort(a);

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] == a[i + 1]) {
                System.out.println(a[i + 1]);
            }

        }
    }
}