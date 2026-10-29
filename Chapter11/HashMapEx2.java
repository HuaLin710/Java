import java.util.*;

class HashMapEx2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("Kim", 90);
        map.put("Kim", 100);
        map.put("Lee", 100);
        map.put("Kang", 80);
        map.put("An", 90);

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("name: " + e.getKey() + ", score: " + e.getValue());
        }

        set = map.keySet();
        System.out.println("name list: " + set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while(it.hasNext()) {
            Integer i = (Integer)it.next();
            total += i;
        }

        System.out.println("total: " + total);
        System.out.println("average: " + (float)total/set.size());
        System.out.println("max: " + Collections.max(values));
        System.out.println("min: " + Collections.min(values));
    }
}