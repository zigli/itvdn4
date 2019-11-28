package example5;

public class Main {

    public static int getTemp(){
        return temp;
    }

    private static int temp;


    public static void main(String[] args) {
        Main.getTemp();

        Main g = new Main();

        System.out.println(g.getTemp());
    }
}
