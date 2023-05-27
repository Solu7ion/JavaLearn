public class chapter1_homeWork {
    public static void main(String[] args){
        /*
        Вопрос 1:
        Напишите программу, в которой я запрашиваю имя, фамилию, возраст,
        страну, и в конце программа выводит данные пользователя в консоль.

        Ввод:
        Alibek
        Maratov
        19
        Kazakhstan

        Вывод:
        Name: Alibek
        Surname: Maratov
        Age: 19
        Country: Kazakhstan
         */

        /*
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.next();

        System.out.println("Введите фамилию: ");
        String surname = in.next();

        System.out.println("Введите возрост: ");
        String age = in.next();

        System.out.println("Введите старану: ");
        String country = in.next();

        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);

         */






        /*
        Вопрос 2:
        Напишите программу, в которой я ввожу число, выведите в консоли
        квадрат и куб этого числа.

        Ввод:
        2
        Вывод:
        4
        8

        Ввод:
        6
        Вывод:
        36
        216
         */

        /*
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println(number * number);
        System.out.println(number * number * number);

         */





        /*
        Вопрос 3:
        Напишите программу, в которой я ввожу диаметр окружности d.
        Найти ее длину L = π·d. В качестве значения π использовать 3.14.

        Ввод:
        10
        Вывод:
        31.4

        Ввод:
        8
        Вывод:
        25.12
         */


        /*
        double p = 3.14;
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        System.out.println(p * d);

         */





        /*
        Вопрос 4:
        Напишите программу в которой я ввожу целое число x.
        Найти значение y = 4(x - 3) - 7(x - 3) + 2 при данном значении x.

        Ввод:
        4
        Вывод:
        -1

        Ввод:
        -4
        Вывод:
        23
         */

        /*
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = 4 * (x - 3) - 7 * (x - 3) + 2;
        System.out.println(y);

         */




        /*
        Вопрос 5:
        Напишите программу в которой я ввожу целое число x.
        Найти значение y = 3x^2 - 6x - 7 при данном значении x.

        Ввод:
        2
        Вывод:
        -7

        Ввод:
        5
        Вывод:
        38
         */



        /*
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = 3*(x*x) - 6 * x - 7;
        System.out.println(y);

         */



        /*
        Вопрос 6:
        Создайте программу, которая высчитывает результат математической
        формулы x^3 + 5xy - 6zy + z^3 и выведете результат в консоль как
        на примере ниже. Данные по переменным: x, y, z, будут вводиться
        через консоль.

        Ввод:
        1 2 3
        Вывод:
        2


        Ввод:
        3 3 8
        Вывод:
        440
         */

        /*
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int result = (x*x*x) + 5*x*y - 6*z*y + (z*z*z);
        System.out.println(result);

         */




        /*
        Вопрос 7:
        Напишите программу, которая принимает в консоли длину ребер a, b, c
        прямоугольного параллелепипеда. Программа должна найти объем и площадь
        поверхности прямоугольного параллелепипеда и вывести результат в
        консоль через пробел, на одной строке, как показано в примерах.
        **Подсказка: Формулы объема (V = a·b·c) и площади поверхности
        (S = 2·(a·b + b·c + a·c))

        Ввод:
        2
        2
        2
        Вывод:
        8 24

        Ввод:
        5
        4
        1
        Вывод:
        20 58
         */

        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();


        int V = a * b * c;
        int S = 2*(a * b + b * c + a * c);

        System.out.println(V + " " + S);
        */



        /*
        Вопрос 8:
        Создайте программу, которая рассчитает радиус (R) и площадь (S)
        круга и выводит результат, получив данные длины окружности (L)
        с консоли. В качестве значения π использовать 3.14.
        *Подсказка: L = 2·π·R;  S = π·R

        Ввод:
        14
        Вывод:
        2.229299363057325 7.0

        Ввод:
        20
        Вывод:
        3.184713375796178 10.0
         */

        /*
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();


        double p = 3.14;
        double r = l / (2 * 3.14);
        double s = 3.14 * r;

        System.out.println(r + " " + s);

         */



        /*
        Вопрос 9:
        Пользователь вводит три числа. Увеличьте первое число в два раза,
        второе число уменьшите на 3, третье число возведите в квадрат и
        затем найдите сумму новых трех чисел.

        Ввод:
        2
        4
        6
        Вывод:
        41

        Ввод:
        3
        6
        9
        Вывод:
        90
         */

        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(a * 2 + b - 3 + c * c);

         */


        /*
        Вопрос 10:
        С начала суток прошло N секунд (N - целое). Найти количество
        полных минут, прошедших с начала суток.

        Ввод:
        60
        Вывод:
        1


        Ввод:
        365
        Вывод:
        6
         */

        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n/60);
         */



        /*
        Вопрос 11:
        С начала суток прошло N секунд (N - целое). Найти количество
        секунд, прошедших с начала последней минуты.

        Ввод:
        72
        Вывод:
        12


        Ввод:
        4350
        Вывод:
        30
         */


        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(n % 60);
         */





        /*
        Вопрос 12:
        Дано двузначное число. Вывести вначале его левую цифру (десятки),
        а затем - его правую цифру (единицы). Для нахождения десятков
        использовать операцию деления нацело, для нахождения единиц -
        операцию взятия остатка от деления.

        Ввод:
        41
        Вывод:
        4
        1


        Ввод:
        95
        Вывод:
        9
        5
         */


        /*
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(num/10);
        System.out.println(num%10);

         */








        /*
        Вопрос 13:
        Дано двузначное число. Вывести число, полученное при перестановке
        цифр исходного числа.


        Ввод:
        95
        Вывод:
        59


        Ввод:
        71
        Вывод:
        17
         */

        /*
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(num%10 + "" + num/10);

         */





        /*
        Вопрос 14:
        Помогите бухгалтеру Армана рассчитать премию за продажи товаров.
        Сколько должен выдать бухгалтер, если премия составляет 5% от всей
        суммы продаж, а каждый товар стоит 5000 тенге. В консоль задается
        количество проданных Арманом товаров
        Ввод:
        35
        Вывод:
        8750


        Ввод:
        144
        Вывод:
        36000
         */

        /*
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(((num*5000)*5) / 100);

         */





        /*
        Вопрос 15:
        Дано трехзначное число. Вывести вначале его последнюю цифру
        (единицы), а затем - его среднюю цифру (десятки).

        Ввод:
        351
        Вывод:
        1
        5



        Ввод:
        236
        Вывод:
        6
        3
         */

        /*
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num%10);
        System.out.println((num%100) / 10);
         */

    }
}
