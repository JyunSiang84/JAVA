package calculator;

import java.util.Scanner;

/**
 * 計算機應用程式的主類別
 */
public class CalculatorApp {
    private static final Calculator calculator = new Calculator();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = getUserChoice();
            
            if (choice == 5) {
                System.out.println("感謝使用，再見！");
                break;
            }
            
            double num1 = getNumber("請輸入第一個數字：");
            double num2 = getNumber("請輸入第二個數字：");
            
            try {
                double result = performOperation(choice, num1, num2);
                System.out.println("結果：" + result);
            } catch (IllegalArgumentException e) {
                System.out.println("錯誤：" + e.getMessage());
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n簡單計算機");
        System.out.println("1. 加法");
        System.out.println("2. 減法");
        System.out.println("3. 乘法");
        System.out.println("4. 除法");
        System.out.println("5. 退出");
    }

    private static int getUserChoice() {
        while (true) {
            System.out.print("請選擇操作 (1-5)：");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 5) {
                    return choice;
                }
                System.out.println("請輸入有效的選項 (1-5)");
            } catch (NumberFormatException e) {
                System.out.println("請輸入有效的數字");
            }
        }
    }

    private static double getNumber(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("請輸入有效的數字");
            }
        }
    }

    private static double performOperation(int choice, double num1, double num2) {
        switch (choice) {
            case 1: return calculator.add(num1, num2);
            case 2: return calculator.subtract(num1, num2);
            case 3: return calculator.multiply(num1, num2);
            case 4: return calculator.divide(num1, num2);
            default: throw new IllegalArgumentException("無效的操作選擇");
        }
    }
}
