import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class hexTest {

    @Test
    void T97() {
        //System.out.println("testing");
        int num=97;
        char[] expected={'1','6'};//read from right to left
        char[] returned=Main.convertToHexadezimal(num);
        assertArrayEquals(expected,returned);
    }
    @Test
    void T420() {
        //System.out.println("testing");
        int num=420;
        char[] expected={'4','A','1'};//read from right to left
        char[] returned=Main.convertToHexadezimal(num);
        assertArrayEquals(expected,returned);
    }
    @Test
    void T3() {
        //System.out.println("testing");
        int num=3;
        char[] expected={'3'};//read from right to left
        char[] returned=Main.convertToHexadezimal(num);
        assertArrayEquals(expected,returned);
    }
    @Test
    void T50() {
        //System.out.println("testing");
        int num=50;
        char[] expected={'2','3'};//read from right to left
        char[] returned=Main.convertToHexadezimal(num);
        assertArrayEquals(expected,returned);
    }
    @Test
    void T10() {
        //System.out.println("testing");
        int num=10;
        char[] expected={'A'};//read from right to left
        char[] returned=Main.convertToHexadezimal(num);
        assertArrayEquals(expected,returned);
    }
    @Test
    void T555() {
        //System.out.println("testing");
        int num=555;
        char[] expected={'B','2','2'};//read from right to left
        char[] returned=Main.convertToHexadezimal(num);
        assertArrayEquals(expected,returned);
    }
    @Test
    void T200() {
        //System.out.println("testing");
        int num=200;
        char[] expected={'8','C'};//read from right to left
        char[] returned=Main.convertToHexadezimal(num);
        assertArrayEquals(expected,returned);
    }
    @Test
    void T172() {
        //System.out.println("testing");
        int num=172;
        char[] expected={'C','A'};//read from right to left
        char[] returned=Main.convertToHexadezimal(num);
        assertArrayEquals(expected,returned);
    }
    @Test
    void T90() {
        //System.out.println("testing");
        int num=90;
        char[] expected={'A','5'};//read from right to left
        char[] returned=Main.convertToHexadezimal(num);
        assertArrayEquals(expected,returned);
    }
    @Test
    void T101() {
        //System.out.println("testing");
        int num=101;
        char[] expected={'5','6'};//read from right to left
        char[] returned=Main.convertToHexadezimal(num);
        assertArrayEquals(expected,returned);
    }

}