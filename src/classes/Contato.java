package classes;

import java.util.Scanner;

public class Contato {

    private String nome;
    private String endereco;
    private String fone;
    private String email;

    public Contato() {}

    public Contato(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", endereco=" + endereco + ", fone=" + fone + ", email=" + email + '}';
    }
     
    public void salvar(Contato contato, int posicao){
        contatos[posicao] = contato;
    } 
    
    public void listarTudo(){
        int c =0;
        for (Contato contato : contatos){
            if (contato != null)
            System.out.println(c +  " - " + contato.toString());
            c++;
        }
    }
    static Contato[] contatos = new Contato[10];
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcao = 1;
        int cc =0;
        do {
            System.out.print("Escolha a opcão: ");
            opcao = sc.nextInt();
            
            Contato contato = new Contato();
            
            switch(opcao){
                case 1:
                    System.out.print("Nome: ");
                    contato.setNome(sc.next());
                    System.out.print("Fone: ");
                    contato.setFone(sc.next());
                    System.out.print("Email: ");
                    contato.setEmail(sc.next());
                    System.out.print("Endereço: ");
                    contato.setEndereco(sc.next());
                    cc++;
                    contato.salvar(contato,cc);
                    break;
                case 2 :
                    contato.listarTudo();
                    break;
                default:
                    break;
            }
        }while (opcao != 0);
        System.out.println("Acabou!!!");
    }
       
}
