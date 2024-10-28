package placement;

public class strbuffer_replace {
    public static void main(String[] args) {
        StringBuffer r = new StringBuffer("hello");
        r.replace(1, 3, "java");
        System.out.println(r);
    }

}
