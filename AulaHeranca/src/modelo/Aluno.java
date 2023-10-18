package modelo;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    protected String matricula;
    public static ArrayList<Float> notas = new ArrayList<>();

    public Aluno() {
    }

    public Aluno(String matricula, ArrayList<Float> notas, String nome, String email, String telefone, String genero, int idade) {
        super(nome, email, telefone, genero, idade);
        this.matricula = matricula;
        this.notas = notas;
        
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Float> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Float> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", notas=" + notas + '}' + super.toString();
    }
    
    
}
