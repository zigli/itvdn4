package example1;

//Enums are final and static

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {

    public static void main(String[] args) {
	    Day today = Day.SATURDAY;
        System.out.println("Today is " + today);
    }
}
