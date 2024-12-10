package calculator;

/**
 * 簡單的計算機類別，提供基本的算術運算功能
 */
public class Calculator {
    /**
     * 執行加法運算
     * @param a 第一個數
     * @param b 第二個數
     * @return 兩數之和
     */
    public double add(double a, double b) {
        return a + b;
    }
    
    /**
     * 執行減法運算
     * @param a 第一個數
     * @param b 第二個數
     * @return 兩數之差
     */
    public double subtract(double a, double b) {
        return a - b;
    }
    
    /**
     * 執行乘法運算
     * @param a 第一個數
     * @param b 第二個數
     * @return 兩數之積
     */
    public double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * 執行除法運算
     * @param a 第一個數
     * @param b 第二個數
     * @return 兩數之商
     * @throws IllegalArgumentException 當除數為零時拋出
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("除數不能為零");
        }
        return a / b;
    }
}
