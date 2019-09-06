public class ChangeTheValues2 {
    public static void main(Lesson[] args) {
        String s = "ads";
        System.out.println(s.length());
        int x = 5;
        int y = 6;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x);
        System.out.println(y);
    }
}
