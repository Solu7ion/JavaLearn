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















        /*
        Вопрос 8:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Выведите в конце
        элементы массива, которые больше среднего арифметического.
        Ввод:
        8
        4 9 2 5 8 7 11 16
        Вывод:
        9 8 11 16
         */

        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int sum = 0;
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > sum/size){
                System.out.print(arr[i] + " ");
            }
        }

         */















        /*
        Вопрос 9:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Программа должна
        вывести умножение элементов не равных нулю.
        Ввод:
        6
        0 2 4 0 3 1
        Вывод:
        24
         */


        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int sum = 1;
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
            if (arr[i] != 0) {
                sum *= arr[i];
            }
        }
        System.out.print(sum);

         */











        /*
        Вопрос 10:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Затем программа
        запрашивает число k. Вывести все числа в массиве, которые
        делятся на k без остатка.
        Ввод:
        8
        3 8 2 4 6 9 12 15
        3
        Вывод:
        3 6 9 12 15
         */

        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();

        for (int i = 0; i < arr.length; i++){
            if (arr[i]%k == 0){
                System.out.print(arr[i] + " ");
            }
        }

         */







        /*
        Вопрос 11:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Программа должна
        вывести умножение элементов не равных 0 и c четным индексом.
        Ввод:
        4
        9 2 4 0
        Вывод:
        36
         */

        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int sum = 1;
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
            if (arr[i] != 0 && i%2 == 0) sum *= arr[i];
        }

        System.out.print(sum);

         */






        /*
        Вопрос 12:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Выведите в конце
        максимальный элемент массива.

        Ввод:
        4
        4 9 2 5
        Вывод:
        9
         */

        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);

         */















        /*

        Вопрос 13:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Выведите в конце
        минимальный элемент умноженное на самого себя.
        Ввод:
        8
        4 9 2 5 8 7 11 16
        Вывод:
        4
         */


        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min * min);

         */








        /*
        Вопрос 14:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Выведите в конце
        максимальный элемент и его индекс.
        Ввод:
        8
        -4 9 2 16 -5 8 7 -11
        Вывод:
        16 3
         */


        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max + " " + index);
         */













        /*
        Вопрос 15:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Программа должна
        вывести максимальное и минимальное значение в массиве.
        Ввод:
        4
        4 9 2 5
        Вывод:
        2 9
         */

        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println(min + " " + max);

         */









        /*
        Вопрос 16:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Программа должна
        вывести сумму и среднее значение исключая максимальное и
        минимальное значение.
        Ввод:
        10
        6 19 26 9 46 8 5 65 90 25
        Вывод:
        204
        25.5
         */


        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if (arr[i]>max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println(sum - min - max);
        System.out.println((double) (sum - min - max) / (size - 2));


         */








        /*
        Вопрос 17:
        Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все
        введенные числа в массив. Далее, программа запрашивает пользователя число m.
        Если число m существует в нашем массиве, программа должна вывести слово
        "YES" и вывести индекс (расположение, адрес) данного числа. Иначе вывести
        слово "NO".

        Ввод:
        3
        4 9 2
        8
        Вывод:
        NO

        Ввод:
        10
        6 19 26 3 46 8 5 65 90 25
        46
        Вывод:
        YES
        4
         */


        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        int search = in.nextInt();
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == search) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println(flag + " " + index);
        } else {
            System.out.println(flag);
        }

         */









        /*
        Вопрос 18:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Затем мы вводим число m.
        Программа должна вывести среднее значение всех элементов,
        которые больше m.
        Ввод:
        4
        0 -2 4 0
        1
        Вывод:
        4.0

        Ввод:
        10
        6 19 0 -3 4 8 0 -6 9 5
        5
        Вывод:
        10.5
         */

        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();

        }
        int m = in.nextInt();
        int sum = 0, count = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > m ){
                sum += arr[i];
                count++;
            }
        }
        System.out.println((double) sum / count);

       
         */








        /*
        Вопрос 19:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Выведите в конце
        все элементы в обратном порядке.

        Ввод:
        10
        6 19 26 -3 46 8 5 -65 90 25
        Вывод:
        25 90 -65 5 8 46 -3 26 19 6
                 */

        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        for (int i = arr.length - 1 ; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }

         */









        /*
        Вопрос 20:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Программа должна
        заменить местами максимальный и минимальный элементы.
        Ввод:
        3
        4 9 2
        Вывод:
        4 2 9

        Ввод:
        10
        1 2 3 4 5 6 7 8 9 10
        Вывод:
        10 2 3 4 5 6 7 8 9 1
         */


        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        int min = arr[0], minIndex = 0;
        int max = arr[0], maxIndex = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        arr[maxIndex] = min;
        arr[minIndex] = max;

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

         */









        /*
        Вопрос 21:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Создайте второй массив
        из четных элементов первого массива.
        Ввод:
        8
        4 9 2 5 8 7 11 16
        Вывод:
        4 2 8 16
         */

        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        int countSize = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
            if (arr[i]%2 == 0) countSize++;
        }

        int arr2[] = new int[countSize];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]%2 == 0){
                arr2[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

         */







        /*
        Вопрос 22:
        Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Программа должна вывести сумму всех чисел которые находятся между нулями.
        Ввод:
        4
        0 -2 4 0
        Вывод:
        2

        Ввод:
        10
        6 19 0 -3 4 8 0 -6 9 5
        Вывод:
        9
         */

        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        int indexZero[] = new int[2], index = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
            if (arr[i] == 0){
                indexZero[index] = i;
                index++;
            }
        }
        for (int i = indexZero[0]+1; i < indexZero[1]; i++){
            sum += arr[i];
        }
        System.out.print(sum);
         */







        /*
        Вопрос 23:
        Программа запрашивает число n. Далее, мы вводим n чисел и
        сохраняем все введенные числа в массив. Программа должна
        проверить чередуются ли в нем положительные и отрицательные
        числа. Если чередуются, то вывести YES, иначе NO.
        Ввод:
        6
        8 -2 4 6 9 12
        Вывод:
        NO
        Ввод:
        6
        4 -2 7 -5 13 -16
        Вывод:
        YES
         */

        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        boolean flag = true;
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }


        for (int i = 0; i < arr.length-1; i++){
            if(arr[i] * arr[i+1] >= 0){
                flag = false;

            } else flag = true;
        }
        if (flag == true) System.out.print("YES");
        else System.out.print("NO");
         */
    }

}
