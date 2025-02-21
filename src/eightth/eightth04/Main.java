package eightth.eightth04;

import java.util.Scanner;

public class Main {
    static int[] pm;
    static int n, m;
    public void DFS (int L) {
        if (L == m) {
            for (int x : pm) System.out.println(x + " ");
            System.out.println();
        } else {
            for (int i = 1; i<= n; i++) {
                pm[L] = i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Main T  = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[n];
        T.DFS(0);
    }
}
