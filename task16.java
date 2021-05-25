  public static void main(String[] args) {
   System.out.println("19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых " +
                "больше или равен заданному е.");

        double sum = 0.0;
        double e = 2.1;
        double an = 0.0;
        int n = 20;

        for (int i = 0; i <= n; i++) {
            an = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(an) >= e ){
                sum += an;
            }
        }
