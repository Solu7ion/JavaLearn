import java.util.Collection;
import java.util.Locale;
import java.util.Scanner;
import java.util.SplittableRandom;


public class chapter6_String {
    public static void main (String [] args){
        /*
        Вопрос 1:
        Напишите программу которая принимает число(В интервале от 0 до 9) в
        текством формате и показывает на экране в виде цифры.
        Ввод
        one
        Вывод
        1
        Ввод
        seven
        Вывод
        7
         */

        /*
        Scanner in = new Scanner(System.in);
        String number = in.next();

        switch (number){
            case ("one"):
                System.out.print("1");
                break;
            case ("two"):
                System.out.print("2");
                break;
            case ("three"):
                System.out.print("3");
                break;
            case ("four"):
                System.out.print("4");
                break;
            case ("five"):
                System.out.print("5");
                break;
            case ("six"):
                System.out.print("6");
                break;
            case ("seven"):
                System.out.print("7");
                break;
            case ("eight"):
                System.out.print("8");
                break;
            case ("nine"):
                System.out.print("9");
                break;
            default: System.out.print("Неверный диапозон");
        }


         */











        /*
        Вопрос 2:
        Напишите программу, которая продублирует все символы введенного текста.
        Ввод
        Bitlab
        Вывод
        BBiittllaabb
         */


        /*
        Scanner in = new Scanner(System.in);
        String str = in.next();
        for (int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i)+ "" + str.charAt(i));
        }

         */




        /*
        Вопрос 3:
        Программа должна принимать текст и букву, затем подсчитать сколько раз буква
        встречается в тексте.
        Ввод
        Bobby
        b
        Вывод
        3
        Ввод
        Avadakedavra
        a
        Вывод
        5
         */

        /*
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String search = in.next();
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == search.charAt(0)){
                count++;
            }
        }
        System.out.println(count);

         */






        /*
        Вопрос 4:
        Напишите программу которая заменяет в тексте все буквы 'a' на букву 'о'.

        Ввод
        Java

        Вывод
        Jovo
         */


        /*
        Scanner in = new Scanner(System.in);
        String str = in.next();
        str = str.replace("a", "o");
        System.out.print(str);

         */




        /*
        Вопрос 5:
        Вводим в программу две строки s1 и s2. Если s2 содержится внутри
        слова s1, то программа выводит "Yes", иначе "No".
        Ввод
        universe
        ivery
        Вывод
        No
        Ввод
        macbookair
        book
        Вывод
        Yes
         */

        /*
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        if(s1.contains(s2)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

         */




        /*
        Вопрос 6:
        Мы вводим строку (текст) в нашу программу. Программа должна вывести
        количество гласных букв. (Гласные буквы: a, e, i, o, u)
        Ввод
        Tesla
        Вывод
        2
         */

        /*
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String glass = "aeiou";
        int count = 0;
        for(int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < glass.length(); j++) {
                if (glass.charAt(j) == s1.charAt(i)) count++;
            }
        }
        System.out.println(count);

         */





        /*
        Вопрос 7:
        Напишите программу которая выводит сумму всех цифр в тексте.
        Ввод
        2Java5Course

        Вывод
        7

        Ввод
        BMW530i

        Вывод
        8
         */


        /*
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        int sum = 0;

        for (int i = 0; i< s1.length(); i++){
            if (Character.isDigit(s1.charAt(i))){
                sum += Character.getNumericValue(s1.charAt(i));
            }
        }
        System.out.println(sum);

         */






        /*
        Вопрос 8:
        Вводим строки s1 и s2 в программу. Программа должна вывести "Yes",
        если s2 является противоположным (в обратном чтении) s1. Иначе "No".

        Ввод
        universe
        ivery
        Вывод
        No
        Ввод
        macbookair
        riakoobcam

        Вывод
        Yes
         */


        /*
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        s1 = new StringBuilder(s1).reverse().toString();
        if (s2.equals(s1)) System.out.println("YES");
        else System.out.println("NO");

         */


        /*
        Вопрос 9:
        Мы вводим строку (текст) в нашу программу. Программа должна определить,
        является ли наш текст "Палиндром"-ом или нет. Палиндром - это когда
        текст читается так же одинаково если ее читать в обратном порядке.
        Ввод
        kazak
        Вывод
        Yes
        Ввод
        Assets

        Вывод
        No
         */

        /*
        Scanner in = new Scanner(System.in);
        String s1 = in.next();

        String reverse = new StringBuilder(s1).reverse().toString();

        if(s1.equals(reverse)) System.out.println("YES");
        else System.out.println("NO");

         */






        /*
        Вопрос 10:
        Программа должна принимать текст из двух символов где первый символ
        цифра, а вторая буква. Поменяйте местами цифру и букву, а также
        умножьте цифру на 2.
        Ввод
        3B
        Вывод
        B6
        Ввод
        5M
        Вывод
        M10
         */

        /*
        Scanner in = new Scanner(System.in);
        String s1 = in.next();

        if (s1.length() == 2 && Character.isDigit(s1.charAt(0))){
            char digit = (char) Character.getNumericValue(s1.charAt(0));
            char letter = s1.charAt(1);
            System.out.println(letter + "" +(digit*2));
        } else System.out.println("Прочитай задание");

         */





        /*
        Вопрос 11:
        Сделайте некое подобие калькулятора который принимает два числа и
        оператор(+, -, * , /) между ними в виде текста. Выведите на экран
        результат операции.
        Ввод
        1 + 5
        Вывод
        6
        Ввод
        5 * 10
        Вывод
        50
         */

        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String operator = in.next();
        int b = in.nextInt();
        int result = 0;
        switch (operator){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }
        System.out.println(result);

         */







        /*
        Вопрос 12:
        Напишите программу, которая преобразует все заглавные символы
        строки в нижний регистр.
        Ввод
        Elon Musk
        Вывод
        eLON mUSK
         */


        Scanner in = new Scanner(System.in);
        String str = in.next();

        for (int i = 0; i < str.length(); i++){
            if(Boolean.parseBoolean(str.toUpperCase())){

            }
        }





















    }
}
