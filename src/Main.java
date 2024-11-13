import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("testing");

        short in=11;//number to convert
        System.out.print(in+" = ");

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

        //printing reverse for easy reading
        for (int i = result.length -1; i >= 0; i--) {
            System.out.print(result[i]);
        }

    }
}