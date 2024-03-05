package co.edu.sena.soy.oop;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner scr =  new Scanner(System.in);

        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;
        double numero4 = 0;

        Data data = new Data();



        System.out.println("Miselánea de Ejercicios OOP Java"); 
        System.out.println("--------------------------------"); 
        System.out.println("1. Operadores"); 
        System.out.println("2. Condicionales"); 
        System.out.println("3. Ciclos"); 
        System.out.println("4. Arreglos"); 
        System.out.println("99. Salir");
        
        
        //submenu operadores
        System.out.println("--------------------------------");
        System.out.println("Categoria Operadores");
        System.out.println("1. Calcular área triángulo");
        System.out.println("2. Sumar dos numeros"); 
        System.out.println("3. Elevar un numero cuadrado"); 
        System.out.println("4. Converción de moneda"); 
        System.out.println("5. Area y perimetro cuadrado"); 
        System.out.println("6. Area y volumen de un cilindro"); 
        System.out.println("7. Area y volumen de un circulo"); 
        System.out.println("8. Promedio"); 
        
        
        System.out.println("--------------------------------");
        System.out.println("1. caulcular area triangulo");
        System.out.println("--------------------------------");
        System.out.println("Ingrese base");
        numero1 = scr.nextDouble();
        System.out.println("Ingrese altura");
        numero2 = scr.nextDouble();
        System.out.println("el area de un triangulo es:" + data.areatriangulo(numero1, numero2));

        

        System.out.println("--------------------------------");
        System.out.println("2. Sumar dos numeros");
        System.out.println("--------------------------------");
        System.out.println("Ingrese número 1");
        numero3 = scr.nextDouble();
        System.out.println("Ingrese número 2");
        numero4 = scr.nextDouble();
        System.out.println("La suma de los numeros es:" + data.sumanumeros(numero3, numero4));



        System.out.println("--------------------------------");
        System.out.println("3. Elevar un número cuadrado");
        System.out.println("--------------------------------");
        System.out.println("Ingrese numero");
        numero2 = scr.nextDouble();
        System.out.println("el resultado es: " + data.potencia(numero2));


        System.out.println("--------------------------------");
        System.out.println("4. Conversión de moneda");
        System.out.println("--------------------------------");
        System.out.println("Ingrese valor");
        numero1 = scr.nextDouble();
        System.out.println("El valor en dolares es:" + data.conversormoneda(numero1));

        System.out.println("--------------------------------");
        System.out.println("5. Área y perimetro cuadrado");
        System.out.println("--------------------------------");
        System.out.println("Ingrese valor");
        numero1 = scr.nextDouble();
        System.out.println("El área del cuadrado es:" + data.areacuadrado(numero2) + " " + "El perimetro del cuadrado es:" + data.perimetrocuadrado(numero2));

        System.out.println("--------------------------------");
        System.out.println("6. Área y volumen de un cilindro");
        System.out.println("--------------------------------");
        System.out.println("Ingrese el radio");
        numero1 = scr.nextDouble();
        System.out.println("Ingrese altura");
        numero2 = scr.nextDouble();
        System.out.println("El área del cilindro es:" + data.areacilindro(numero1, numero2) + "El volumen del cilindro es:" + data.volumencilindro(numero1, numero2));

        System.out.println("--------------------------------");
        System.out.println("7. Área y volumen de un circulo");
        System.out.println("--------------------------------");
        System.out.println("Ingrese el radio");
        numero1 = scr.nextDouble();
        System.out.println("El área del circulo es:" + data.areacirculo(numero1) + " " + "La longitud del circulo es:" + data.longitudcirculo(numero1));

        System.out.println("--------------------------------");
        System.out.println("8. Promedio");
        System.out.println("--------------------------------");
        System.out.println("Ingrese un numero");
        numero1 = scr.nextDouble();
        System.out.println("Ingrese un numero");
        numero2 = scr.nextDouble();
        System.out.println("Ingrese un numero");
        numero3 = scr.nextDouble();
        System.out.println("El promedio es:" + data.promedio(numero1, numero2, numero3));




    
    }
}
