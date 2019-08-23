public class XOR {

    public static void main(String[] args) {
       boolean x = false;
       boolean y = false;
      boolean xor1 = x ^ y;

        System.out.println("false xor false: " + xor1);
        System.out.println(xor(x,y));

        x = false;
        y = true;
        xor1 = x ^ y;
        System.out.println("false xor true: " + xor1);
        System.out.println(xor(x,y));

        x = true;
        y = false;
        xor1 = x ^ y;
        System.out.println("true xor false: " + xor1);
        System.out.println(xor(x,y));

        x = true;
        y = true;
        xor1 = x ^ y;
        System.out.println("truexor true: " + xor1);
        System.out.println(xor(x,y));




    }
    public static boolean xor(boolean x, boolean y) {
        if(x && y || !x && !y){
            return false;
        } else
            return true;
    }
}
