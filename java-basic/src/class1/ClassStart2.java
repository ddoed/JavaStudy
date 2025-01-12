package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] names = {"s1","s2", "s3"};
        int[] ages = {15,16,17};
        int[] grade = {90,80,70};

        for(int i = 0; i < names.length; i++) {
            System.out.println("이름:" + names[i] + " 나이:" + ages[i] + " 성적:" + grade[i]);
        }
    }
}