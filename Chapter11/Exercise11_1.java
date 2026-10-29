import java.util.*;

class Exercise11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList kyo = new ArrayList();
        ArrayList cha = new ArrayList();
        ArrayList hap = new ArrayList();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        hap.addAll(list1);
        for(int i=0; i<list2.size(); i++) {
            if(!hap.contains(list2.get(i)))
                hap.add(list2.get(i));
        }

        for(int i=0; i<list2.size(); i++) {
            if(list1.contains(list2.get(i)))
                kyo.add(list2.get(i));
        }

        cha = (ArrayList)hap.clone();
        cha.removeAll(list2);


        System.out.println("list1="+list1);
        System.out.println("list2="+list2);
        System.out.println("kyo="+kyo);
        System.out.println("cha="+cha);
        System.out.println("hap="+hap);
    }
}