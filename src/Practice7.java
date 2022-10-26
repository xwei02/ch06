public class Practice7 {
    public static boolean checkEnd(String str1, String str2) {
        int j = str1.length() - 1;
        for (int i = str2.length() - 1; i >= 0; i--, j--) {
            if (str1.charAt(j) != str2.charAt(i)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkEnd("university", "y"));
        System.out.println(checkEnd("university", "city"));
        System.out.println(checkEnd("function", "ion"));
        System.out.println(checkEnd("GitHub", "hub"));
    }
}
