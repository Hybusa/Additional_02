import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {

        // First task

/*
        Напишите программу, которая проверяет и выводит на экран,
        является ли целое число записанное в переменную p,
        чётным или нечётным. Ноль является нечетным числом.
*/
        System.out.print("Задание 1. \n Введите чило: \n");
        Scanner myInput = new Scanner(System.in);
        int p = myInput.nextInt();

        if (p % 2 != 0 || p == 0)
            System.out.print("Число нечетное");
        else
            System.out.print("Число четное");

        System.out.println(System.lineSeparator());

    }
    public static void task2() {

        // Second task
/*
        Напишите программу, которая выводит на экран ближайшее к 10 из двух чисел,
        записанных в переменные p и d.
        Например, среди чисел 7.3 и 11.13 ближайшее к десяти 11.13.
*/
        System.out.print("Задание 2. \n Введите 2 числа: \n");
        Scanner myInput = new Scanner(System.in);

        float p = myInput.nextFloat();

        float d = myInput.nextFloat();

        if ((10 - p) > (10 - d))
            System.out.print(p);
        else
            System.out.print(d);

        System.out.println(System.lineSeparator());

    }
    public static void task3() {
        // Third task

/*
        Напишите программу, которая проверяет, попало ли случайно выбранное из отрезка [3;158] целое число
        (его нужно сгенерировать с помощью класса Random) в интервал (22;99) и выводить результат в консоль.
*/
        System.out.println("Задание 3.");
        int min = 3;
        int max = 158;

        int randA = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Рандомное число : " + randA);

        if (randA < 99 && randA > 22)
            System.out.println("Число попавло в заданный диапазон.");
        else
            System.out.println("Число не попавло в заданный диапазон.");

        System.out.println(System.lineSeparator());
    }
    public static void task4() {

        //Fourth task
/*
        Напишите программу, которая генерирует случайное трехзначное число (воспользоваться классом Random),
        а затем находит и выводит в консоль наибольшего его члена.
        Например, в числа 586 наибольшим членом является 8, т.к. это число больше 5 и больше 6.
 */
        System.out.println("Задание 4.");
        int min = 100;
        int max = 999;

        int randA = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Рандомоное трехзначиное число: " + randA);

        int a = randA / 100;
        int b = (randA % 100) / 10;
        int c = randA % 10;

        if (a > b && a > c)
            System.out.println("Самый большой член числа " + randA + " : " + a);
        else if (b > c)
            System.out.println("Самый большой член числа " + randA + " : " + b);
        else
            System.out.println("Самый большой член числа " + randA + " : " + c);

        System.out.println(System.lineSeparator());

    }

    public static void task5() {
        //Fifth task
/*
        Даны три переменные a, b и c, которые содержат целочисленные значение и не равны между собой.
        Напишите программу, которая выводит в консоль в качестве результата последовательность из трех
        значений данных переменных от самой меньшего значения к самому большему.
            Важно: учитывайте, что значения могут быть отрицательными.
*/

        System.out.println("Задание 5.");

        Random random = new Random();
        int a = (random.nextInt(65536) - 32768);
        int b = (random.nextInt(65536) - 32768);
        int c = (random.nextInt(65536) - 32768);

        int[] numb = {a, b, c};

        System.out.println("Числа: " + Arrays.toString(numb));

        Arrays.sort(numb);

        System.out.println("В порядке возростания: " + Arrays.toString(numb));

        System.out.println(System.lineSeparator());
    }

    public static void task6() {
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

        int min = 0;
        int max = 28800;

        int randSec = (int)(Math.random()*(max-min+1)+min);

        int secLeft = max - randSec;

        float hoursLeft = secLeft/3600f;

        System.out.println("Секунд осталось: " + secLeft);
        System.out.println("Часов осталось: " + hoursLeft);


    }
}