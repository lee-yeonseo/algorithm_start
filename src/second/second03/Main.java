package second.second03;

import java.util.*;
public class Main {
    public String solution(int n, int[] a, int[] b) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                answer += "D";
            } else if (a[i] == 1 && b[i] == 3) {
                answer += "A";
            } else if (a[i] == 2 && b[i] == 1) {
                answer += "A";
            } else if (a[i] == 3 && b[i] == 2) {
                answer += "A";
            } else {
                answer += "B";
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        kb.nextLine();


        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = kb.nextInt();
        }
        kb.nextLine();

        int[] arrB = new int[n];
        for (int i = 0; i < n; i++) {
            arrB[i] = kb.nextInt();
        }

        for (char x : T.solution(n, arrA, arrB).toCharArray()){
            System.out.println(x);
        }
    }
}
