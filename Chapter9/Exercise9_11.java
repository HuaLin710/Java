class Exercise9_11 {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);

        if(args.length < 2) {
            System.out.println("Input two numbers.");
            System.out.println("USAGE: GugudanTest 3 5");
            System.exit(0);
        }

        if(i<2 || i> 9 || j<2 || j>9) {
            System.out.println("Input two numbers between 2 and 9.");
            System.exit(0);
        }

        int start;
        int end;

        start = Math.min(i, j);
        end = Math.max(i, j);

        for(int n=start; n<=end; n++) {
            for(int m=1; m<=9; m++) {
                System.out.println(n + "x" + m + "=" + n*m);
            }
            System.out.println();
        }
    }
}