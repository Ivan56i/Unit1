public static void main(String[] args) {
System.out.println("Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.");
        double x = 488.112;
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(y);
        
    }
