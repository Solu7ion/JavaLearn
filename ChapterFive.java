import java.util.Scanner;

public class ChapterFive {
    public static void main(String[] args){
        /*
        Вопрос 1:
        Напишите программу в котором я ввожу два числа N и M. Затем создаю
        двумерный массив NxM. Далее мы заполняем этот массив числами. После
        заполнения программа запрашивает число K и показывает элементы только
        этой строки.
        Ввод:
        2 3
        1 6 10
        2 5 9
        1
        Вывод:
        2 5 9

        Ввод:
        3 3
        1 2 3
        2 7 4
        3 4 6
        2
        Вывод:
        3 4 6
         */

        /*
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int M = in.nextInt();
        int[][] arr = new int[rows][M];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < M; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int showRow = in.nextInt();
        for (int i = showRow; i <= showRow; i++){
            for (int j = 0; j < M; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

         */








        /*
        Вопрос 2:
        Напишите программу в котором я ввожу два числа N и M. Затем создаю
        двумерный массив NxM. Далее мы заполняем этот массив числами. После
        заполнения программа должна показать элементы строк индексы которых четные.
        Ввод:
        4 5
        2 -4 -5 6 7
        0 1 -2 9 11
        -1 -1 8 3 0
        3 4 5 6 7
        Вывод:
        2 -4 -5 6 7
        -1 -1 8 3 0
        Ввод:
        6 3
        4 8 1
        0 5 6
        3 8 7
        1 8 3
        6 7 8
        5 4 3
        Вывод:
        4 8 1
        3 8 7
        6 7 8
         */

        /*
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int M = in.nextInt();
        int[][] arr = new int[rows][M];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < rows; i++){
            if(i%2 == 0){
                for (int j = 0; j < M; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }


         */




        /*
        Вопрос 3:
        Программа запрашивает два числа N и М, затем создает двумерный массив
        размером NxM. Пользователь заполняет массив значениями, после чего
        программа должна показать только четные элементы массива.
        Ввод:
        2 3
        4 5 6 7 8 9
        Вывод:
        4 6
        8
        Ввод:
        4 5
        7 3 4 9 10
        16 7 8 2 0
        9 1 4 12 3
        -2 6 7 1 2
        Вывод:
        4 10
        16 8 2 0
        4 12
        -2 6 2
         */




        /*
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int M = in.nextInt();
        int[][] arr = new int[rows][M];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < M; j++){
                arr[i][j] = in.nextInt();
            }
        }


        for (int i = 0; i < rows; i++){
            for (int j = 0; j < M; j++){
                if (arr[i][j]%2 == 0){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

         */








        /*
        Вопрос 4:
        Программа должна напечатать индексы отрицательных чисел двумерного
        массива размеров NxM.
        Ввод:
        2 3
        -5 0 3
        -1 -2 4
        Вывод:
        0 0
        1 0
        1 1
         */

        /*
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int M = in.nextInt();
        int[][] arr = new int[rows][M];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < M; j++){
                arr[i][j] = in.nextInt();
            }
        }


        for (int i = 0; i < rows; i++){
            for (int j = 0; j < M; j++){
                if (arr[i][j] < 0){
                    System.out.print(i + " " + j);
                    System.out.println();
                }
            }
        }

         */





        /*
        Вопрос 5:
        Выведите сумму элементов каждой строки двумерного массива размером NxM.
        Размер и значения задаются с консоли.
        Ввод:
        2 3
        6 2 7
        4 11 9
        Вывод:
        15
        24
         */

       /*
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int M = in.nextInt();
        int[][] arr = new int[rows][M];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < rows; i++){
            int sum =0;
            for (int j = 0; j < M; j++){
                sum += arr[i][j];
            }
            System.out.println(sum);
        }

        */





        /*
        Вопрос 6:
        Напишите программу которая находит и выводит максимальное значение в
        двумерном массиве, а также выводит его индекс.
        Ввод:
        2 3
        6 2 7
        4 11 9
        Вывод:
        11
        1 1
         */


        /*
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int M = in.nextInt();
        int[][] arr = new int[rows][M];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < M; j++){
                arr[i][j] = in.nextInt();
            }
        }


        int max = arr[0][0];
        int min = arr[0][0];
        int iIndex = 0, jIndex = 0;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < M; j++){
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    iIndex = i;
                    jIndex = j;
                }

            }
        }

        System.out.println(max);
        System.out.print(iIndex + " " + jIndex);

         */





        /*
        Вопрос 7:
        Ваша программа должна находить в двумерном массиве минимальный и
        максимальный элементы, затем поменять их местами в массиве.
        Ввод:
        2 3
        6 2 7
        4 11 9
        Вывод:
        6 11 7
        4 2 9
         */




        /*
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int M = in.nextInt();
        int[][] arr = new int[rows][M];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int max = arr[0][0];
        int min = arr[0][0];

        int iMaxIndex = 0, jMaxIndex = 0;
        int iMinIndex = 0, jMinIndex = 0;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < M; j++){
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    iMaxIndex = i;
                    jMaxIndex = j;
                }
                if (arr[i][j] < min){
                    min = arr[i][j];
                    iMinIndex = i;
                    jMinIndex = j;
                }
            }
        }

        arr[iMinIndex][jMinIndex] = max;
        arr[iMaxIndex][jMaxIndex] = min;


        for (int i = 0; i < rows; i++){
            for (int j = 0; j < M; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        */
























    }
}
