// 1 - Pacote
package fundamentos;
// 2 -  Biblioteca

import java.util.Scanner;

// 3 -  Classe
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in); //instanciar o objeto  de leitura do console e ligar

    // 3.2 - Metodos  e Funções
    public static void main(String[] args) {
        String opcao;
        int area = 0; //receber o resultado dos cáculos de áreas

        System.out.println("Escolha o Calculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retangulo");
        System.out.println("(3) - Area do Triangulo");
        System.out.println("(4) - Area do Circulo");

        opcao = entrada.nextLine();//Leitura da opção
        switch (opcao) {
            case "1":
                area = calcularAreaDoQuadrado();
                break;

            default:
                System.out.println("Valor Invalido: " + opcao);
        }
        if (area > 0) {
            System.out.println("A area e de " + area + "m²");
        }
    }

    public static int calcularAreaDoQuadrado() {
        int lado; ///tamanho  do lado  do quadrado

        System.out.println("Digite o Tamanho do Lado: ");
        lado = entrada.nextInt();// leitura do tamanho do lado
        return lado * lado; // retorna a área do quadrado
    }
}

