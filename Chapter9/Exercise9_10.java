class Exercise9_10 {
    public static String format(String str, int length, int alignment) {
        if (length < str.length()) {
            return str.substring(0, length);
        }
        else {
            char[] arr = new char[length];
            for(int i=0; i<length; i++) {
                arr[i] = ' ';
            }
            if (alignment == 0) 
                System.arraycopy(str.toCharArray(), 0, arr, 0, str.length());
            else if (alignment == 1) 
                System.arraycopy(str.toCharArray(), 0, arr, (length-str.length())/2, str.length());
            else 
                System.arraycopy(str.toCharArray(), 0, arr, length-str.length(), str.length());
            return String.valueOf(arr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";

        System.out.println(format(str, 7, 0));
        System.out.println(format(str, 7, 1));
        System.out.println(format(str, 7, 2));
    }
}