class Pessoa_juridica extends Usuario{
    String descricaoContratante
    String cnpj
    String pais
    ArrayList<String> competencias = new ArrayList<>()


    Pessoa_juridica(String nome, String email, String cnpj, String pais, String estado, String cep, String descricaoContratante, ArrayList<String> competencia){
        super(nome, email, cep, estado)
        this.descricaoContratante = descricaoContratante
        this.cnpj = cnpj
        this.pais = pais
        this.competencias = competencia
    }

    String getDescricaocont(){
        return descricaoContratante
    }
    void setDescricaocont(String descricao){
        this.descricaoContratante = descricao
    }

    String getCnpj(){
        return cnpj
    }
    void setCnpj(String cnpj){
        this.cnpj = cnpj
    }
    String getPais(){
        return pais
    }
    void setPais(String pais){
        this.pais = pais
    }
    ArrayList getCOmpetencia(){
        return competencias
    }
}