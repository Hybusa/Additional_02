import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {

        // First task

/*
        Напишите программу, которая проверяет и выводит на экран,
        является ли целое число записанное в переменную p,
        чётным или нечётным. Ноль является нечетным числом.
*/

        Scanner myInput = new Scanner( System.in );
        int p = myInput.nextInt();

        if( p%2 != 0 || p==0 )
            System.out.print("Число нечетное");
        else
            System.out.print("Число четное");

    }
}