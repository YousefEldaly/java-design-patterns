package refactoringguru.strategy.strategies;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PayByCreditCard implements PayStrategy{
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;


    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("Enter the card Number: ");
            String number = READER.readLine();
            System.out.println("Enter the card expiration date 'mm/yy': ");
            String date = READER.readLine();
            System.out.println("Enter the cvv code: ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
