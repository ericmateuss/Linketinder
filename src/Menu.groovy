import java.lang.reflect.Array

class Menu {
    Cadastro cadastro = new Cadastro()
    void menu(){
        Scanner sc = new Scanner(System.in)
        int escolha
        boolean saida = false;

        while(!saida){
            Opcoes();
            escolha = sc.nextLine().toInteger()

            switch(escolha){
                case 0:
                    Opcoes();
                    break;
                case 1:
                    cadastro.cadastro()
                    break;
                case 2:
                    cadastro.listar()
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
    static void Opcoes(){
        System.out.println("\nDigite uma opcao: ");
        System.out.println("\t0 - Para printar opcoes.");
        System.out.println("\t1 - Fazer cadastro.");
        System.out.println("\t2 - Lista as contas.");
        System.out.println("\t3 - Para deletar conta.");
        System.out.println("\t4 - Para alterar conta");
        System.out.println("\t5 - Para sair.");
    }

}
