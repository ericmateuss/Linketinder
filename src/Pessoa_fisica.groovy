class Pessoa_fisica extends Usuario{
    String descricaoCandidato

    Pessoa_fisica(String nome, String email, String cep, String descricaoCandidato){
        super(nome, email, cep)
        this.descricaoCandidato = descricaoCandidato
    }

    String getDescricaocand(){
        return descricaoCandidato
    }
}
