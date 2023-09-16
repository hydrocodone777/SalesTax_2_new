public class Main {
    public static void main(String[] args) {
        int purchasePrice = 90;
        double tax = 0.05;
        double saleTax = 0;
        System.out.println("Your purchase price is " + purchasePrice);
        saleTax = purchasePrice * tax;
        System.out.println("Your sale's tax is $" + saleTax);
    }
}