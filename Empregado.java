public class Empregado {
    //variavel de instancia (objeto). cada objeto tem sua propria copia
    private String nome; // encapsulou variavel nome, outras classes nao conseguem acessar ela, apenas Empregado
    private int idade;

    public String getNome(){
        return nome;
    }
    // metodo nao usa kamelcase

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

}