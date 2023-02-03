package com.mycompany.lab3p1_fernandogomez;

import java.util.Scanner;

/**
 *
 * @author Fernando_Jose
 */
public class Lab3P1_FernandoGomez {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        //  != significa distinto que
        while (opcion != 4) {
            System.out.println("Menu");
            System.out.println("1. Triángulo");
            System.out.println("2. Calculando PI");
            System.out.println("3. Construyendo casas");
            System.out.println("4. Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el tamaño de la figura: ");
                    int tamaño = entrada.nextInt();
                    // System.out.print("Ingrese el caracter para el traingulo superior: ");
                    // String str = entrada.nextLine();
                    // char carac = str.charAt(0);
                    int i;
                        for (i = 0; i < tamaño; i++) {
                            for (int  j=tamaño; j > i; j--) {
                                System.out.print("A");
                               
                            }
                            System.out.println("");
                        }
                        break;
                case 2:          
                     System.out.print("Ingrese el límite de la sumatoria: ");
                    int num = entrada.nextInt();
                    int cont = 0;
                    float a = 0,
                     b = 0,
                     resp = 0,
                     res,
                      resp2 = 0,
                            resp3 =0;
                    while (cont < num) {
                        cont = cont + 1;
                        if (cont % 2 == 0) {
                        a = 1;
                        }else if (cont % 2 == 1){
                        a = -1;
                        }
                        b = (2*cont) + 1;
                        res = (a / b);
                        resp = res + resp;
                        
                    }
                    resp2 = resp*4;
                    resp3 = resp2 + 4;
                    System.out.println("La aproximación es: " + resp3);
                    
                    break;

                case 3:
                    System.out.println("Ingrese el tamaño de la figura: ");
                    int tam = entrada.nextInt();
                    for(i=1; tam==2;i++);
                    break;
                    
                    
            }
    }
}
}
