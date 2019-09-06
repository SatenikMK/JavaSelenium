public class ChangeTheValue1 {
    public static void main(Lesson[] args) {
        int x = 12;
        int y = 10;
        int x1 = x;
        x = y;
        y = x1;

        System.out.println(x);
        System.out.println(y);

    }
}
