
import java.util.*;
class StackI {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = 0;
            Stack<Integer> al = new Stack<Integer>();
            for (int i = 0; i < n; i++) {
                int k = sc.nextInt();
                if (al.size() == 0) {
                    al.push(k);
                    continue;
                }
                if (k == 0) {
                    if (al.peek() == 1) {
                        a++;
                        al.pop();
                    } else
                        al.push(k);
                } else {
                    if (al.peek() == 0) {
                        a++;
                        al.pop();
                    } else
                        al.push(k);
                }
            }
            int pp = al.size();
            if (pp != 0 && al.peek() == 1) {
                a += pp / 3;
            }
            System.out.println(a);
        }
        sc.close();
    }
}
