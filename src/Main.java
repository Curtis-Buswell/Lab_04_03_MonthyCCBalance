public class Main {
    public static void main(String[] args) {
        int CARD_START = 5000;
        double INTEREST_RATE = .17;
        double month1;
        double month2;
        month1 = CARD_START + CARD_START * INTEREST_RATE;
        month2 = month1 + month1 * INTEREST_RATE;
        System.out.println("Your credit card with a starting balance of $" + CARD_START + " will have a balance of $" + month1 + " after one month, and $" + month2 + " after 2 months.");
    }
}