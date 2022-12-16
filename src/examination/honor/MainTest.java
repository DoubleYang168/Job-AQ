package examination.honor;

public class MainTest {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf("AB", 16);
        String s = Integer.toHexString(integer).toUpperCase();
        System.out.println(Integer.toHexString(18).toUpperCase());
    }
}
