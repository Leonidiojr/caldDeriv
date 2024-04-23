package functions;

import java.util.Scanner;

public class CalculaDerivadaInformada {
    
private String funcao;
    private double a, b, c;

    public CalculaDerivadaInformada(String funcao) {
        this.funcao = funcao;
        extrairCoeficientes();
    }

    private void extrairCoeficientes() {
        String[] coeficientes = funcao.split("\\+");
        for (String coeficiente : coeficientes) {
            if (coeficiente.contains("x^2")) {
                a = Double.parseDouble(coeficiente.replace("x^2", "").trim());
            } else if (coeficiente.contains("x")) {
                b = Double.parseDouble(coeficiente.replace("x", "").trim());
            } else {
                c = Double.parseDouble(coeficiente.trim());
            }
        }
    }

    public void calcularDerivada() {
        double aDerivado = a * 2;
        double bDerivado = b;

        if (aDerivado != 0 || bDerivado != 0) {
            if (aDerivado != 0) {
                if (bDerivado != 0) {
                    System.out.printf("A derivada da função é: %.0fx + %.0f%n", aDerivado, bDerivado);
                } else {
                    System.out.printf("A derivada da função é: %.0fx%n", aDerivado);
                }
            } else {
                System.out.printf("A derivada da função é: %.0fx%n", bDerivado);
            }
        }
    }
    
        
}