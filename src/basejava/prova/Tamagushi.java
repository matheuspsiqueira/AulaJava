package basejava.prova;

public class Tamagushi {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public Tamagushi(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void alterarFome(int fome) {
        this.fome =+- fome;
    }

    public void alterarSaude(int saude) {
        this.saude = saude;
    }

    public void alterarIdade(int idade) {
        this.idade = idade;
    }

    public String retornarNome() {
        return this.nome;
    }

    public int retornarFome() {
        return this.fome;
    }

    public int retornarSaude() {
        return this.saude;
    }

    public int retornarIdade() {
        return this.idade;
    }

    public String retornarHumor() {
        if (this.fome <= 5 && this.saude >= 5) {
            return "feliz";
        } else if (this.fome > 5 && this.saude > 5) {
            return "neutro";
        } else {
            return "triste";
        }
    }
}



