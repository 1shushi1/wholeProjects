package oop.simpleObjects.safebox;

public class Main {
    public static void main(String[] args) {
        Safebox one = new Safebox();
        one.close(new char []{'y','3','h','T','1','9','I','8'});
        one.open(new char[]{'e', '1', 'L', '8'});
        one.close(new char[]{'y','3','h','T'});
        one.open(new char[]{'e', '1', 'L'});
        one.open(new char[]{'e', '1', 'L'});
        one.open(new char[]{'e', '1', 'L'});
        one.open(new char[]{'e', '1', 'L', '7'});
        one.open(new char[]{'e', '1', 'L', '3'});
    }
}
