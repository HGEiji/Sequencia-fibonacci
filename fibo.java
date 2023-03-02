import java.util.*;

public class fibo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um valo: ");
        int num = sc.nextInt();
        int comeco = 0;
        int progr = 1;

        boolean verific = false;
        
        while (progr <= num){
            if(progr == num){
                verific = true;
                break;
            }
            int soma = comeco + progr;
            comeco = progr;
            progr = soma;
        }
        if (verific){
            System.out.println("O numero "+ num +" foi encontrado na sequencia!");
        }else{
            System.out.println("O numero " + num +" não existe na sequencia...");
        }
    
    }
}