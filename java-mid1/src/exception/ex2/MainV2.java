package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
        NetworkServiceV2_1 networkServiceV21 = new NetworkServiceV2_1();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if(input.equals("exit"))
                break;
            networkServiceV21.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램 정상 종료");
    }
}
