import java.util.Scanner;
public class americanflag
{
    public static void main(String[] args)
    {
String[][] anArray;
String[][] anArrayc;
int rows,cols,row1,col1,row2,col2;
rows = 4;
cols = 6;
anArrayc = new String[rows][cols];
anArray = new String[rows][cols];
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
anArray[2][0] = "*";
anArray[2][1] = "*";
anArray[2][2] = "*";
anArray[2][3] = "*";
anArray[2][4] = "*";
anArray[2][5] = "*";
anArray[3][0] = "*";
anArray[3][1] = "*";
anArray[3][2] = "*";
anArray[3][3] = "*";
anArray[3][4] = "*";
anArray[3][5] = "*";
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


System.out.print(anArray[2][0]); System.out.print(" ");
System.out.print(anArray[2][1]); System.out.print(" ");
System.out.print(anArray[2][2] ); System.out.print(" ");
System.out.print(anArray[2][3] ); System.out.print(" ");
System.out.print(anArray[2][4] ); System.out.print(" ");
System.out.println(anArray[2][5] ); //System.out.print(" ");
System.out.print(anArray[3][0] ); System.out.print(" ");
System.out.print(anArray[3][1] ); System.out.print(" ");
System.out.print(anArray[3][2] ); System.out.print(" ");
System.out.print(anArray[3][3] ); System.out.print(" ");
System.out.print(anArray[3][4] ); System.out.print(" ");
System.out.print(anArray[3][5] ); System.out.print(" ");
System.out.println("\n" ); System.out.print("");
Scanner input = new Scanner(System.in);
System.out.println("select one star to open tell me in which row and col is");
row1 = input.nextInt();
col1 = input.nextInt();
if (row1 == 0 && col1 == 0)
{
    System.out.println(anArray[0][0]);
}








     }
}
