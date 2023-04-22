

public class Exercise525 {
    public static void main(String[] args) {
        String apple = new String("A");
        String smallApple = new String("a");

        System.out.println(apple.equals(smallApple));
        System.out.println(apple.equals(apple));
        System.out.println(apple == apple);
        System.out.println(apple == smallApple);
        System.out.println(apple.compareTo(apple));
        System.out.println(apple.compareTo(smallApple));
    }
}
