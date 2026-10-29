class ExceptionEx6 {
    public static void main(String[] args) {
        try {
            /*
            Exception e = new Exception("manual exception");
            throw e;
            */
            throw new Exception("manual exception");
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Program ends");
    }
}