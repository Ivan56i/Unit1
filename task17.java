public class MyClass {
     public static void main(String[] args) {
   System.out.println("26. Вывести на экран соответствий между символами и их численными обозначениями в " +
                "памяти компьютера (Таблицу ASCII).");

        for (int i = 32; i <= 255; i++) {
            System.out.println(i + " " + (char) i);
        }

        System.out.println();
    }
 }
