class Cadastro {
    ArrayList<Pessoa_juridica> pj = new ArrayList<>()
    ArrayList<Pessoa_fisica> pf = new ArrayList<>()
    void listar(){
        println("Insira uma das opcoes: ")
        println("1 - para Empresa // 2 - para Usuario")
        Scanner sc = new Scanner(System.in)
        int escolha
        escolha = sc.nextLine().toInteger()
        if(escolha == 1){
            for (int i = 0; i < pj.size(); i++) {
                String[][] matriz = new String[pj.size()][7]
                ArrayList<String> competencias = new ArrayList<>()
                String texto
                matriz[i][0] = pj.get(i).getNome()
                matriz[i][1] = pj.get(i).getEmail()
                matriz[i][2] = pj.get(i).getCnpj()
                matriz[i][3] = pj.get(i).getPais()
                matriz[i][4] = pj.get(i).getEstado()
                matriz[i][5] = pj.get(i).getCep()
                matriz[i][6] = pj.get(i).getDescricaocont()
                competencias = pj.get(i).getCOmpetencia()

                println("Nome: " + matriz[i][0])
                println("Email: " + matriz[i][1])
                println("CNPJ: " + matriz[i][2])
                println("Pais: " + matriz[i][3])
                println("Estado: " + matriz[i][4])
                println("Cep: " + matriz[i][5])
                println("Descricao da empresa: " + matriz[i][6])
                texto = competencias.join(" ")
                println("Competencias requeridas: " + texto)

            }
        }else if(escolha == 2){
            for (int i = 0; i < pf.size(); i++) {
                String[][] matriz = new String[pf.size()][7];
                ArrayList<String> atributos = new ArrayList<>()
                String texto
                matriz[i][0] = pf.get(i).getNome()
                matriz[i][1] = pf.get(i).getEmail()
                matriz[i][2] = pf.get(i).getCpf()
                matriz[i][3] = pf.get(i).getIdade()
                matriz[i][4] = pf.get(i).getEstado()
                matriz[i][5] = pf.get(i).getCep()
                matriz[i][6] = pf.get(i).getDescricaocand()
                atributos = pf.get(i).getAtributos()

                println("Nome: " + matriz[i][0])
                println("Email: " + matriz[i][1])
                println("CPF: " + matriz[i][2])
                println("Idade: " + matriz[i][3])
                println("Estado: " + matriz[i][4])
                println("Cep: " + matriz[i][5])
                println("Descricao do Perfil: " + matriz[i][6])
                texto = atributos.join(" ")
                println("Atributos: " + texto)
            }
        }

    }


    void adicionarPessoafisica(nome, email, cnpjCPF, idade, estado, cep, descricao, atributos){
        Pessoa_fisica novaPf = new Pessoa_fisica(nome, email, cnpjCPF, idade, estado, cep, descricao, atributos)
        pf.add(novaPf)
    }
    void adicionarPessoajuridica(nome, email, cnpjCPF, pais, estado, cep, descricao, competencias){
        Pessoa_juridica novapj = new Pessoa_juridica(nome, email, cnpjCPF, pais, estado, cep, descricao, competencias)
        pj.add(novapj)
    }
    void cadastro(){
        String nome
        String email
        String cep
        String cnpjCPF
        int idade
        int escolha
        String estado
        String pais
        String descricao
        String atributo
        String competencia
        ArrayList<String> atributos = new ArrayList<>()
        ArrayList<String> competencias = new ArrayList<>()
        int loopInterno
        int loop = 1

        Scanner sc = new Scanner(System.in)
        println("Insira uma das opcoes: ")
        println("1 - para Empresa // 2 - para Usuario")
        escolha = sc.nextLine().toInteger()

        println("Insira seu nome: ")
        nome = sc.nextLine()

        println("Insira seu email: ")
        email = sc.nextLine()


        if(escolha == 1){
            println("Insira seu CNPJ: ")
            cnpjCPF = sc.nextLine()

            println("Insira o pais onde a empresa reside: ")
            pais = sc.nextLine()

            println("Insira o estado ao qual a empresa reside: ")
            estado = sc.nextLine()

            println("Insira seu Cep: ")
            cep = sc.nextLine()

            println("Insira a descricao da vaga: ")
            descricao = sc.nextLine()

            println("Hora de inserir seus atributos!")

            while(loop == 1){
                println("Insira uma competencia por vez.")
                competencia = sc.nextLine()
                competencias.add(competencia);
                println("Tem mais algum requisito que gostaria de colocar?")
                println("1 - sim // 2 - nao")
                loopInterno = sc.nextLine().toInteger()
                if(loopInterno == 1){
                    loop = 1
                }else if(loopInterno == 2){
                    loop = 2
                }
            }
            adicionarPessoajuridica(nome, email, cnpjCPF, pais, estado, cep, descricao, competencias)
        }else if(escolha == 2){
            println("Insira seu CPF: ")
            cnpjCPF = sc.nextLine()

            println("Insira sua Idade: ")
            idade = sc.nextLine().toInteger()

            println("Insira seu Estado: ")
            estado = sc.nextLine()

            println("Insira seu Cep: ")
            cep = sc.nextLine()

            println("Insira a sua Descricao: ")
            descricao = sc.nextLine()

            println("Hora de inserir seus atributos!")

            while(loop == 1){
                println("Insira um atributo por vez.")
                atributo = sc.nextLine()
                atributos.add(atributo);
                println("Tem mais um atributo que gostaria de colocar?")
                println("1 - sim // 2 - nao")
                loopInterno = sc.nextLine().toInteger()
                if(loopInterno == 1){
                    loop = 1
                }else if(loopInterno == 2){
                    loop = 2
                }
            }
            adicionarPessoafisica(nome, email, cnpjCPF, idade, estado, cep, descricao, atributos)
        }

    }

}
