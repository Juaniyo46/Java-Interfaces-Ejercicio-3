package es.JuanAntonio;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        double[] array = {1.6,2.5,3.7,1.9,2.3};
        ArrayReales array1 = new ArrayReales(array);

        System.out.println(array1.minimo());
        System.out.println(array1.maximo());
        System.out.println(array1.sumatorio());
    }
}
