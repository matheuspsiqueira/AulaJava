package basejava;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Basejava {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Numero numero = new Numero();

        try{
            numero.valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
            JOptionPane.showMessageDialog(null, "O numero é: " + numero.parImpar());
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Digite apenas numeros");
        }

        System.out.print("Digite o primeiro valor: ");
        int v1 = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        int v2 = scan.nextInt();
        System.out.println(numero.maiorValor(v1, v2));

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = scan.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int valor3 = scan.nextInt();

        System.out.println(numero.ordenarCrescente(valor1, valor2, valor3));

    }
    
}
