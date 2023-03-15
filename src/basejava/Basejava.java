package basejava;

public class Basejava {

    public static void main(String[] args) {

        Numero numero = new Numero();
        numero.valor = 4;

        System.out.println(numero.parImpar());
        
        System.out.println(numero.maiorValor(1, 4));
        
        System.out.println(numero.ordenarCrescente(94, 5, 39));
        
    }
    
}
