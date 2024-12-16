public class BottleSong99 {
    // 將固定的字串定義為常數
    private static final String HANGING = "hanging on the wall";
    private static final String GREEN = "green";
    private static final String FALL = "And if one green bottle should accidentally fall,";

    public static void main(String[] args) {
        // 可以從命令列參數讀取瓶子數量，預設為 99
        int startingBottles = args.length > 0 ? Integer.parseInt(args[0]) : 99;
        singBottleSong(startingBottles);
    }

    private static void singBottleSong(int startingBottles) { //主要的歌曲邏輯
        // 參數驗證
        if (startingBottles <= 0) {
            System.out.println("Please provide a positive number of bottles!");
            return;
        }

        int bottlesNum = startingBottles;

        while (bottlesNum > 0) {
            // 取得當前的瓶子描述
            String currentVerse = generateVerse(bottlesNum);

            // 印出當前狀態
            System.out.println(currentVerse);
            System.out.println(currentVerse);
            System.out.println(FALL);

            // 更新瓶數
            bottlesNum--;

            // 印出下一個狀態
            System.out.println(generateNextState(bottlesNum));
            System.out.println(); // 增加空行提高可讀性
        }
    }

    private static String generateVerse(int number) {
        String word = (number == 1) ? "bottle" : "bottles";
        return String.format("%d %s %s, %s", number, GREEN, word, HANGING);
    }

    private static String generateNextState(int number) {
        if (number > 0) {
            String word = (number == 1) ? "bottle" : "bottles";
            return String.format("There'll be %d %s %s, %s", number, GREEN, word, HANGING);
        } else {
            return "There'll be no green bottles, " + HANGING;
        }
    }
}