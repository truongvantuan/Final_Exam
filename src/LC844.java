public class LC844 {

    public static boolean backspaceCompare(String S, String T) {
        return type(S).equals(type(T));
    }

    private static String type(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (sb.length() > 0)
                    sb.setLength(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String S = "ab#c";
        String T = "ad#c";
        String A = "a##c";
        String B = "#a#c";
        System.out.println(backspaceCompare(S, T));
        System.out.println(backspaceCompare(A, B));
    }
}
