import java.util.Scanner;

public class ChapterTwo_Homework {
    public static void main(String[] args){
        /*
        Вопрос 1:
        Даны два целых числа. Выведите значение наибольшего из них.

        Ввод:
        17
        81
        Вывод:
        81

        Ввод:
        872
        976
        Вывод:
        976
         */

        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a >= b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }

         */







        /*
        Вопрос 2:
        Даны два числа. Вывести порядковый номер меньшего из них как показано в
        примерах ниже. (программа должна выводить 1 или 2)

        Ввод:
        1
        9
        Вывод:
        1

        Ввод:
        221
        19
        Вывод:
        2
         */

        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a <= b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }

         */





        /*
        Вопрос 3:
        Напишите программу, которая принимает три целых числа и выводит в
        консоль наибольшее среди них.

        Ввод:
        17
        18
        19
        Вывод:
        19


        Ввод:
        89
        221
        19
        Вывод:
        221
         */

        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a >= b && a >= c){
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

         */







        /*
        Вопрос 4:
        Создайте программу, которая принимает рост в сантиметрах и поможет
        пользователю узнать свой размер. Затем выведет результат как в примерах.
        (S = 159-171, M = 172-177, L = 178-183, XL = 184-189)

        Ввод:
        189
        Вывод:
        XL



        Ввод:
        176
        Вывод:
        M
         */

        /*
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();

        if (159 <= height && height <= 171) {
            System.out.println("S");
        } else if (172 <= height && height <= 177){
            System.out.println("M");
        } else if (178 <= height && height <= 183){
            System.out.println("L");
        } else if (184 <= height && height <= 189){
            System.out.println("XL");
        } else {
            System.out.println("Error");
        }

         */








        /*
        Вопрос 5:
        Напишите программу, где вводятся три числа с консоли. Если среди них
        есть одинаковые, то программа должна выводить YES, иначе NO.

        Ввод:
        17
        18
        19
        Вывод:
        NO


        Ввод:
        19
        221
        19
        Вывод:
        YES
         */

        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a == b || a == c){
            System.out.println("YES");
        } else if ( b == c || b == a){
            System.out.println("Yes");
        } else {
            System.out.println("no");
        }

         */




        /*
        Вопрос 6:
        Напишите программу где дано натуральное число. Требуется определить,
        является ли год високосным. Если год является високосным, то выведите
        YES, иначе выведите NO. (Напомним, что год является високосным, если
        его номер делится на 4, но не делится на 100, или если он делится на 400.)
        *Примечание: Не ставьте пробелы между %, когда будете сравнивать.
        Например: не надо делать так if(a % b), лучше уберите пробелы - if(a%b)

        Ввод:
        2020
        Вывод:
        YES

        Ввод:
        2007
        Вывод:
        NO
         */

        /*
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        if (year%4 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

         */






        /*
        Вопрос 7:
        Создайте программу, которая выводит разницу максимального и
        минимального значения из трех введенных, разных чисел.

        Ввод:
        212
        912
        445
        Вывод:
        700


        Ввод:
        121
        999
        1030
        Вывод:
        909
         */


        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > b && a > c && b > c){
            System.out.println(a - c);
        } else if (a > b && a > c && c > b){
            System.out.println(a - b);
        } else if (b > a && b > c && a > c){
            System.out.println(b - c);
        } else if (b > a && b > c && a < c) {
            System.out.println(b - a);
        } else if (c > a && c > b && a > b){
            System.out.println(c - b);
        } else if (c > a && c > b && a < b){
            System.out.println(c - a);
        }

         */






        /*
        Вопрос 8:
        Вводится четыре целых числа. Найдите наибольшее число среди них.
        Если наибольшее число нечетное, выведите NO RESULT, иначе выведите
        само число.

        Ввод:
        12
        37
        200
        45
        Вывод:
        200


        Ввод:
        92
        37
        202
        453
        Вывод:
        NO RESULT
         */

        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if (a > b && a > c && a > d && a%2 == 0) {
            System.out.println(a);
        } else if (b > a && b > c && b > d && b%2 == 0) {
            System.out.println(b);
        } else if (c > b && c > a && c > d && c%2 == 0) {
            System.out.println(c);
        } else if (d > b && d > c && d > a && d%2 == 0) {
            System.out.println(d);
        } else System.out.println("NO RESULT");
         */





        /*
        Вопрос 9:
        Напишите программу, где вводится первые 4 цифры мобильного номера
        (начиная с 8-ки), определить является ли номер казахстанского
        оператора (701, 777, 705, 707, 700). Выводить YES, если номер
        казахстанский, иначе NO.

        Ввод:
        8707
        Вывод:
        YES


        Ввод:
        8987
        Вывод:
        NO
         */

        /*
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num == 8701 || num == 8777 || num == 8707 || num == 8700){
            System.out.println("YES");
        } else System.out.println("NO");

         */





        /*
        Вопрос 10:
        Создайте программу, которая принимает три двухзначных, разных
        числа c консоли. Программа должна выводить сумму цифр наибольшего
        и наименьшего числа.

        Ввод:
        92
        74
        21
        Вывод:
        14


        Ввод:
        12
        13
        25
        Вывод:
        10
         */

        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        int min = a;

        if (b > max) max = b;
        if (c > max) max = c;

        if (b < min) min = b;
        if (c < min) min = c;

        System.out.println((max / 10) + (max % 10) + (min / 10) + (min % 10));
         */


        /*
        Вопрос 11:
        Даны четыре целых числа, одно из которых отлично от трех других,
        равных между собой. Определить порядковый номер числа, отличного
        от остальных и выведете результат как показано в примерах.

        Ввод:
        92
        92
        21
        92
        Вывод:
        3

        Ввод:
        12
        25
        25
        25
        Вывод:
        1
         */

        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int first = a;

        if (a == b && a == c) System.out.println("4");
        else if (a == c && a == d) System.out.println("2");
        else if (a == b && a == d) System.out.println("3");
        else if (b == c && b == d) System.out.println(1);

         */




        /*
        Вопрос 12:
        В консоль вводятся три числа. Найдите среднее из них (не наименьшее и
        не наибольшее) и введите в консоль.

        Ввод:
        41
        57
        2
        Вывод:
        41


        Ввод:
        121
        9
        3
        Вывод:
        9
         */

        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > b && b > c) System.out.println(b);
        else if (b > a && a > c) System.out.println(a);
        else System.out.println(c);

         */







        /*
        Вопрос 13:
        Требуется определить, бьет ли ладья, стоящая на клетке с указанными
        координатами (номер строки и номер столбца), фигуру, стоящую на
        другой указанной клетке. Вводятся четыре числа: координаты ладьи
        (два числа) и координаты другой фигуры (два числа), каждое число
        вводится в отдельной строке. Координаты - целые числа в интервале
        от 1 до 8. Требуется вывести слово YES, если ладья сможет побить
        фигуру за 1 ход и NO - в противном случае. Ладья ходит по прямым
        линиям (горизонтальным и вертикальным)

        Ввод:
        1
        1
        2
        2
        Вывод:
        YES


        Ввод:
        1
        1
        2
        1
        Вывод:
        NO
         */


     // Задание непонятно


        /*
        Вопрос 14:
        Дан номер года (положительное целое число). Определить количество
        дней в этом году, учитывая, что обычный год насчитывает 365 дней,
        а високосный - 366 дней. Високосным считается год, делящийся на 4,
        за исключением тех годов, которые делятся на 100 и не делятся на
        400 (например, годы 300, 1300 и 1900 не являются високосными, а 1200
        и 2000 -являются). Если год является високосным, то программа выводит
        YES, иначе выведите NO.

        Ввод:
        2007
        Вывод:
        NO


        Ввод:
        2008
        Вывод:
        YES
         */


        /*
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        if (year%4 == 0){
            if (year%100 ==0 && year %400 !=0){
                System.out.println("NO");
            } else System.out.println("YES");
        } else System.out.println("NO");

         */





        /*
        Вопрос 15:
        Даны три переменные вещественного типа: A, B, C. Если их значения
        упорядочены по возрастанию или убыванию, то выводить YES; в
        противном случае выводить NO.

        Ввод:
        2007
        2009
        2019
        Вывод:
        YES


        Ввод:
        678
        942
        23
        Вывод:
        NO
         */

        /*
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        if (A < B && B < C || A > B && B > C){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

         */
    }
}
