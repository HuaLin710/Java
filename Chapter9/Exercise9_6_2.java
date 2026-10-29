class Exercise9_6_2 {
    public static String fillZero(String src, int length) {
        String result = "";
        StringBuffer sb = new StringBuffer(0);
        if (src == null || src.length() == length)
            return src;
        else if (length <= 0) 
            return "";
        else if (src.length() > length)
            return src.substring(0, length);
        else {
            char[] arr = new char[length-src.length()];
            for(int i=0; i<arr.length; i++) {
                arr[i]='0';
                sb.append(arr[i]);
            }
            sb.append(src);
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src, 10));
        System.out.println(fillZero(src, -1));
        System.out.println(fillZero(src, 3));
    }
}