package poly.ex.pay0;

import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("결제 수단을 입력하세요:");
            String payOption1 = sc.nextLine();
            if(payOption1.equals("exit"))
            {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.print("결제 금액을 입력하세요:");
            int amount1 = sc.nextInt();
            payService.processPay(payOption1, amount1);
            sc.nextLine();
        }
    }
}