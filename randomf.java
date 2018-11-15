import java.util.Random;
public class randomf
{
    public static void main(String[] args)
    {
        Random r = new Random();
    //    String[][] alphabe;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char c = (char)(r.nextInt(26) + 'a');
        int row,col;
        // alphabe = new String[row][col];
        row = 4;
        col = 6;
    //    for (row=0 ; row<4 ; row++)
//        {
//            System.out.println(alphabet[][].charAt(r.nextInt(alphabet[][].length())));
//            for(col=0 ; col<6 ; col++)
//            {
//                System.out.println(alphabet[][].charAt(r.nextInt(alphabet[][].length())));

         for (int i=0 ; i<26 ; i++)
         {
             System.out.println(alphabet.charAt(r.nextInt(alphabet.length())));
         }






        }
    }
