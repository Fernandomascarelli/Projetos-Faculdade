package Cadastros;

import java.util.ArrayList;
import modelo.Pessoa;
import util.Input;

public class CadastroPessoa extends Pessoa {

    protected static void setarDadosPessoa(Pessoa p) {

        System.out.println("Digite seu nome: ");
        p.setNome(Input.nextLine());
        System.out.println("Digite seu email: ");
        p.setEmail(Input.nextLine());
        System.out.println("Digite seu telefone: ");
        p.setTelefone(Input.nextLine());
        System.out.println("Digite seu genero: ");
        p.setGenero(Input.nextLine());
        System.out.println("Digite sua idade: ");
        p.setIdade(Input.nextInt());

    }

    public static Pessoa cadastrarPessoa() {
        Pessoa p = new Pessoa();
        setarDadosPessoa(p);

        return p;
    }
}
