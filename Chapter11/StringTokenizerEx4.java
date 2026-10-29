import java.util.*;

class StringTokenizerEx4 {
    public static void main(String[] args) {
        String input = "three hundred three thousand one hundred fifteen";

        System.out.println(input);
        System.out.println(wordsToNum(input));
    }

    public static long wordsToNum(String input) {
        Map<String, Long> values = new HashMap<String, Long>();
        values.put("zero", 0L);
        values.put("one", 1L);
        values.put("two", 2L);
        values.put("three", 3L);
        values.put("four", 4L);
        values.put("five", 5L);
        values.put("six", 6L);
        values.put("seven", 7L);
        values.put("eight", 8L);
        values.put("nine", 9L);
        values.put("ten", 10L);
        values.put("eleven", 11L);
        values.put("twelve", 12L);
        values.put("thirteen", 13L);
        values.put("fourteen", 14L);
        values.put("fifteen", 15L);
        values.put("sixteen", 16L);
        values.put("seventeen", 17L);
        values.put("eighteen", 18L);
        values.put("nineteen", 19L);
        values.put("twenty", 20L);
        values.put("thirty", 30L);
        values.put("forty", 40L);
        values.put("fifty", 50L);
        values.put("sixty", 60L);
        values.put("seventy", 70L);
        values.put("eighty", 80L);
        values.put("ninety", 90L);
        values.put("hundred", 100L);
        values.put("thousand", 1000L);
        values.put("million", 1000000L);
        values.put("billion", 1000000000L);

        StringTokenizer st = new StringTokenizer(input, " ");
        long result = 0;
        long current = 0;

        while (st.hasMoreTokens()) {
            String token = st.nextToken().toLowerCase();
            Long val = values.get(token);
            if (val == null) {
                continue;
            }

            if (val == 100) {
                current = (current == 0 ? 1 : current) * val;
            } else if (val >= 1000) {
                result += (current == 0 ? 1 : current) * val;
                current = 0;
            } else {
                current += val;
            }
        }

        return result + current;
    }
}
