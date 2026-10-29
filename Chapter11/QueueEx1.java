import java.util.*;

class QueueEx1 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("help for more details");

        while(true) {
            System.out.println(">>");
            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if("".equals(input)) continue;

                if(input.equalsIgnoreCase("q")) {
                    System.exit(0);
                }
                else if (input.equalsIgnoreCase("help")) {
                    System.out.println("help - show details");
                    System.out.println("q or Q - quit program");
                    System.out.println("history = show recent " + MAX_SIZE + " queries");
                }
                else if (input.equalsIgnoreCase("history")) {
                    int i=0;
                    save(input);

                    LinkedList tmp = (LinkedList)q;
                    ListIterator it = tmp.listIterator();

                    while(it.hasNext()) {
                        System.out.println(++i+"."+it.next());
                    }
                }
                else {
                    save(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("Input Error");
            }
        }
    }

    public static void save(String input) {
        if(!"".equals(input))
            q.offer(input);

        if(((LinkedList)q).size() > MAX_SIZE)
            q.remove();
    }
}