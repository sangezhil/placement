package placement;

public class strbuffer_capacity {
    public static void main(String[] args) {
        StringBuffer cap = new StringBuffer("java");
        System.out.println(cap.capacity());
        cap.append("hello");
        System.out.println(cap.capacity());
    }

}
