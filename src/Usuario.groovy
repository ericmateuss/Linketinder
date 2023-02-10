class Usuario{
    String nome
    String email
    String cep
    String estado

    Usuario(String nome, String email, String cep, String estado){
        this.nome = nome
        this.email = email
        this.cep = cep
        this.estado = estado
    }

    String getNome(){
        return nome
    }
    void setNome(String nome) {
        this.nome = nome
    }
    String getEmail(){
        return nome
    }
    void setEmail(String email) {
        this.email = email
    }
    String getCep(){
        return nome
    }
    void setCep(String cep) {
        this.cep = cep
    }
    String getEstado(){
        return estado
    }
    void setEstado(String estado){
        this.estado = estado
    }
}

