public class MyClass {
     public static void main(String[] args) {
   System.out.println("Даны два числа. Определить цифры входящие как первого так второго.");
       
        int a = 323;
        int b = 542;
        int[] arr = new int[10];
        int i = 0;
        while(a > 0 & b> 0 ){
            arr[i] = a % 10;
            a = a / 10;
             i++;
            arr[i] = b % 10;
            b = b / 10;
             i++;
        }  
        for(int j = 0; j < arr.length; j++){
            System.out.print(" " + arr[j]);
        }
        
    }
}
