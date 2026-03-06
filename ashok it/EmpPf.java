import java.io.*;
class EmpPf{
 
   public static void main(String...args)throws Exception{

   InputStreamReader isr = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);

   System.out.println("enter basic salary");
   String str = br.readLine();
   
   double basicSalary = Double.parseDouble(str);
    
   //double pf = basicSalary*12/100;
   double pf = basicSalary*10/100;
   System.out.println(pf);
   
   
   
  }
}