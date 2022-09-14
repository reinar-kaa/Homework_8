public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }

    private static void task4() {
    //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
    //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
    //Распечатайте результат преобразования в консоль.
    //    - Критерии оценки
    //    - Все нечетные числа в целочисленном массиве четные с помоущью прибавления 1
    //    - В консоли распечатан только целочисленный массив

        int[] num = new int [] {1, 2, 3};
        for (int i = 0; i < num.length; i++) {
            if (num [i] % 2 != 0){
                System.out.print(num [i] + 1 + ", ");
            }else {
                System.out.print(num [i] + ", ");
            }
        }
        System.out.println();

    }

    private static void task3() {
    //Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива,
    // а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются
    // на одной строчке, а элементы другого массива – на другой.

        int[] num = new int [] {1, 2, 3};
        for (int i = num.length - 1; i >=0 ; i--) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
        double[] numbers = {1.57, 7.654, 9.986};
        for (int i = numbers.length - 1; i >=0 ; i--) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
        char[] symbols;
        symbols = new char[]{7729, 1904, 553, 12};
        for (int i = symbols.length - 1; i >=0 ; i--) {
            System.out.print(symbols[i] + ", ");
        }
        System.out.println();
    }

    private static void task2() {
    //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
    // начиная с первого элемента, через запятую. Запятая между последним элементом одного массива
    // и первым элементом следующего не нужна.

        int[] num = new int [] {1, 2, 3};
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
        double[] numbers = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
        char[] symbols;
        symbols = new char[]{7729, 1904, 553, 12};
        for (int i = 0; i < symbols.length; i++) {
            System.out.print(symbols[i] + ", ");
        }
        System.out.println();
    }

    private static void task1() {
        int[] num = new int [] {1, 2, 3};
        double[] numbers = {1.57, 7.654, 9.986};
        char[] symbols;
        symbols = new char[]{7729, 1904, 553, 12};
        System.out.println();
    }

}