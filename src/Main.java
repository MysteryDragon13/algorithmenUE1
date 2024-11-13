import java.util.Arrays;

public class Main {
    /*
    AUFGABE 1
    Lösungsidee Prosa:
    Um eine Zahl (x) vom Zehner System ins 2er System (binary) umzuwandeln brauchen wir die größte Zahl die nicht größer als
    unsere input Zahl, und in der 1-2-4-8-16...etc Reihe ist.
    Die findet man mit der Wurzel der input Zahl (a). Man rundet diese und rechnet sie wieder 2^a auf.
    Dann findet man den Rest mit der Differenz von dem Ergebnis und der input Zahl,
    dann wiederhohlt man das mit der Differenz bis diese <1 ist.
    jeder Wert für a markiert dabei die positionen für 1er im binary string.

    Lösungsidee Stilisiert:
    1) Wurzel der input Zahl wird gerundet und gespeichert
    2) diese Zahl gibt die Länge des result strings an. Fülle den array mit '0'
    3) 2 hoch diese Zahl gibt die Position der '1' im string an
    4) die input Zahl minus die letzte Zahl ist die nächste Zahl
    5) wiederhohle 1)3) und 4) solange die nächste Zahl größer als 0 wäre
    */
    public static char[] convertToBinary(short in) {
        System.out.println("converting");

        //first we define the length of the binary code
        int len=(int)Math.sqrt(in);
        char[] result=new char[len+1];
        Arrays.fill(result,'0');

        //then we fill it
        int x=in;
        while(x>1){
            int a=(int)Math.sqrt(x);
            result[a]='1';
            int b=(int)Math.pow(2,a);
            x=x-b;
            //int next=x-b;System.out.println("x:"+x+" a:"+a+" b:"+b+" next:"+next);
        }
        //System.out.println(x);

        //and add the final 1 if needed(the same loop doesn't work for that)
        if(x==1){
            result[0]='1';
        }
        return result;

    }
    public static void main(String[] args) {
        short in=11;//number to convert
        char[] result=convertToBinary(in);
        System.out.print(in+" = ");
        //printing reverse for easy reading
        for (int i = result.length -1; i >= 0; i--) {
            System.out.print(result[i]);
        }
    }
}