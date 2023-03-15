package basejava;

public class Basejava {

    public static void main(String[] args) {
//      int valor = 3;

//      if (valor % 2 == 0){
//          System.out.print("PAR");
//      }else{
//          System.err.print ("IMPAR");
//      };

        Numero numero = new Numero();
        numero.valor = 4;
        System.out.print(numero.maiorValor(1, 4));
    }
    
}
