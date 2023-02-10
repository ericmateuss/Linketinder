class Pessoa_juridica extends Usuario{
    String descricaoContratante

    Pessoa_juridica(String nome, String email, String cep, String descricaoContratante){
        super(nome, email, cep)
        this.descricaoContratante = descricaoContratante
    }

    String getDescricaocont(){
        return descricaoContratante
    }
}