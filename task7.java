public static void main(String args[]) {
System.out.println("7Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.");
         double  a = 30;
         double  b = 60;
  if (a + b < 180 ) {
        if ( a + b == 90 || a == 90 || b == 90){
       System.out.println("Треугольник прямоугольный");
       }
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }

        System.out.println("Треугольник с углами (" + a + ", " + b + ") существует ");
    }
}
