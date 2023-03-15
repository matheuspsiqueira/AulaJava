package basejava;

public class Numero {
    
    int valor;
    
    public String parImpar(){
        if (this.valor % 2 == 0){
            return "PAR";
        }else{
            return "IMPAR";
        }
    }

    public String parImpar(int valor){
        if (valor % 2 == 0){
            return "PAR";
        }else{
            return "IMPAR";
        }
    }
    
    public int maiorValor(int num1, int num2){

        if (num1 > num2){
            return num1;
        }
        return num2;
        
    }
    
    public String ordenarCrescente(int valor1, int valor2, int valor3){
        
        int temp = 0;

        if (valor1 > valor2){
            temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }

        if (valor2 > valor3){
            temp = valor3;
            valor3 = valor2;
            valor2 = temp;
        }

        if (valor1 > valor3){
            temp = valor3;
            valor3 = valor1;
            valor1 = temp;
        }

        return valor1 + " - " + valor2 + " - " + valor3;
            
    }
}