

public class Exercise527 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "";

        // Using the isEmpty() method
        boolean empty1 = str1.isEmpty(); // Assigns false to empty1
        System.out.println(empty1);
        boolean empty2 = str2.isEmpty(); // Assigns true to empty1
        System.out.println(empty2);

        // Using the equals() method
        boolean empty3 = "".equals(str1); // Assigns false to empty3
        System.out.println(empty3);
        boolean empty4 = "".equals(str2); // Assigns true to empty4
        System.out.println(empty4);

        // Comparing length of the string with 0
        boolean empty5 = str1.length() == 0; // Assigns false to empty5
        System.out.println(empty5);
        boolean empty6 = str2.length() == 0; // Assigns true to empty6
        System.out.println(empty6);
    }
}
