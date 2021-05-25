public static void main(String args[]) {
  System.out.println("Вычислить значение функции:");
          double y = 0 , x = 2;
        
          if (x <= 3) {
                 y = Math.pow(x, 2) - 3 * x + 9 ; 
          }
            else{
                 y = 1 / (Math.pow(x, 3) + 6)  ;
            }
       System.out.println("Значение функии при:" + x + " равно " + y );
   }
