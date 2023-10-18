package Cadastros;

import java.util.ArrayList;
import modelo.Professor;
import util.Input;
import Cadastros.CadastroPessoa;


public class CadastroProfessor extends Professor{
    protected static void setarDadosProfessor(Professor prof){
        CadastroFuncionario.setarDadosFuncionario(prof);
        System.out.println("Digite sua disciplina: ");
        prof.setDisciplina(Input.nextLine());
    }
    
    public static Professor cadastrarProfessor(){
        Professor prof = new Professor();
        setarDadosProfessor(prof);
        return prof;
    }
    
}
