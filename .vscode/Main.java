import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            Long[] a = new Long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a, Collections.reverseOrder());

            boolean ok = true;

            for (int i = 0; i <= n - 3; i++) {
                if (a[i] % a[i + 1] != a[i + 2]) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                System.out.println(a[0] + " " + a[1]);
            } else {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}