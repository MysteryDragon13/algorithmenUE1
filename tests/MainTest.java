import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void convertToBinary() {
        System.out.println("testing");
        short num=11;
        char[] expected={'1','1','0','1'};
        char[] returned=Main.convertToBinary(num);
        assertArrayEquals(expected,returned);
    }

    @Test
    void main() {
    }
}