package example4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Company myComp = Company.GOOGLE;
        System.out.println(myComp);

        int salary = myComp.getValue();
        String currency = myComp.getCurrency();
        System.out.println("I earn " + salary + " " + currency + " a month.");

        String x = "100"; String y = "100";
        if (x == y)
            System.out.println("Equal");

        System.out.println("123" == "123");                          // true
        System.out.println(("12" + "3") == "123");          // true
        System.out.println(new String("123") == new String("123"));  // false
        System.out.println(new String("123") == "123");              // false
        System.out.println(new String("123").intern() == "123");     // true

        String name = "ilgiz";
        byte[] byteArr = name.getBytes();
        System.out.println(Arrays.toString(byteArr));
        String name1 = new String(byteArr);
        System.out.println(name1);

        StringBuffer str = new StringBuffer(name);
        name.replaceAll(Character.toString('y'),"" );
        StringBuffer reverse = str.reverse();
        System.out.println(reverse);





    }
}
