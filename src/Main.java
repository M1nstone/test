//package com.codestates.seb.calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===Java Calculator===");

        Scanner input = new Scanner(System.in);
        /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.
            2. 연산자의 종류는 +, -, *, / 입니다.
            3. 소수점 연산을 수행할 수 있어야 합니다.
            4. 연산 결과를 콘솔에 출력합니다.
        */
        // TODO...
        double result = 0;
        double num1 = input.nextDouble();
        char a = input.next().charAt(0);
        double num2 = input.nextDouble();

        if(a == '+'){
            result = num1 + num2;
        }
        else if(a =='*'){
            result = num1 * num2;
        }
        else if(a == '/'){
            result = num1/ num2;
        }
        else if(a == '-'){
            result = num1-num2;
        }
        System.out.printf("%.2f",result);

    }
}
