package es.ieslavereda;

import java.util.Scanner;

public class Exercise03 {


    public static void main(String[] args) {
        char c = getChar("Give me a char between 'a' and 'z':");
        showSequence(c);
    }

    public static void showSequence(char character){
        for(int c=character;c<='z';c++){
            System.out.print((char)(c + ('A'-'a')*(c%2))+" ");
        }
        System.out.println();
    }

    public static char getChar(String text){

        String aux = getText(text);

        if(aux.length()!=1) {
            System.out.println("Only 1 character! Try again.");
            return getChar(text);
        }

        if(aux.charAt(0)<'a' || aux.charAt(0)>'z'){
            System.out.println("Only the characters between 'a' and 'z' are allowed. Try again.");
            return getChar(text);
        }

        return aux.charAt(0);

    }

    private static String getText(String txt){
        Scanner sc=new Scanner(System.in);
        System.out.println(txt);
        return sc.nextLine();
    }
}
