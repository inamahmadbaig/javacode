import java.io.*;
class Marriage{
  
  public static void main(String...args)throws Exception{
      
     InputStreamReader isr = new InputStreamReader(System.in);
     BufferedReader br = new BufferedReader(isr);
     System.out.println("enter your age");
     String str1 = br.readLine();
     
     int age = Integer.parseInt( str1 );

     System.out.println("enter your salary");
     String str2 = br.readLine(); 
     
     double salary = Double.parseDouble(str2);
     
     if(age < 30 && salary > 100000){
          System.out.println("you are eligible for marriage");
     }else{
          System.out.println("you are not eligible for marriage");
     }
     
     
 }
}