package Cadastros;

import java.util.ArrayList;
import modelo.Aluno;
import util.Input;
import Cadastros.CadastroPessoa;

public class CadastroAluno extends Aluno{
    
    protected static void setarDadosAluno(Aluno a){
        CadastroPessoa.setarDadosPessoa(a);
        System.out.println("Digite sua matricula: ");
        a.setMatricula(Input.nextLine());
        System.out.println("Digite sua primeira nota: ");
        notas.add(Input.nextFloat());
        System.out.println("Digite sua segunda nota: ");
        notas.add(Input.nextFloat());
        System.out.println("Digite sua terceira nota: ");
        notas.add(Input.nextFloat());
    }
    
    public static Aluno CadastrarAluno(){
        Aluno a = new Aluno();
        setarDadosAluno(a);
        return a;
    }
    
}
