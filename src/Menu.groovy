import java.lang.reflect.Array

class Menu {
    ArrayList<Pessoa_juridica> pj = new ArrayList<>()
    ArrayList<Pessoa_fisica> pf = new ArrayList<>()
    void menu(){
        Scanner sc = new Scanner(System.in)
        int escolha
        boolean saida = false;


        while(!escolha){
            Opcoes();
            escolha = sc.nextLine().toInteger()
            int escolhaCadastro
            int escolhaLista

            switch(escolha){
                case 0:
                    Opcoes();
                    break;
                case 1:
                    println("Insira uma das opcoes: ")
                    println("1 - para Empresa // 2 - para Usuario")
                    escolhaCadastro = sc.nextLine().toInteger()
                    cadastro(escolhaCadastro)
                    break;
                case 2:
                    println("Insira uma das opcoes: ")
                    println("1 - para EMpresa // 2 - para Usuario")
                    escolhaLista = sc.nextLine().toInteger()
                    listar(escolhaLista)
                    break;
                case 3:
                    //
                    break;
                case 4:
                    //
                    break;
                case 5:
                    saida = true;
                    System.exit(0);
                    break;
            }
        }
    }
    void Opcoes(){
        System.out.println("\nDigite uma opcao: ");
        System.out.println("\t0 - Para printar opcoes.");
        System.out.println("\t1 - Fazer cadastro.");
        System.out.println("\t2 - Lista as contas.");
        System.out.println("\t3 - Para deletar conta.");
        System.out.println("\t4 - Para alterar conta");
        System.out.println("\t5 - Para sair.");
    }

    void listar(int escolha){
        if(escolha == 1){
            for (int i = 0; i < pj.size(); i++) {
                String[][] matriz = new String[pj.size()][4];
                matriz[i][0] = pj.get(i).getNome()
                matriz[i][1] = pj.get(i).getEmail()
                matriz[i][2] = pj.get(i).getCep()
                matriz[i][3] = pj.get(i).getDescricaocont()

                println("Nome: " + matriz[i][0])
                println("Email: " + matriz[i][1])
                println("Cep: " + matriz[i][2])
                println("Descricao da vaga: " + matriz[i][3])
                println("\n")

            }
            menu()
        }else if(escolha == 2){
            for (int i = 0; i < pf.size(); i++) {
                String[][] matriz = new String[pf.size()][4];
                matriz[i][0] = pf.get(i).getNome()
                matriz[i][1] = pf.get(i).getEmail()
                matriz[i][2] = pf.get(i).getCep()
                matriz[i][3] = pf.get(i).getDescricaocand()

                println("Nome: " + matriz[i][0])
                println("Email: " + matriz[i][1])
                println("Cep: " + matriz[i][2])
                println("Descricao do Perfil: " + matriz[i][3])
                println("\n")
            }
            menu()
        }

    }


    def adicionarPessoafisica(String nome, String email, String cep, String descricao){
        Pessoa_fisica novaPf = new Pessoa_fisica(nome, email, cep, descricao)
        pf.add(novaPf)
    }
    def adicionarPessoajuridica(String nome, String email, String cep, String descricao){
        Pessoa_juridica novapj = new Pessoa_juridica(nome, email, cep, descricao)
        pj.add(novapj)
    }
    def cadastro(int escolha){
        String nome
        String email
        String cep
        String descricao
        Scanner sc = new Scanner(System.in)
        println("Insira seu nome: ")
        nome = sc.nextLine()

        println("Insira seu email: ")
        email = sc.nextLine()

        println("Insira seu Cep: ")
        cep = sc.nextLine()

        if(escolha == 1){
            println("Insira a descricao da vaga: ")
            descricao = sc.nextLine()
            adicionarPessoajuridica(nome, email, cep, descricao)
            menu()
        }else if(escolha == 2){
            println("Insira a sua descricao: ")
            descricao = sc.nextLine()
            adicionarPessoafisica(nome, email, cep, descricao)
            menu()
        }

    }

}
