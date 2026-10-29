class ThreadEx4 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for(int i=0; i<300; i++) {
            System.out.print("-");
        }

        System.out.println("time1 needed: " + (System.currentTimeMillis() - startTime));

        for(int i=0; i<300; i++) {
            System.out.print("|");
        }
        System.out.println("time2 needed: " + (System.currentTimeMillis() - startTime));
    }
}