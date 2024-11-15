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

    AUFGABE 3
    man fügt eine Stelle zum code hinzu, die positiv von negativ unterscheidet (am Ende des arrays)
    */
    public static char[] convertToBinary(short in) {
        //System.out.println("converting");
        int x=in;
        //adding negative numbers as an option
        boolean neg = false;
        if(x<0){
            x= (-x);
            neg=true;
            //System.out.println(x);
        }
        //first we define the length of the binary code
        int len=log2(x);
        //System.out.println(len);
        char[] result=new char[len+2];
        Arrays.fill(result,'0');
        if(neg){
            result[len+1]='-';
        }else{
            result[len+1]=' ';
        }

        //then we fill it
        while(x>0){
            int a=log2(x);
            result[a]='1';
            int b=(int)Math.pow(2,a);
            //int next=x-b;System.out.println("x:"+x+" a:"+a+" b:"+b+" next:"+next);
            x=x-b;
            //System.out.println(x);
        }
        //result string is backwards
        return result;
    }
    // code for log2 in java: https://www.geeksforgeeks.org/how-to-calculate-log-base-2-of-an-integer-in-java/
    public static int log2(int N){
        // calculate log2 N indirectly
        // using log() method
        return (int)(Math.log(N) / Math.log(2));
    }

    /*
    AUFGABE 2 Beschreibung:
    1) Zahl/16, rest ist die nächste stelle des hex codes (wenn <=10; 10=A, 11=B, 12=C, 13=D, 14=E, 14=D)
    2)wiederhol bis zahl/16==0

    //reference: https://madformath.com/calculators/basic-math/base-converters/decimal-to-hexadecimal-converter-with-steps/decimal-to-hexadecimal-converter-with-steps
    */
    public static char[] convertToHexadezimal(int in) {
        char[] code=new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','D'};
        int x=in;
        int i=0;
        while(x>0){
            x=x/16;
            i++;
        }

        char[] result=new char[i];
        //System.out.println(i);
        i=0;
        x=in;
        while(x>0){
            int r=x%16;
            //System.out.print(x+"|"+r);
            result[i]=code[r];
            //System.out.print("-"+ code[r]+"\n");
            x=x/16;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        //Aufgabe 1
        short in= -5;//number to convert
        char[] result=convertToBinary(in);
        System.out.print(in+" = ");

        //printing reverse for easy reading
        for (int i = result.length -1; i >= 0; i--) {
            System.out.print(result[i]);
        }
/*
        //Aufgabe 2
        int dez=97;
        char[] hex=convertToHexadezimal(dez);

        //System.out.print(hex);
        //printing reverse for easy reading
        for (int i = hex.length -1; i >= 0; i--) {
            System.out.print(hex[i]);
        }
*/

        //Aufgabe 3


    }
}