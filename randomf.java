import java.util.Random;
public class randomf
{
    public static void main(String[] args)
    {
        Random r = new Random();
    //    String[][] alphabe;
        int row,col;
        row=4;
        col=6;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWX";
        char[][] mytable;
        mytable = new char[row][col];

        char c = (char)(r.nextInt(26) + 'a');

        // alphabe = new String[row][col];

    //    for (row=0 ; row<4 ; row++)
//        {
//            System.out.println(alphabet[][].charAt(r.nextInt(alphabet[][].length())));
//            for(col=0 ; col<6 ; col++)
//            {
//                System.out.println(alphabet[][].charAt(r.nextInt(alphabet[][].length())));

         for (int i=0 ; i<row ; i++)
         {
             for (int j=0 ; j<col ; j++)
             {
                mytable[i][j] =  alphabet.charAt(r.nextInt(alphabet.length()));

            //    System.out.println(alphabet.charAt(r.nextInt(alphabet.length())));
              }
         }


         for (int i=0 ; i<row ; i++)
         {
             for (int j=0 ; j<col ; j++)
             {


                System.out.print(mytable[i][j] );
              }
             System.out.println();
         }






        }
    }
