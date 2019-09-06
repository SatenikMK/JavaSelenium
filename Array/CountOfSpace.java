package Array;

public class CountOfSpace {
    public static void main(String[] args) {
        String sentance = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
        int count = 0;
        for (char c : sentance.toCharArray()) {
            if (c == ' ') {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
