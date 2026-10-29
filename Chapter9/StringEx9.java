class StringEx9 {
    public static void main(String[] args) {
        String fullName = "Hello.java";

        int index = fullName.indexOf('.');

        String fileName = fullName.substring(0, index);

        String ext = fullName.substring(index+1);

        System.out.println(fullName + "\'s name excluding the extension is " + fileName);
        System.out.println(fullName + "\s extension is " + ext);
    }
}