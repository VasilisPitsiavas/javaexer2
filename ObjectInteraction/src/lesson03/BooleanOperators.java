package lesson03;

/**
 * Επίδειξη της διαφοράς μεταξύ των τελεστών && και &.
 * Η ίδια διαφορά ισχύει και μεταξύ των || και |. Επιπλέον,
 * το παράδειγμα δείχνει και τη διαφορά μεταξύ της προθεματικής
 * και επιθεματική μορφής του τελεστή ++
 * 
 * @author Grigoris Tsoumakas
 * @version 2010.10.11
 */
class BooleanOperators
{

    public static void main(String[] args)
    {
        boolean a=true;
        int b=0;
        if (a & ((++b) == 1)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        System.out.println(b);
    }
}
