class Exercise9_5 {
    public static int count(String src, String target) {
        int count = 0;
        int pos = 0;

        int index = 0;

        if(src.indexOf(target, pos)!=-1) {
            while(true) {
                index = src.indexOf(target, pos);
                if(index==-1)
                    break;
                count++;
                pos = index + target.length();
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));
    }
}

