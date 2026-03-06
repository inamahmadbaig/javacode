import java.io.*;

class Shoes{
 
 public static void main(String...args)throws Exception{

   InputStreamReader isr = new InputStreamReader(System.in);

   BufferedReader br =new BufferedReader(isr);
   
   System.out.println("enter brand name");
   
   String brand = br.readLine();
   
   switch(brand){

     case"nike":System.out.println("just do it");
                break;
     case "adidas":System.out.println("impossible is nothing");
                   break;
     case "puma":System.out.println("forever faster");
                 break;
     case "reebok":System.out.println("i am what i am");
                   break;
     default:System.out.println("brand not found");
      
   } 





  }
}