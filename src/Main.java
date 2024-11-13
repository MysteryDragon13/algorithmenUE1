import java.util.Arrays;

public class Main {
    /*
    AUFGABE 1
    Lösungsidee Prosa:
    Um eine Zahl (x) vom Zehner System ins 2er System (binary) umzuwandeln brauchen wir die größte Zahl die nicht größer als
    unsere input Zahl, und in der 1-2-4-8-16...etc Reihe ist.
    Die findet man mit dem Logarythmus (log base2) der input Zahl (a). Man rundet diese und rechnet sie wieder 2^a auf.
    Dann findet man den Rest mit der Differenz von dem Ergebnis und der input Zahl,
    dann wiederholt man das mit der Differenz bis diese <1 ist.
    jeder Wert für a markiert dabei die positionen für 1er im binary string.

    Lösungsidee Stilisiert:
    1) log2 der input Zahl wird gerundet und gespeichert
    2) diese Zahl gibt die Länge des result strings an. Fülle den array mit '0'
    3) 2 hoch diese Zahl gibt die Position der '1' im string an
    4) die input Zahl minus die letzte Zahl ist die nächste Zahl
    5) wiederhohle 1)3) und 4) solange die nächste Zahl größer als 0 wäre
    */
    public static char[] convertToBinary(short in) {
        //System.out.println("converting");

        //first we define the length of the binary code
        int len=log2(in);
        System.out.println(len);
        char[] result=new char[len+1];
        Arrays.fill(result,'0');

        //then we fill it
        int x=in;
        while(x>0){
            int a=log2(x);
            result[a]='1';
            int b=(int)Math.pow(2,a);
            int next=x-b;System.out.println("x:"+x+" a:"+a+" b:"+b+" next:"+next);
            x=x-b;

        }
        //System.out.println(x);

        return result;
    }
    // code for log2 in java: https://www.geeksforgeeks.org/how-to-calculate-log-base-2-of-an-integer-in-java/
    public static int log2(int N){
        // calculate log2 N indirectly
        // using log() method
        return (int)(Math.log(N) / Math.log(2));
    }

    public static void main(String[] args) {
        short in=36;//number to convert
        char[] result=convertToBinary(in);
        System.out.print(in+" = ");
        //printing reverse for easy reading
        //System.out.print(result);
        for (int i = result.length -1; i >= 0; i--) {
            System.out.print(result[i]);
        }
    }
}