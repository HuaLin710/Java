class Shuffle {
    static int[] shuffle(int[] original) {
        int[] result = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            int randomIndex = (int) (Math.random() * original.length);
            while (result[randomIndex] != 0) {
                randomIndex = (randomIndex + 1) % original.length;
            }
            result[randomIndex] = original[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}