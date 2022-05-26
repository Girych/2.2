public class dz2 {
    public static void main(String[] args) {

        int balance = 900;
        int refill = 1500;

        int bonus = refill / 100;
        if (refill >= 1000) {
            System.out.println("Ваш баланс: " + (balance + refill));
            System.out.println("Бонусный баланс: " + bonus);
        } else {
            System.out.println("Ваш баланс: " + (balance + refill));
        }
    }

}