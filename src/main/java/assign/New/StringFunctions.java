package assign.New;

public class StringFunctions {
    public String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public int size(String str) {
        return str.length();
    }
}
