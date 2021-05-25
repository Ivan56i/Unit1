 public static void main(String args[]) {     
 System.out.println("Найти сумму квадратов первых ста чисел.");
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }

        System.out.println("Сумма квадратов чисел от 1 до 100 равна " + sum);
        }
