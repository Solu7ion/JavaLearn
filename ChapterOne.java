public class ChapterOne {
    public static void main(String[] args){
        /*
        Вопрос 1:
        Напишите программу для вывода на экран строки "Hello, World!".
        */

        //System.out.println("Hello, World!");



        /*
        Вопрос 2:
        Напишите программу для вывода в консоль строки "Hello, World!", но уже 2
        раза как показано в примере ниже.
        */

        /*
        System.out.print("Hello, World! ");
        System.out.print("Hello, World! ");
        */




         /*
        Вопрос 3:
        Напишите программу, которая выводит текста "Hello" и "Bitlab" в
        двух разных строках как показано в примере:
        */

        //System.out.println("Hello, \nWorld!");







         /*
        Вопрос 4:
        Напишите программу в которой вы создаете переменную
        String name = "George Washington" и выведите
        значение переменной на экран c дополнительной информацией как на примере.
        Вывод:
        The first president of USA is George Washington
        */

        /*
        String name = "George Washington";
        System.out.println("The first president of USA is " + name);
        */





         /*
        Вопрос 5:
        Создайте программу, в который будут переменные
        String country="Great Britain" и String capital="London".
        Программа должна выводить многим известную фразу как в примере.

        Вывод:
        London is the capital of Great Britain!
        */

        /*
        String country = "Great Britian";
        String capital = "London";
        System.out.println(capital + " is the capital of " + country + "!");
        */





         /*
        Вопрос 6:
        Создайте программу с переменными:
        String brand = "Apple",
        String product = "IPhone", String model = "13 Pro Max",
        String price = "1500$", которая будет выводить в консоль
        полное описание продукта как в примере ниже.

        Вывод:
        Brand: Apple
        Product: IPhone
        Model: 13 Pro Max
        Price: 1500$
        */

        /*
        String brand = "Apple", product = "Iphone", model = "13 Pro Max", price = "1500$";

        System.out.println("Brand: " + brand);
        System.out.println("Product: " + product);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        */







         /*
        Вопрос 7:
        Создайте переменную int number = 5  и выведите куб данного числа на экран.

        Вывод:
        125
        */

        /*
        int number = 5;
        System.out.println(number * number * number);
        */






         /*
        Вопрос 8:
        В городе Алмате проживает 1 927 700 жителей (almaty = 1927700),
        в Астане 1 228 800 жителей (astana = 1228800). Выведите на экран
        сумму жителей двух городов.

        *Подсказка: Если в консоли выходит ошибка при суммировании,
        задайте в скобках переменные с int типами данных в функции
        System.out.println().

        Вывод:
        Total = 3156500
        */

        /*
        int Almaty =  1927700;
        int Astana = 1228800;
        System.out.println(Almaty + Astana);
         */







        /*
        Вопрос 9:
        Создайте программу, которая рассчитает полную сумму чека, если
        цена блюд заказанные юзером int soup = 850, int salad = 530,
        int tea = 245 и выведет в консоль как в примере.

        Вывод:
        TO PAY:
        Soup - 850
        Salad - 530
        Tea - 245
        - - -
        Total - 1625
         */

        /*
        int soup = 850, salad = 530, tea = 245;
        System.out.println("TO PAY:");
        System.out.println("Soup - " + soup);
        System.out.println("Salad - " + salad);
        System.out.println("Tea - " + tea);
        System.out.println("- - -");
        System.out.println("Total - " + (salad + soup + tea));
         */







        /*
        Вопрос 10:
        Арман получил 80.5 баллов (double examOne = 80.5) на первом
        экзамене и 55.7 (double examTwo = 55.7) баллов на втором.
        Напишите программу которая вычислит средний балл Армана и выведет
        на экран.

        Вывод:
        68.1
         */

        /*
        double examOne = 80.5;
        double examTwo = 55.7;
        System.out.println((examOne + examTwo) / 2);
         */







        /*
        Вопрос 11:
        Расстояние между городами Алматы и Атырау 2703 км
        (int distance = 2703). Создайте программу, которая рассчитает
         сколько км необходимо путешественнику проезжать в день, чтобы
         добраться с Атырау в Алматы за 5 дней. Выведите ответ в консоль.

        Вывод:
        540.6 km per day
         */


        //int distance = 2703;
        //System.out.println(((double)(distance) / 5) + " " + "km per day");







        /*
        Вопрос 12:
        Компания "BITLAB" заработала 14940 долларов на продаже курсов.
        Программа должна вычислить сумму НДС в 12% от заработка.

        Вывод:
        Tax is 1792.8 dollars
         */

        /*
        int  income = 14940;
        double NDC = (income / 100) * 12;
        System.out.println("Tax is " + NDC + " dollars");
         */






        /*
        Вопрос 13:
        Напишите программ в которой вводится название любой страны
        (String country) и название любого города (String city).
        Далее выведите на экран введенные данные как в примере.

        Ввод:
        Kazakhstan
        Astana

        Вывод:
        Country: Kazakhstan
        City: Astana
         */

        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Insert country: " );
        String country = in.next();
        System.out.println("Insert city: " );
        String city = in.next();

        System.out.println("Country: " + country);
        System.out.println("City: " + city);
         */







        /*
        Вопрос 14:
        Напишите программу, которая принимает с консоли значение в рублях и
         выводит в тенге. (Курс: 1 рубль = 6 тенге)

        Ввод:
        1000
        Вывод:
        6000

        Ввод:
        700
        Вывод:
        4200
         */

        /*
        Scanner in = new Scanner(System.in);
        int cash = in.nextInt();
        int convert = cash * 6;
        System.out.println(convert);
         */







        /*
        Вопрос 15:
        Напишите программу, которая принимает данные о компании
        (String companyName, int profit, double month) и выведет в консоль
        наименование компании и средний доход в месяц.

        Ввод:
        P&G
        145900
        8
        Вывод:
        Company P&G earns 18237.5 dollars in a month

        Ввод:
        AirAstana
        142854
        5.8
        Вывод:
        Company AirAstana earns 24630.0 dollars in a month
         */

        /*
        Scanner in = new Scanner(System.in);
        String companyName = in.next();
        int profit = in.nextInt();
        double month = in.nextDouble();


        System.out.println("Company " + companyName + " earns " + profit/month + " dollars in a month");
        */

    }

}