import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void T11() {
        //System.out.println("testing");
        short num=11;
        char[] expected={'1','1','0','1'};//read from right to left
        char[] returned=Main.convertToBinary(num);
        assertArrayEquals(expected,returned);
    }
    @Test
    void T1() {
        short num=1;
        char[] expected={'1'};//read from right to left
        char[] returned=Main.convertToBinary(num);
        assertArrayEquals(expected,returned);
    }
    @Test
    void T4() {
        short num=4;
        char[] expected={'0','0','1'};//read from right to left
        char[] returned=Main.convertToBinary(num);
        assertArrayEquals(expected,returned);
    }
    @Test
    void T36() {
        short num=36;
        char[] expected={'0','0','1','0','0','1'};//read from right to left
        char[] returned=Main.convertToBinary(num);
        assertArrayEquals(expected,returned);
    }
    @Test
    void T15() {
        short num=15;
        char[] expected={'1','1','1','1'};//read from right to left
        char[] returned=Main.convertToBinary(num);
        assertArrayEquals(expected,returned);
    }
    @Test
    void T5() {
        //System.out.println("testing");
        short num=5;
        char[] expected={'1','0','1'};//read from right to left
        char[] returned=Main.convertToBinary(num);
        assertArrayEquals(expected,returned);
    }
    @Test
    void T40() {
        short num=40;
        char[] expected={'0','0','0','1','0','1'};//read from right to left
        char[] returned=Main.convertToBinary(num);
        assertArrayEquals(expected,returned);
    }
    @Test
    void T420() {
        short num=420;
        char[] expected={'0','0','1','0','0','1','0','1','1'};//read from right to left
        char[] returned=Main.convertToBinary(num);
        assertArrayEquals(expected,returned);
    }
    @Test
    void T21() {
        short num=21;
        char[] expected={'1','0','1','0','1'};//read from right to left
        char[] returned=Main.convertToBinary(num);
        assertArrayEquals(expected,returned);
    }
    @Test
    void T2() {
        short num=2;
        char[] expected={'0','1'};//read from right to left
        char[] returned=Main.convertToBinary(num);
        assertArrayEquals(expected,returned);
    }
}