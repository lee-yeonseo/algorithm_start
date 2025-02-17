package second.second02;

import java.util.*;
public class Main {
    public int solution(int n, int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int max = arr[0];
        arrayList.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                arrayList.add(arr[i]);
                max = arr[i];
            }
        }
        return arrayList.size();
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
