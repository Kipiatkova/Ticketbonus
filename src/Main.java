public class Main {
    public static void main(String[] args) {
        int start = 100;
        int plus = 1100;
        if (plus > 1000) {
            int bonus = (plus / 100);
            int all = start + plus + bonus;
            {
                System.out.println(all);
            }
        } else {
            int finish = start + plus;
            {
                System.out.println(finish);
            }

        }
    }
}


