package forEach;

public class ForEach {
    public static void main(String[] args) {
        String [] fruits = {"orange", "apple","banana"};
        for (String fruit : fruits){
            System.out.println(fruit);
        }
        String txt = "Hello";
        System.out.println(txt.length()); //shows the length of a text (including all spaces and symbols;
        String greatings = "Hello";
        String name = "Alex";
        System.out.println(greatings + " " + name.toUpperCase()); //variable name.toUpperCase() or .toLowerCase
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName)); // concatenate two strings
        String text = "I bought a bike a week ago";
        System.out.println(text.indexOf("week")); // show an index of the symbol
    }
}
