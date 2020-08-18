
package numero.mayor.menor.y.promedio;

import java.util.Scanner;

public class NumeroMayorMenorYPromedio {

  
    public static void main(String[] args) {
       
        Scanner teclado =new Scanner(System.in);
        
        double sumanumeros = 0;
        double promnumeros = 0;
       
        System.out.println("digite la cantidad de numeros que quiere ingresar: ");
        int n = teclado.nextInt();
        double [] contador = new double [n] ;
       
        for (int i=0; i<n;i++)
        {
            contador [i]= teclado.nextDouble();
        }
        double menor, mayor;
        menor = mayor = contador [0];
        for (int j=1; j<n;j++)
        {
            if (contador [j] >mayor)
            {
                mayor = contador [j];
            }
            if (contador [j] <menor)
            {
                menor = contador [j];
            }
        }
        
             for (int i = 0; i < contador.length; i++) {
             sumanumeros = sumanumeros + contador[i];
             promnumeros = sumanumeros/n;
             }
            
            System.out.println("el numero mayor es: "+mayor);
            System.out.println("el numero menor es: "+menor);
            System.out.println("el promedio es: "+promnumeros);
    }
}