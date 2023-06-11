package com.ejerciciostema2;

public class Principal {
    public static void main(String[] args) {

        double presio = 23.89;
        double IVA = 0.19;
        System.out.println("Presio sin IVA: $"+ presio);
        System.out.println("IVA: 19%");
        //SumaIva(presio, IVA);
        System.out.println("Presio total con IVA incluido: $" + SumaIva(presio, IVA));



    }

    static double SumaIva(double subtotal, double iva){
        return subtotal*(1+iva);
    }
}
