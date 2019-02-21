package example4;

public enum Company {
    ITVDN(1000),
    GOOGLE(100),
    SKYNET(10);

    int value;

    Company(int value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return "Company: " + super.toString() + ", salary = " + getValue() + " " + getCurrency();
    }

    public int getValue() {
        return value;
    }

    public abstract String getCurrency();
}


//public class Company {
//
//
//}
