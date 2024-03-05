package co.edu.sena.soy.oop;

public class Data {
    public double areatriangulo (double numero1, double numero2){
        return (numero1 * numero2) / 2;
    }

    public double sumanumeros (double numero3, double numero4){
        return (numero3 + numero4);
    }

    public double potencia (double numero2){
        return (numero2 * numero2);
    }
    public double conversormoneda (double numero1){
        return (numero1 * 1.09 );
    }
    public double areacuadrado (double numero2){
        return (Math.pow(numero2, numero2));
    }
    public double perimetrocuadrado (double numero2){
        return (numero2 + numero2 + numero2 + numero2);
    }

    public double areacilindro (double numero1, double numero2){
        return ((2 * 3.1416) *  numero1 * numero2)   + (2 * 3.1416 * ( numero1 * numero1));
    }

    public double volumencilindro (double numero1, double numero2){
        return (3.1416 * (numero1 * numero1) *numero2);
    }

    public double areacirculo (double numero1){
        return (Math.PI * Math.pow(numero1, 2));
    }

    public double longitudcirculo (double numero1){
        return (2 *  Math.PI * numero1);
    }

    public double promedio (double numero1, double numero2, double numero3){
        return (numero1 + numero2 + numero3) / 3;
    }



}


    