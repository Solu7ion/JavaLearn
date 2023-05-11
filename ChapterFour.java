import java.util.Scanner;

public class ChapterFour {
    public static void main(String[] args){
        /*
        Вопрос 1:
        Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.

        Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
         */
        /*
        int n = 10;
        double arr[] = new double[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Math.random();
        }

        double max = arr[0];
        double min = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(" "+ max);
        System.out.println(min);

         */

        /*
        Вопрос 1:
        Создайте массив из целых чисел и с помощью цикла выведите все
        элементы.

        Ввод:
        5
        1 2 3 4 5
        Вывод:
        1
        2
        3
        4
        5
         */

        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

         */







        /*
        Вопрос 2:
        Создайте массив из целых чисел и с помощью цикла выведите все
        элементы вместе с индексами.

        Ввод:
        5
        1 2 3 4 5
        Вывод:
        0 - 1
        1 - 2
        2 - 3
        3 - 4
        4 - 5
         */

        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(i + " - " + arr[i]);
        }

         */




        /*
        Вопрос 3:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Выведите в конце
        только положительные элементы.
        Ввод:
        10
        6 19 26 -3 46 8 5 -65 90 25
        Вывод:
        6 19 26 46 8 5 90 25
         */

        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0) System.out.print(arr[i]);
        }

         */





        /*
        Вопрос 4:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Вывести все содержащиеся
        в данном массиве четные числа.

        Ввод:
        8
        3 8 2 4 6 9 12 15
        Вывод:
        8 2 4 6 12
         */

        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i]%2 == 0) System.out.print(arr[i] + " ");
        }

         */






        /*
        Вопрос 5:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Выведите в конце
        количество положительных элементов.

        Ввод:
        8
        -4 9 2 16 -5 8 7 -11
        Вывод:
        5
         */

        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0) count++;
        }
        System.out.println(count);

         */





        /*
        Вопрос 6:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Программа должна
        вывести сумму и среднее значение введенных чисел.

        Ввод:
        3
        4 9 2
        Вывод:
        15 5.0
         */

        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        double average = sum / size;

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
            sum += arr[i];

        }

        System.out.print(sum + " " + (double)sum/size);

         */





        /*
        Вопрос 7:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Программа должна
        вывести среднее арифметическое всех четных элементов массива.
        (Число 0 тоже четный элемент)
        Ввод:
        8
        3 4 2 2 6 9 1 8
        Вывод:
        4.4
         */


        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        int count = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();

        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i]%2 == 0) {
                sum += arr[i];
                count++;
            }
        }
        System.out.println((double) sum / count );
        
         */































    }

}
