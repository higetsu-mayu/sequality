package org.example;

public class Kadai_1 {

    public static void main(String[] args) {
        // このクラス自身のインスタンスを作成します
        Kadai_1 kadai_1 = new Kadai_1();

        // 画面に "Hello World!" を出力します
        System.out.println(kadai_1.getGreeting());

        // --- 1つ目の計算と出力 ---
        int num1 = 2;
        int num2 = 3;
        int sum1 = kadai_1.sumInRange(num1, num2);
        double average1 = kadai_1.getAverage(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum1 + ". Average is " + average1 + ".");

        // --- 2つ目以降の計算と出力 ---
        int start = 1;
        int end = 10;
        int sum2 = kadai_1.sumInRange(start, end);
        double average2 = kadai_1.getAverage(start, end);
        int oddSum = kadai_1.sumOddInRange(start, end);
        int evenSum = kadai_1.sumEvenInRange(start, end);

        System.out.println("Sum of " + start + " to " + end + " is " + sum2 + ". Average is " + average2 + ".");
        System.out.println("Sum of odd of " + start + " to " + end + " is " + oddSum + ".");
        System.out.println("Sum of even of " + start + " to " + end + " is " + evenSum + ".");
    }



    public String getGreeting() {
        return "Hello World!";
    }

    // --- 計算用メソッド ---

    /**
     * 2つの数とその間の数の合計を求めます。
     */
    public int sumInRange(int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            total += i;
        }
        return total;
    }

    /**
     * 指定された範囲の数値の平均値を計算します。
     */
    public double getAverage(int start, int end) {
        int sum = this.sumInRange(start, end);
        double count = end - start + 1;
        return sum / count;
    }

    /**
     * 指定された範囲内の奇数の合計を求めます。
     */
    public int sumOddInRange(int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) { // 数が奇数かどうかをチェック
                total += i;
            }
        }
        return total;
    }

    /**
     * 指定された範囲内の偶数の合計を求めます。
     */
    public int sumEvenInRange(int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) { // 数が偶数かどうかをチェック
                total += i;
            }
        }
        return total;
    }
}