//Diego Martinez - 11951019
package lab2p1_diegomartinez;

import java.util.Scanner;

public class Lab2P1_DiegoMartinez {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int opcion;
        do{
        System.out.println("1 -> MCD");
        System.out.println("2 -> Sumatoria");
        System.out.println("3 -> Supermercado");
        System.out.println("4 -> Salir");
        System.out.println("Ingrese su opcion: ");
        opcion=read.nextInt();
        
        if(opcion==1){
            System.out.println("Calculacion del Maximo comun divisor");
            System.out.println("Ingrese el primer digito");
            int A = read.nextInt();
            if (A<0){
                System.out.println("Numero negativo no valido, ingrese numero mayor a 0");
                A= read.nextInt();
            }
            
            System.out.println("Ingrese el segundo digito");
            int B = read.nextInt();
            double x,y;
            if (B<0){
                System.out.println("Numero negativo no valido, ingrese numero mayor a 0");
                B= read.nextInt();
            }
            if (A==0 || B==0){
                System.out.println("Los numeros ingresados deben ser positivos");
            }
            else{
            x=A;
            y=B;
            
            while(x!=y){
                if (x>y){
                    x-=y;
                }
                else{
                    y-=x;
                }
            }
                System.out.println("El MCD de "+A+" y "+B+" es: "+ x);
            }
                    }//Opcion 1
        if (opcion==2){
            System.out.println("Calculacion de la sumatoria");
            System.out.println("Ingrese el limite de la sumatoria");
            double k=read.nextInt();
            double sum,c2;
            sum=0;
            c2=1;
            while (c2<=k){           
               sum+=Math.pow((c2/(c2+1)),c2); 
               c2++;
            }
            System.out.println("La sumatoria da: "+sum);
        }//Opcion 2
        
        if (opcion==3){
            System.out.println("Supermercado");
            System.out.println("Ingrese el tipo de cliente (0,1 o 2)");
            double T = read.nextDouble();
            System.out.println("Cual es el precio por unidad del producto");
            double P = read.nextDouble();
            System.out.println("Ingrese la cantidad de productos que lleva: ");
            double C = read.nextDouble();
            
            double subt=0,total=0,desc=0;
            
            if(T==0){
                if (C>10 && C<=19){
                    System.out.println("Usted se lleva 2 productos gratis!");
                    subt=C-2;
                }
                else if (C>20){
                    System.out.println("Usted se lleva 5 productos gratis!");
                    subt=C-5;
                }
                else{
                    subt=C;
                }
                total=subt*P;
                System.out.println("Lastimosamente no tiene descuento");
            }
            else if(T==1){
                if (C>20 && C<=29){
                    System.out.println("Usted se lleva 2 productos gratis!");
                    subt=C-2;
                }
                else if (C>20){
                    System.out.println("Usted se lleva 5 productos gratis!");
                    subt=C-5;
                }
                else{
                    subt=C;
                }
                subt=subt*P;
                desc=subt*0.1;
                total=subt-desc;
                System.out.println("Usted tiene descuento del 10%");
            }
            else if(T==2){
                if (C>30 && C<=39){
                    System.out.println("Usted se lleva 2 productos gratis!");
                    subt=C-2;
                }
                else if (C>20){
                    System.out.println("Usted se lleva 5 productos gratis!");
                    subt=C-5;
                }
                else {
                    subt=C;
                }
                subt=subt*P;
                desc=subt*0.3;
                total=subt-desc;
                System.out.println("Usted tiene descuento del 10%");
            }
            System.out.println("Su total a pagar es: "+total);
        }//Opcion 3
    } 
        while(opcion!=4);{
        } 
    }
}