public static void main(String args[]) {
  System.out.println("Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.");
          int a = 3 , b = 8;
          int x = 5, y = 5 , z = 3 ;
        int sum = 0;
          if (x <= a && y <= b || x <= b && y <= a || x <= a && z <= b || x <= b && z <= a ||z <= a && y <= b || z <= b && y <= a) {
                 System.out.println("Пройдет "); 
          }
            else{
                 System.out.println("Не пройдет ");
            }
       
   }
