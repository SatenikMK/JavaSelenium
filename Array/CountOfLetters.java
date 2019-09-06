package Array;

public class CountOfLetters {
    public static void main(String[] args) {
        String sentance = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
        int count = 0;
        for (int i = 0; i < sentance.length(); i++) {
            System.out.println(sentance.charAt(i));
            if (Character.isLetter(sentance.charAt(i)))
                count += 1;
        }
        System.out.println("Count of letters in sentance is : " + count);
    }
}
