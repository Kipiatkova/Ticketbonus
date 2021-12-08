public class Main {
    public static void main(String[] args) {
        int start = 100;
        int plus = 1100;
        int bonus = plus / 100;
        int all = start + plus + bonus;
        int finish = start + plus;
        if (plus > 1000) {
            System.out.println(all);
        }
        else {
            if (plus < 1000) {
                System.out.println(finish);
            }
        }
    }
}
