package cs;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String hex_num = in.nextLine();
        String result= getResult(hex_num,16,10);
        System.out.println(result);
    }
    private static String getResult(String expression, int jz1, int jz2){
        int M;
        String Result="";
        M=Integer.valueOf(expression,(int) jz1);
        switch ((int)jz2){
            case 2:Result= Integer.toBinaryString(M);break;
            case 8:Result=Integer.toOctalString(M);break;
            case 10:Result=String.valueOf(M);break;
            case 16:Result=Integer.toHexString(M);break;
        }
        return Result;
    }
}
