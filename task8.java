  public static void main(String args[]) {
  System.out.println("Найти max{min(a, b), min(c, d)}. ");
         double  a = 7;
         double  b = 2;
         double  c = 9;
         double  d = 2;
         double  min1 = 0;
         double  min2 = 0;
        if ( a < b ){
        min1 = b;
       }
        else{
             min1 = a;
        }
          if ( b < c ){
        min2 = c;
       }
        else{
             min2 = b;
        }
         if ( min1 < min2 ){
       System.out.println ("Максимальное число из: " + a + " , " + b + " , " + c + " , " + d + " максимальное " + min2);
       }
        else{
       System.out.println ("Максимальное число из: " + a + " , " + b + " , " + c + " , " + d + " максимальное " + min1);
        }

    }
