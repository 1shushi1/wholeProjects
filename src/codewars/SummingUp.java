package codewars;

public class SummingUp {
    public static void main(String[] args) {
        int digital = digital_root(16);
        System.out.println(digital);
        String s = "";
        int n = 16;
        s += n;
        System.out.println(s);
    }
    public static int digital_root(int n) {

        String s = "";
        s += n;
        char[] arr = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            return sum += arr[i];
        }
        return 0;
    }
}
