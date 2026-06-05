package chapter3;

public class StringBuilderLesson {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Start");
        // System.out.println(sb);
        // sb.append("+middle");
        // System.out.println(sb);
        // StringBuilder same = sb.append("+end");
        // System.out.println(same);
        // System.out.println(sb);

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        StringBuilder sb = new StringBuilder("marco");
        String nameKo = "marco";
        // System.out.println(sb==nameKo);
        System.out.println(sb.toString()==nameKo);
        System.out.println(sb.toString().equals(nameKo));
    }
}
