class Max {
    static int max(int[] arr) {
        if (arr==null || arr.length==0) 
        {
            return -999999;
        }
        int maxim=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>maxim)
            {
                maxim=arr[i];
            }
        }
        return maxim;
    }

   public static void main(String[] args) {
    int[] data = {3, 2, 9, 4, 7};
    System.out.println(java.util.Arrays.toString(data));
    System.out.println("Max: "+max(data));
    System.out.println("Max: "+max(null));
    System.out.println("Max: "+max(new int[] {}));
   }
}