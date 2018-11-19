package es.JuanAntonio;

public class ArrayReales implements Estadisticas {

    private double[] numero;

    public ArrayReales(double numero[]) {
        this.numero = numero;
    }

    public double[] getNumero() {
        return numero;
    }

    public void setNumero(double[] numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ArrayReales{" +
                "numero=" + numero +
                '}';
    }

    @Override
    public double minimo() {

        double numeroMin = numero[0];
        for (int i = 1 ; i < numero.length ; i++) {

            if (numero[i] < numeroMin) {
                numeroMin = numero[i];
            }

        }

        return numeroMin;
    }

    @Override
    public double maximo() {

        double numeroMax = numero[0];
        for (int i = 1 ; i < numero.length ; i++) {

            if (numero[i] > numeroMax) {
                numeroMax = numero[i];
            }

        }

        return numeroMax;
    }

    @Override
    public double sumatorio() {

        double suma =0;

        for (int i = 0 ; i < numero.length ; i++) {
            suma += numero[i];
        }

        return suma;
    }
}
