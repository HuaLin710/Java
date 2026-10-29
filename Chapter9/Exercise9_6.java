class Exercise9_6 {
    public static String fillZero(String src, int length) {
        if (src == null || src.length() == length)
            return src;
        else if (length <= 0)
            return "";
        else if (src.length() > length)
            return src.substring(0, length);
        else {
            char[] arr = new char[length];
            for(int i=0; i<arr.length; i++)
                arr[i]='0';
            for(int j=(arr.length-src.length()); j<arr.length; j++)
            {
                arr[j]=src.charAt(j-(arr.length-src.length()));
            }
            return String.valueOf(arr);
        }
        
        /*
        else {
            if (src.length() > length)
                return src.substring(0, length);
            else {
                char[] arr = new char[length];
                for(int j=0; j<(length-src.length()); j++)
                    arr[j]='0';
                for(int j=(length-src.length()); j<length; j++)
                    arr[j]=src.charAt(j-(length-src.length()));
                return String.valueOf(arr);
            }
        }
        */
    }

    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src, 10));
        System.out.println(fillZero(src, -1));
        System.out.println(fillZero(src, 3));
    }
}