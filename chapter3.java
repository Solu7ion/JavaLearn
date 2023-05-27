public class chapter3 {
    public static void main(String[] args){
        /*
        Вопрос 1:
        Используя цикл while выведите на экран текст "Hello, BITLAB" 10
        (десять) раз.

        Вывод:
        Hello, BITLAB
        Hello, BITLAB
        Hello, BITLAB
        Hello, BITLAB
        Hello, BITLAB
        Hello, BITLAB
        Hello, BITLAB
        Hello, BITLAB
        Hello, BITLAB
        Hello, BITLAB
         */

        /*
        int x = 0;
        while(x<10){
            System.out.println("Hello, BITLAB");
            x++;
        }
         */







        /*
        Вопрос 2:
        Напишите программу которая будет принимать с консоли целостное число
         (int n) и выведет это число 10 (десять) раз.

        *Подсказка: Для вывода чисел на одной строке можно использовать
        System.out.print() вместо System.out.println()

        Ввод:
        5
        Вывод:
        5 5 5 5 5 5 5 5 5 5

        Ввод:
        9
        Вывод:
        9 9 9 9 9 9 9 9 9 9
         */

        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < 10; i++){
            System.out.print(n + " ");
        }

         */









        /*
        Вопрос 3:
        Программа должна запрашивать с консоли любой текст (String S) и число
        (int n) и выводить на экране это слово n раз.

        Ввод:
        Bitlab
        5
        Вывод:
        Bitlab
        Bitlab
        Bitlab
        Bitlab
        Bitlab



        Ввод:
        Academy
        8
        Вывод:
        Academy
        Academy
        Academy
        Academy
        Academy
        Academy
        Academy
        Academy
         */

        /*
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int n = in.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println(S);
        }

         */








        /*
        Вопрос 4:
        Напишите программу которая запрашивает с консоли целостное число
        (int n) и выводит на экран все числа от 1 до n (введенное число).

        *Подсказка: Для вывода чисел на одной строке можно использовать
        System.out.print() вместо System.out.println()

        Ввод:
        5
        Вывод:
        1 2 3 4 5

        Ввод:
        10
        Вывод:
        1 2 3 4 5 6 7 8 9 10
         */

        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i < n+1; i++){
            System.out.print(i + " ");
        }

         */









        /*
        Вопрос 5:
        Напишите программу которая запрашивает с консоли два целых чисел
        (int n и int m) и выводит на экран все числа от n до m.

        *Подсказка: Для вывода чисел на одной строке можно использовать
        System.out.print() вместо System.out.println()

        Ввод:
        5 10
        Вывод:
        5 6 7 8 9 10

        Ввод:
        2 9
        Вывод:
        2 3 4 5 6 7 8 9
         */

        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = n; i < m+1; i++){
            System.out.print(i + " ");
        }

         */









        /*
        Вопрос 6:
        Программа запрашивает целое число (int n) и выводит на экран все
        ЧЕТНЫЕ числа от 0 до n. (Четные – числа которые делятся на 2
        без остатка).

        *Подсказка: Можете использовать if для проверки чисел

        Ввод:
        6
        Вывод:
        0 2 4 6



        Ввод:
        10
        Вывод:
        0 2 4 6 8 10
         */

        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n+1; i+=2){
            System.out.print(i + " ");
        }
                 */









        /*
        Вопрос 7:
        Программа запрашивает целое число (int n) и выводит на экран все
        НЕЧЕТНЫЕ числа от 1 до n. (Нечетные – числа которые делятся на 2 с
        остатком равной 1).

        *Подсказка: Можете использовать if для проверки чисел

        Ввод:
        5
        Вывод:
        1 3 5

        Ввод:
        11
        Вывод:
        1 3 5 7 9 11
         */

        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i < n+1; i+=2){
            System.out.print(i + " ");
        }

         */


















        /*
        Вопрос 8:
        Напишите программу которая запрашивает с консоли два целых числа
        (int n и int m) и выводит на экран все ЧЕТНЫЕ числа от n до m.

        Ввод:
        2 10
        Вывод:
        2 4 6 8 10



        Ввод:
        5 16
        Вывод:
        6 8 10 12 14 16
         */


        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        while (n <= m){
            if (n %2==0){
                System.out.print(n + " ");
            }
            n++;
        }

        for (int i = n; i <= m; i++){
            if (i%2==0){
                System.out.print(i + " ");
            }
        }

         */










        /*
        Вопрос 9:
         Напишите программу которая запрашивает с консоли два целых числа
         (int n и int m) и выводит на экран все НЕЧЕТНЫЕ числа от n до m.

        Ввод:
        3 11
        Вывод:
        3 5 7 9 11



        Ввод:
        10 23
        Вывод:
        11 13 15 17 19 21 23
         */

        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        while (n <= m){
            if (n %2!=0){
                System.out.print(n + " ");
            }
            n++;
        }

         */












        /*
        Вопрос 10:
        Напишите программу которая запрашивает с консоли два целых числа
        (int n и int m) и выводит на экран все числа от n до m которые
        делятся на 3 без остатка.

        Ввод:
        3 11
        Вывод:
        3 6 9



        Ввод:
        10 23
        Вывод:
        12 15 18 21
         */

        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        while (n <=m){
            if (n%3==0){
                System.out.print(n + " ");
            }
            n++;
        }

         */















        /*
        Вопрос 11:
        Программа должна запрашивать целое число (int n) и показать все
        делители этого числа включая 1 и само число n (Делитель – числа
        которые делятся на данное число без остатка).

        Ввод:
        6
        Вывод:
        1 2 3 6



        Ввод:
        10
        Вывод:
        1 2 5 10
         */

        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++){
            if (n%i==0) {
                System.out.print(i + " ");
            }
        }

         */

















        /*
        Вопрос 12:
        Введите в программу целое число (int N). Программа должна вывести
        все числа от 1 до N и их квадраты.

        Ввод:
        3
        Вывод:
        1 1
        2 4
        3 9



        Ввод:
        5
        Вывод:
        1 1
        2 4
        3 9
        4 16
        5 25
         */

        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println(i + " " + i*i);
        }

         */
















        /*
        Вопрос 13:
        Напишите программу которая принимает целое число int n и выводит
        сумму всех чисел от 1 до n. Результат = 1 + 2 + 3 + 4 + 5 + … + n

        *Подсказка: создайте дополнительную переменную int sum=0 к которой вы
        будете прибавлять числа на каждом кругу цикла

        Ввод:
        3
        Вывод:
        6



        Ввод:
        5
        Вывод:
        15
         */

        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++){
            sum += i;
        }

        System.out.print(sum);

         */














        /*
        Вопрос 14:
        Напишите программу которая принимает два целых числа int n и int m
        и выводит сумму всех чисел от n до m.

        *Подсказка: создайте дополнительную переменную int sum=0 к которой вы будете прибавлять числа на каждом кругу цикла

        Ввод:
        3 6
        Вывод:
        18

        Ввод:
        1 5
        Вывод:
        15
         */

        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;

        for (int i = n; i <= m; i++){
            sum += i;
        }
        System.out.print(sum);

         */







        


        /*
        Вопрос 15:
        Напишите программу которая принимает два целых числа int n и int m
        и выводит сумму всех ЧЕТНЫХ чисел от n до m.

        Ввод:
        1 3
        Вывод:
        2



        Ввод:
        5 10
        Вывод:
        24
         */

        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;

        for (int i = n; i <= m; i++){
            if (i%2 == 0) {
                sum += i;
            }
        }
        System.out.print(sum);

         */

    }
}
