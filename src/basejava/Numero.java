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
    
    public int maiorValor(int num1, int num2){

        if (num1 > num2){
            return num1;
        }
        return num2;
        
    }
}
