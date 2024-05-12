import java.util.*;

public class Numbergame{
    public static void main(String[] args){
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int randomNum=r.nextInt(100) +1;
        //System.out.println("Random number is"+ randomNum);
        System.out.println("Enter a number between 1 and 100");
        while(true){
        int guess=sc.nextInt();
        if(guess==randomNum){
            System.out.println("Correct guess");
            break;
        }
        else if(randomNum>guess){
            System.out.println("The number is higher.Guess again!");
        }
        else{
            System.out.println("The number is lower.Guess again!");
        }
    }


    }
}