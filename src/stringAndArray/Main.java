package stringAndArray;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {



    private void exp1(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string for test !");
        String str = scanner.nextLine();

        int[] index = new int[128];

        for(int i = 0 ; i < str.length() ; i++){
            index[(int) str.charAt(i)] =index[(int) str.charAt(i)]+1;
        }
        for (int i =0 ;i <index.length; i++){
            if(index[i] >=2){
                System.out.println("your string is not unique character");
             return;
            }
        }
        System.out.println("Your string is unique character");
    }

    private void exp2(){


        String var1 = "dd";
        String var2 = "ddd";

        int length1 = var1.length();
        int length2 = var2.length();

        if(length1 != length2){
            System.out.println("Opps!");
            return;
        }

        char var11[] = var1.toCharArray();
        char var22[] = var2.toCharArray();

        Arrays.sort(var11);
        Arrays.sort(var22);


    }



    public Main(){ exp1();}


    public static void main(String[] args) {
         new Main();
    }
}
