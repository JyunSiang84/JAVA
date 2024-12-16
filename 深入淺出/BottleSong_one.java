public class BottleSong {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "bottles";

        while (bottlesNum > 0) {
            // 先處理單複數
            if (bottlesNum == 1) {
                word = "bottle";
            }

            // 印出當前狀態（重複兩次）
            String line = bottlesNum + " green " + word + ", hanging on the wall";
            System.out.println(line);
            System.out.println(line);

            // 印出掉落的情況
            System.out.println("And if one green bottle should accidentally fall,");

            // 更新瓶數
            bottlesNum = bottlesNum - 1;

            // 預告下一個狀態
            if (bottlesNum > 0) {
                word = (bottlesNum == 1) ? "bottle" : "bottles";
                System.out.println("There'll be " + bottlesNum + " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            }
        }
    }
}