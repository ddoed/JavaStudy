package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] s = email.split("@");

        String id = s[0];
        String domain = s[1];

        System.out.println(id);
        System.out.println(domain);
    }
}
