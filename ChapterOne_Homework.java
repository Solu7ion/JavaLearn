import java.util.Scanner;

public class ChapterOne_Homework {
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
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = 3*(x*x) - 6 * x - 7;
        System.out.println(y);
    }
}
