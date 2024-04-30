package calculadoraSimple;

import java.util.Scanner;

public class CalculadoraSimple {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int primerNumero = sc.nextInt();
        sc.nextLine();
       
        System.out.print("Ingresa un segundo número: ");
        int segundoNumero = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Ingrese el operador (+,-, *,/): ");
        char operador = sc.next().charAt(0);
        sc.nextLine();
        
        double resultado = 0;
        
        switch (operador) {
            case '+':
                resultado = primerNumero + segundoNumero;
                System.out.println("resultado: " + resultado); 
                break;
            case '-':
                resultado = primerNumero - segundoNumero;
                System.out.println("resultado: " + resultado); 
                break;
            case '*':
                resultado = primerNumero * segundoNumero;
                System.out.println("resultado: " + resultado); 
                break;
            case '/':
                if (segundoNumero==0) {
                    System.out.println("No es posible dividir por 0");
                }
                else{  
                resultado = primerNumero /segundoNumero;
                System.out.println("resultado: " + resultado); 
                }
                break;
            default:
                System.out.println("Ingrese un operador válido");
                break;
        }
        sc.close();
        
        
       
        
    }
}