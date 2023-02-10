class Pessoa_fisica extends Usuario{
    String descricaoCandidato
    int idade
    String cpf

    Pessoa_fisica(String nome, String email, String cpf, int idade, String estado, String cep, String descricaoCandidato){
        super(nome, email, cep, estado)
        this.descricaoCandidato = descricaoCandidato
        this.idade = idade
        this.cpf = cpf
    }

    String getDescricaocand(){
        return descricaoCandidato
    }
    void setDescricao(String descricao){
        this.descricaoCandidato = descricao
    }
    String getCpf(){
        return cpf
    }
    void setCpf(String cpf){
        this.cpf = cpf
    }
    int getIdade(){
        return idade
    }
    void setIdade(int idade){
        this.idade = idade
    }
}
