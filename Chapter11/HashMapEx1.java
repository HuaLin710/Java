import java.util.*;

class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("caastello", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner s = new Scanner(System.in);

        while (true) { 
            System.out.println("Input id and password: ");
            System.out.print("id: ");
            String id = s.nextLine().trim();

            System.out.print("password: ");
            String password = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)) {
                System.out.println("Input id does not exist. Please re-enter.");
                continue;
            }
            else {
                if(!(map.get(id)).equals(password)) {
                    System.out.println("Password does not match. Please re-enter.");
                }
                else {
                    System.out.println("id and password match.");
                    break;
                }
            }
        }
    }
}