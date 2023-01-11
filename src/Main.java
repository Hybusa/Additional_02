import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args)
    {

        // First task

/*
        Напишите программу, которая проверяет и выводит на экран,
        является ли целое число записанное в переменную p,
        чётным или нечётным. Ноль является нечетным числом.
*/
        System.out.print("Задание 1. \n Введите чило: \n");
        Scanner myInput1 = new Scanner( System.in );
        int p1 = myInput1.nextInt();

        if( p1%2 != 0 || p1==0 )
            System.out.print("Число нечетное");
        else
            System.out.print("Число четное");

        System.out.println(System.lineSeparator());

        // Second task
/*
        Напишите программу, которая выводит на экран ближайшее к 10 из двух чисел,
        записанных в переменные p и d.
        Например, среди чисел 7.3 и 11.13 ближайшее к десяти 11.13.
*/
        System.out.print("Задание 2. \n Введите 2 числа: \n");
        Scanner myInput2 = new Scanner( System.in );

        float p2 = myInput2.nextFloat();

        float d2 = myInput2.nextFloat();

        if ((10-p2) > (10-d2))
            System.out.print(p2);
        else
            System.out.print(d2);

        System.out.println(System.lineSeparator());


        // Third task

/*
        Напишите программу, которая проверяет, попало ли случайно выбранное из отрезка [3;158] целое число
        (его нужно сгенерировать с помощью класса Random) в интервал (22;99) и выводить результат в консоль.
*/
        System.out.println("Задание 3.");
        int min3 = 3;
        int max3 = 158;

        int randA3 = (int)(Math.random()*(max3-min3+1)+min3);
        System.out.println("Рандомное число : " + randA3);

        if(randA3 < 99 && randA3 >22)
            System.out.println("Число попавло в заданный диапазон.");
        else
            System.out.println("Число не попавло в заданный диапазон.");

        System.out.println(System.lineSeparator());

        //Fourth task
/*
        Напишите программу, которая генерирует случайное трехзначное число (воспользоваться классом Random),
        а затем находит и выводит в консоль наибольшего его члена.
        Например, в числа 586 наибольшим членом является 8, т.к. это число больше 5 и больше 6.
 */
        System.out.println("Задание 4.");
        int min4 = 100;
        int max4 = 999;

        int randA4 = (int)(Math.random()*(max4-min4+1)+min4);
        System.out.println("Рандомоное трехзначиное число: " + randA4);

        int a4 = randA4/100;
        int b4 = (randA4%100) / 10;
        int c4 = randA4%10;

        if (a4 > b4 && a4 > c4)
            System.out.println("Самый большой член числа " + randA4 + " : " + a4);
        else if (b4 > c4)
            System.out.println("Самый большой член числа " + randA4 + " : " + b4);
        else
            System.out.println("Самый большой член числа " + randA4 + " : " + c4);

        System.out.println(System.lineSeparator());

        //Fifth task
/*
        Даны три переменные a, b и c, которые содержат целочисленные значение и не равны между собой.
        Напишите программу, которая выводит в консоль в качестве результата последовательность из трех
        значений данных переменных от самой меньшего значения к самому большему.
            Важно: учитывайте, что значения могут быть отрицательными.
*/

        System.out.println("Задание 5.");

        Random random=new Random();
        int a5 = (random.nextInt(65536)-32768);
        int b5 = (random.nextInt(65536)-32768);
        int c5 = (random.nextInt(65536)-32768);

        int[] numb5 = {a5,b5,c5};

        System.out.println("Числа: " + Arrays.toString(numb5));

        Arrays.sort(numb5);

        System.out.println("В порядке возростания: " + Arrays.toString(numb5));

        System.out.println(System.lineSeparator());

        //Sixth task
/*
        На одном предприятии инженер Иванов придумал и сделал устройство, которое показывает
        количество секунд до конца рабочего дня.
        Ровно в 8 часов утра инструмент показывает на экране «28800»
        Когда на часах 13:30, то на экране «9000»
        Когда наступает 16 часов, то инструмент показывает «0» (так как рабочий день закончен).
        Программист Петров обратил внимание, что офисным сотрудникам неудобно пользоваться инструментов,
        так как они не оценивают свой рабочий день в секундах. Им было бы куда удобнее,
        если бы на экране отображалось, сколько часов рабочего дня осталось.
        Напишите программу, которая высчитает из исходного количества секунд, сколько целых рабочих часов осталось.
        Программа должна выводить в консоль на одной строке количество секунд до конца рабочего дня,
        а на другой –  количество часов  до конца рабочего дня.
        Для записи исходного значения секунд используйте целочисленную переменную из интервала [0;28800]
*/
        System.out.println("Задание 5.");

        int min6 = 0;
        int max6 = 28800;

        int randSec6 = (int)(Math.random()*(max6-min6+1)+min6);

        int secLeft6 = max6 - randSec6;

        float hoursLeft6 = secLeft6/3600f;

        System.out.println("Секунд осталось: " + secLeft6);
        System.out.println("Часов осталось: " + hoursLeft6);


    }
}