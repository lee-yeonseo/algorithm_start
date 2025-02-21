package first02;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";
        for (char x : str.toCharArray()) {
            if ( x >= 97 && x <= 122) answer += (char) (x - 32);
            else answer += (char) (x + 32);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}