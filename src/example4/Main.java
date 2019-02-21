package example4;

public class Main {
    public static void main(String[] args) {
        Company myComp = Company.GOOGLE;
        System.out.println(myComp);

        int salary = myComp.getValue();
        String currency = myComp.getCurrency();
        System.out.println("I earn " + salary + " " + currency + " a month.");
    }
}
