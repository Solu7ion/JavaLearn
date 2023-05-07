import java.util.Scanner;

public class ChapterTwo {
    public static void main(String[] args){
        /*
        Вопрос 1:
        Создайте программу, которая принимает с консоли целое число или
        цифру, а затем выводит POSITIVE если введенное значение положительное.
         При отрицательном значении ничего выводить не нужно.

        Ввод:
        8
        Вывод:
        POSITIVE

        Ввод:
        -7
        Вывод:
         */


        /*
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number >= 0){
            System.out.println("POSITIVE");
        }

         */






        /*
        Вопрос 2:
        Напишите программу, которая проверяет делиться ли значение введенное
        с консоли на 17. Если значение делится, программа выводит DIVISIBLE
        BY 17, иначе ничего выводить не надо.

        Ввод:
        34
        Вывод:
        DIVISIBLE BY 17

        Ввод:
        21
        Вывод:
         */

        /*
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x % 17 == 0){
            System.out.println("DIVISIBLE BY 17");
        }

         */






        /*
        Вопрос 3:
        Создайте программу, которая принимает c консоли цифру от 1 до 5
        включительно, далее программа должна вывести ONE - если ввели 1,
        TWO - если ввели 2, THREE - если ввели 3 … и.т.д.

        Ввод:
        3
        Вывод:
        THREE

        Ввод:
        5
        Вывод:
        FIVE
         */

        /*
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (1 <= x && x <= 5) {
            switch (x) {
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
            }
        } else {
            System.out.println("Введите цифру от 1 до 5 включительно");
        }

         */







        /*
        Вопрос 4:
        Напишите программу, где ввожу два целых числа. Если первое число больше
        второго на 10, то выведите YES, иначе NO.

        Ввод:
        20
        10
        Вывод:
        YES



        Ввод:
        10
        75
        Вывод:
        NO
         */

        /*
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        if (x - y >= 10){
            System.out.println("YES");
        }  else {
            System.out.println("NO");
        }

         */






        /*
        Вопрос 5:
        Напишите программу, где ввожу целое число n, и если оно четное,
        программа выведет EVEN иначе ODD.

        Ввод:
        8
        Вывод:
        EVEN


        Ввод:
        7
        Вывод:
        ODD
         */


        /*
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x % 2 == 0){
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

         */








        /*
        Вопрос 6:
        Напишите программу, где я ввожу целые числа a и b, если их значения
        не равны, то выводить в консоль их сумму, иначе просто 0.

        Ввод:
        10
        20
        Вывод:
        30


        Ввод:
        10
        10
        Вывод:
        0
         */

       /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if(a != b){
            System.out.println(a + b);
        } else {
            System.out.println("0");
        }

        */







        /*
        Вопрос 7:
        Напишите программу, где Петя вводит в каком классе он учится, а
        программа должна определить и выдать результат прописью как показано
        в примерах ниже. Помните, что с 1 - го по 4 - ый включительно классы -
        это Beginners School, с 5-го по 9 - ый включительно - это Middle School
         и c 10 - го по 11 - ый включительно - это High School.

        Ввод:
        2
        Вывод:
        Beginners School


        Ввод:
        10
        Вывод:
        High School
         */

        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your class: ");
        int x = in.nextInt();

        if (1 <= x && x <= 4){
            System.out.println("Beginners School");
        } else if (5 <= x && x <= 9) {
            System.out.println("Middle School");
        } else if (10 <= x && x <= 11) {
            System.out.println("High School");
        } else {
                System.out.println("Error");
        }

         */






        /*
        Вопрос 8:
        Дано число. Если оно меньше или равно 2019, то вывести NO,
        если больше или равно 2021, то вывести YES, если равно 2020,
        то вывести ERROR.

        Ввод:
        2018
        Вывод:
        NO


        Ввод:
        2020
        Вывод:
        ERROR
         */


        /*
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number <= 2019){
            System.out.println("YES");
        } else if (number >= 2021) {
            System.out.println("NO");
        } else {
            System.out.println("Error");
        }
        */









        /*
        Вопрос9:
        Создайте программу, которая поможет Арсену быстро выучить названия 12-ти
        месяцев на английском (January, February, March, April, May,
        June, July, August, September, October, November, December).
        Арсен будет вводит порядковый номер того или иного месяца в консоль,
        а далее программу будет выводить наименование с заглавной буквы как
        в примерах ниже, но а если такого месяца не существует, то выводит
        Wrong Input

        Ввод:
        1
        Вывод:
        January

        Ввод:
        71
        Вывод:
        Wrong Input
         */


        /*
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        switch (num){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Wrong Input");
        }

         */








        /*
        Вопрос 10:
        Напишите программу, где я ввожу три числа. Если все числа одинаковые,
        то выведите YES, иначе NO.

        Ввод:
        15
        15
        15
        Вывод:
        YES


        Ввод:
        12
        37
        20
        Вывод:
        NO
         */

        /*
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        if (x == y && x == z && y == z){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

         */








        /*
        Вопрос 11:
        Создайте программу, которая выводит в консоль YES, если введенное
        целое число является положительным и четным, иначе NO.

        Ввод:
        12
        Вывод:
        YES


        Ввод:
        -5
        Вывод:
        NO
         */


        /*
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num % 2 ==0 && num >= 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        */






        /*
        Вопрос 12:
        Напишите программу, где c консоли вводятся три целых числа.
        Найдите наименьшее число из них и выведете в консоль.

        Ввод:
        15
        44
        -12
        Вывод:
        -12


        Ввод:
        19
        37
        201
        Вывод:
        19
         */

        /*
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        if (x <= y && x <= z){
            System.out.println(x);
        } else if (y <= x && y <= z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }

         */









        /*
        Вопрос 13:
        Напишите программу, которая будет принимать целое число с консоли.
        Далее программа должна проверить, если число меньше 100 или больше 200,
        то выводить YES, иначе NO.

        Ввод:
        17
        Вывод:
        YES

        Ввод:
        121
        Вывод:
        NO
         */

       /*
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num <= 100 || num >= 200){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        */








        /*
        Вопрос 14:
        Создайте программу, которая принимает с консоли целое число.
        Затем программа должна проверить и вывести YES если значение делится
        на 3 или 5 без остатка, иначе NO.

        Ввод:
        15
        Вывод:
        YES


        Ввод:
        121
        Вывод:
        NO
         */

        /*
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x % 3 == 0 || x % 5 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

         */







        /*
        Вопрос 15:
        Напишите программу, которая принимает с консоли два целых числовых
        значения и выводит YES если их разница равна или больше 100 и выводит
        NO, если не проходит по условию.

        Ввод:
        15
        -200
        Вывод:
        YES


        Ввод:
        121
        202
        Вывод:
        NO
         */

        /*
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        if (x - y >= 100){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

         */
    }
}
