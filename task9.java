 public static void main(String args[]) {
 System.out.println(". Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. ");
         double  x1 = 1 , y1 = 1;
         double  x2 = 2 , y2 = 1;
         double  x3 = 1 , y3 = 4;
         double d1 , d2 , d3; 
 d1 = Math.pow(Math.pow((x1-x2),2) + Math.pow((y1-y2),2),1.0/2.0);
 d2 = Math.pow(Math.pow((x1-x3),2) + Math.pow((y1-y3),2),1.0/2.0);
 d3 = Math.pow(Math.pow((x2-x3),2) + Math.pow((y2-y3),2),1.0/2.0);
 if (d1 + d2 == d3 || d1 + d3 == d2 || d2 + d3 == d1 ){
     System.out.println("Лежат "); 
 }
 else{
     System.out.println("Не лежат ");
    }
       
   }
