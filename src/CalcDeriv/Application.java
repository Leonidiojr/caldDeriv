/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CalcDeriv;

import functions.CalculaDerivadaInformada;
import java.util.Scanner;



/**
 *
 * @author Leonidio Alves de Moraes Junior <leonidiojr@gmail.com>
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    
  public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String funcao;

        System.out.println("==============================================================================");
        System.out.println("               Aplicativo para Cálculo de Derivadas - versão 1.0              ");
        System.out.println("==============================================================================");
        while (true) {
            System.out.println("Digite a função no formato ax^2 + bx + c (ou digite SAIR para interromper):");
            funcao = scanner.nextLine();
            
            if (funcao.equalsIgnoreCase("SAIR")) {
                limparTela();
                System.out.println("Terminando a aplicação...");
                break;
            }

            if (!validarFuncao(funcao)) {
                System.out.println("");
                System.out.println("Função inserida no formato incorreto. Por favor, tente novamente.");
                continue;
            }

            CalculaDerivadaInformada calculadora = new CalculaDerivadaInformada(funcao);
            calculadora.calcularDerivada();
        }

        scanner.close();
    }
public static boolean validarFuncao(String funcao) {
        // Verifica se a função está no formato correto
        return funcao.matches("-?\\d*x\\^2\\s*[+-]\\s*\\d*x\\s*[+-]\\s*\\d*");
    }

    public static void limparTela() {
        // Limpa a tela imprimindo caracteres especiais
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
}
