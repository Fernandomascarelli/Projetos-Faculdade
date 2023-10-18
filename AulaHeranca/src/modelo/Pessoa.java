package modelo;

import java.util.ArrayList;

public class Pessoa {

    protected String nome;
    protected String email;
    protected String telefone;
    protected String genero;
    protected int idade;
    public static ArrayList<Pessoa> pessoas = new ArrayList<>();

    public Pessoa() {

    }

    public Pessoa(String nome, String email, String telefone, String genero, int idade) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.genero = genero;
        this.idade = idade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", genero=" + genero + ", idade=" + idade + '}';
    }

}
