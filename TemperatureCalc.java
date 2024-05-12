import java.util.*;
 

public class TemperatureCalc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Fahrenheit to Celsius (1) or Celsius to Fahrenheit(2)");
        int result=sc.nextInt();
        if (result==1){
            //convert fahrenheit to celsius
            System.out.println("Fahrenheit to Celsius");
            System.out.println("Enter Fahrenheit value");
            double value=sc.nextDouble();
            double Finalvalue=(value-32)*5/9;
            System.out.println("value in celsius is:");
            System.out.println(Math.round(Finalvalue*10.0)/10.0);



        }
        else if(result==2){
            //convert celsius to fahrenheit
            System.out.println(" Celsius to Fahrenheit");
            System.out.println("Enter value in Celsius");
            double value2=sc.nextDouble();
            double Finalvalue2=(value2*9/5)+32;
            System.out.println("value in Fahrenheit is:");
            System.out.println(Math.round(Finalvalue2*10.0)/10.0);


        }
        else{
            System.out.println("Invalid choice");
        }
    }
}