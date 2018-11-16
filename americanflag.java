import java.util.Scanner;
import java.util.Random;
public class americanflag
{
    public static void main(String[] args)
    {
Random r = new Random();
char[][] anArray;
char[][] anArrayc;
String[][] starArray;
int rows,cols,row1,col1,row2,col2;
String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWX";
char c = (char)(r.nextInt(26) + 'a');

rows = 4;
cols = 6;
anArrayc = new char[rows][cols];
anArray = new char[rows][cols];
starArray = new String[rows][cols];

for (int i=0 ; i<rows ; i++)
{
    for (int j=0 ; j<cols ; j++)
    {
       anArray[i][j] =  alphabet.charAt(r.nextInt(alphabet.length()));

   //    System.out.println(alphabet.charAt(r.nextInt(alphabet.length())));
     }
}


for (int i=0 ; i<rows ; i++)
{
    for (int j=0 ; j<cols ; j++)
    {


       System.out.print(anArray[i][j] );
     }
    System.out.println();
}






/*

anArrayc[0][0] = "a";
anArrayc[0][1] = "b";
anArrayc[0][2] = "c";
anArrayc[0][3] = "d";
anArrayc[0][4] = "e";
anArrayc[0][5] = "f";
anArrayc[1][0] = "g";
anArrayc[1][1] = "h";
anArrayc[1][2] = "i";
anArrayc[1][3] = "j";
anArrayc[1][4] = "k";
anArrayc[1][5] = "l";



anArray[0][0] = "a";
anArray[0][1] = "b";
anArray[0][2] = "c";
anArray[0][3] = "d";
anArray[0][4] = "e";
anArray[0][5] = "f";
anArray[1][0] = "g";
anArray[1][1] = "h";
anArray[1][2] = "i";
anArray[1][3] = "j";
anArray[1][4] = "k";
anArray[1][5] = "l";
*/
starArray[0][0] = "*";
starArray[0][1] = "*";
starArray[0][2] = "*";
starArray[0][3] = "*";
starArray[0][4] = "*";
starArray[0][5] = "*";
starArray[1][0] = "*";
starArray[1][1] = "*";
starArray[1][2] = "*";
starArray[1][3] = "*";
starArray[1][4] = "*";
starArray[1][5] = "*";
/*
System.out.print(anArrayc[0][0]); System.out.print(" ");
System.out.print(anArrayc[0][1]); System.out.print(" ");
System.out.print(anArrayc[0][2] ); System.out.print(" ");
System.out.print(anArrayc[0][3] ); System.out.print(" ");
System.out.print(anArrayc[0][4] ); System.out.print(" ");
System.out.println(anArrayc[0][5] ); //System.out.print(" ");
System.out.print(anArrayc[1][0] ); System.out.print(" ");
System.out.print(anArrayc[1][1] ); System.out.print(" ");
System.out.print(anArrayc[1][2] ); System.out.print(" ");
System.out.print(anArrayc[1][3] ); System.out.print(" ");
System.out.print(anArrayc[1][4] ); System.out.print(" ");
System.out.print(anArrayc[1][5] ); System.out.print(" ");
System.out.println("\n" ); System.out.print("");



System.out.print(anArray[0][0]); System.out.print(" ");
System.out.print(anArray[0][1]); System.out.print(" ");
System.out.print(anArray[0][2] ); System.out.print(" ");
System.out.print(anArray[0][3] ); System.out.print(" ");
System.out.print(anArray[0][4] ); System.out.print(" ");
System.out.println(anArray[0][5] ); //System.out.print(" ");
System.out.print(anArray[1][0] ); System.out.print(" ");
System.out.print(anArray[1][1] ); System.out.print(" ");
System.out.print(anArray[1][2] ); System.out.print(" ");
System.out.print(anArray[1][3] ); System.out.print(" ");
System.out.print(anArray[1][4] ); System.out.print(" ");
System.out.print(anArray[1][5] ); System.out.print(" ");
System.out.println("\n" ); System.out.print("");

*/
System.out.print(starArray[0][0]); System.out.print(" ");
System.out.print(starArray[0][1]); System.out.print(" ");
System.out.print(starArray[0][2] ); System.out.print(" ");
System.out.print(starArray[0][3] ); System.out.print(" ");
System.out.print(starArray[0][4] ); System.out.print(" ");
System.out.println(starArray[0][5] ); //System.out.print(" ");
System.out.print(starArray[1][0] ); System.out.print(" ");
System.out.print(starArray[1][1] ); System.out.print(" ");
System.out.print(starArray[1][2] ); System.out.print(" ");
System.out.print(starArray[1][3] ); System.out.print(" ");
System.out.print(starArray[1][4] ); System.out.print(" ");
System.out.print(starArray[1][5] ); System.out.print(" ");
System.out.println("\n" ); System.out.print("");
Scanner input = new Scanner(System.in);
System.out.println("select one star to open tell me in which row and col is");
row1 = input.nextInt();
col1 = input.nextInt();
/* if (row1 == 0 && col1 == 0)
{
    System.out.println(anArray[0][0]);
} */

System.out.println("select one star to open from the second map give me the row2 and the col2");
row2=input.nextInt();
col2=input.nextInt();
/* if (row2==0 && col2 == 0)
{
    System.out.println(anArray[0][0]);
}
if (anArray[row1][col1] == anArrayc[row2][col2])
{
    System.out.println("the cards you have is the same ");

}
else
{
    System.out.println("the cards you have isn't the same ");
}
*/
if (anArray[row1][col1] == anArrayc[row2][col2])
{
    System.out.println("the cards you have is the same ");
    System.out.println("the letter you find is: " + anArray[row1][col1]);
/*    for (rows=0 ; rows<2 ; rows++)
    {
        for (cols=0 ; cols<5 ; cols++)
        {

           System.out.print(starArray[rows][cols]);

        }
    }
*/
}
else
{
    System.out.println("the cards that you opened isn't the same");
    System.out.println("the first letter you opened is:" +anArray[row1][col1]);
    System.out.println("the second letter you opened is:" + anArrayc[row2][col2]);
}


     }
}
