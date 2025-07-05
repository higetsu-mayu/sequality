package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Kadai_1Test {

    private Kadai_1 kadai;

    // @BeforeEach の代わりに @Before を使います
    @Before
    public void setUp() {
        kadai = new Kadai_1();
    }

    @Test
    public void testGetGreeting() {
        // @DisplayNameの代わりに、テストメソッド名で内容を表現します
        assertEquals("Hello World!", kadai.getGreeting());
    }

    @Test
    public void testSumInRange_Normal() {
        // 1から5の合計が15であること
        assertEquals(15, kadai.sumInRange(1, 5));
    }

    @Test
    public void testSumInRange_Single() {
        // 単一数値5の合計が5であること
        assertEquals(5, kadai.sumInRange(5, 5));
    }

    @Test
    public void testSumInRange_InvalidRange() {
        // 開始が終了より大きい場合、合計が0であること
        assertEquals(0, kadai.sumInRange(5, 1));
    }
    
    @Test
    public void testGetAverage_Normal() {
        // 1から5の平均が3.0であること
        // assertEqualsでdouble型を比較する場合、誤差(delta)の指定が必要です
        assertEquals(3.0, kadai.getAverage(1, 5), 0.001);
    }

    @Test
    public void testSumOddInRange_Mixed() {
        // 1から6の奇数の合計が9であること
        assertEquals(9, kadai.sumOddInRange(1, 6));
    }

    @Test
    public void testSumEvenInRange_Mixed() {
        // 1から6の偶数の合計が12であること
        assertEquals(12, kadai.sumEvenInRange(1, 6));
    }

    @Test
    public void testSumOddInRange_InvalidRange() {
        // 開始が終了より大きい場合、合計が0であること
        assertEquals(0, kadai.sumOddInRange(5, 1));
    }

    @Test
    public void testSumEvenInRange_InvalidRange() {
        // 開始が終了より大きい場合、合計が0であること
        assertEquals(0, kadai.sumEvenInRange(5, 1));
    }
}
