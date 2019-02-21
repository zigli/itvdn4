package example3;

enum Company {
    GOOGLE(100), ITVDN(1000), SKYNET(10);
    int value;

    Company(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}


public class Main {
    public static void main(String[] args) {
        Company myComp = Company.ITVDN;
        System.out.println("I work at " + myComp + " and earn " + myComp.getValue() + "$ per month");
    }
}
