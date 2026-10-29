class StringEx4 {
    public static void main(String[] args) {
        String[] words = { new String("aaa"), new String("bbb"), new String("ccc")};

        for(int i=0; i<words.length; i++) {
            if(words[i].equals("ccc")) {
                System.out.println("i: " + i);
                System.out.println("Found in words by equals method");
            }
            if(words[i] == "ccc") {
                System.out.println("i: " + i);
                System.out.println("Found in words by == operator");
            }
        }

        for (int i=0; i<words.length; i++) {
            words[i] = words[i].intern();
        }
        System.out.println("<<After implementing intern methord in String arrady words literal array>>");
        
        for(int i=0; i<words.length; i++) {
            if(words[i].equals("ccc")) {
                System.out.println("i: " + i);
                System.out.println("Found in words by equals method");
            }
            if(words[i] == "ccc") {
                System.out.println("i: " + i);
                System.out.println("Foudn in words by == operator");
            }
        }
    }
}