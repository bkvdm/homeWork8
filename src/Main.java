public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1 Лекция");
        int[] weigths = new int[12];
        weigths[0] = 90;
        int januaryWeight = weigths[0];
        System.out.println(januaryWeight);
        System.out.println(weigths[0]);
        System.out.println(weigths[4]);
        System.out.println(weigths[11]);
        int january = 0;
        System.out.println(weigths[january]);
        int f = 1;
        System.out.println(weigths[f]);
        System.out.println(januaryWeight);
    }

    public static void task2() {
        System.out.println("Задача 2 Лекция");
        int[] weigths = new int[12];
        weigths[0] = 90;
        int januaryWeight = weigths[0];
        System.out.println(januaryWeight);
        System.out.println(weigths[0]);
        System.out.println(weigths[4]);
        System.out.println(weigths[11]);
        int january = 0;
        System.out.println(weigths[january]);
        int february = 0;
        System.out.println(weigths[february]);
        System.out.println(januaryWeight);
        for (int i = 0; i < 12; i++) {
            System.out.println(weigths[i]);
        }

    }

    public static void task3() {
        System.out.println("Задача 3 Лекция");
        int[] weigths = {90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101};
        weigths[0] = 90;
        int januaryWeight = weigths[0];
        System.out.println(januaryWeight);
        System.out.println(weigths[0]);
        System.out.println(weigths[4]);
        System.out.println(weigths[11]);
        int january = 0;
        System.out.println(weigths[january]);
        int february = 0;
        System.out.println(weigths[february]);
        System.out.println(januaryWeight);
        for (int i = 0; i < weigths.length; i++) {
            System.out.println(weigths[i]);
        }
    }
}