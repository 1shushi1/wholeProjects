package GUI;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Concat {
    private String s1;
    private String s2;

    public Concat(String s1, String s2){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a name for the first character and after this for the second character");
        this.s1 = s1;
        this.s2 = s2;
    }

    public void namesConcat() {
        String res = s1 + s2;
        System.out.println(res);
    }

    public void namesRev() {
        String rev = s2 + s1;
        System.out.println(rev);
    }
    public void initials(){
        char ini1 = s1.charAt(0);
        char ini2 = s2.charAt(0);
        String ini = Character.toString(ini1) + Character.toString(ini2);
        System.out.print(ini);
    }
}
