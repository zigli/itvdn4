package example4;

public class Z {
    public void print( Object o ) {
        System.out.println( "Object" );
    }

    public void print( String str ) {
        System.out.println( "String" );
    }

    public void print( Integer i ) {
        System.out.println( "Integer" );
    }

    public static void main(String[] args) {
        Integer oInt1 = null;
        int int1 = oInt1;
        System.out.println(int1);
    }


}