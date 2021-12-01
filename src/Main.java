public class Main {
    public static void main(String[] args) {
        int start = 100;
        int plus = 1000;
        int bonus = plus / 100;
        int all = start + plus + bonus;
        if (plus >= 1000) {
            System.out.println(all);
        } else {
            System.out.println(start + plus);
        }
    }
}
