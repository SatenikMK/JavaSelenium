public class Lesson {
    public static void main(String args[]) {
        //String S1 = "hello";
        StringBuilder S1 = new StringBuilder("hello");
        for (int i = 0; i < 3; i++) {
            S1.append(S1);

        }
    }
}

