public class Professor extends Usuario {
    private String especialidade;

    public Professor(String email, String senha, String nome) {
        super(email, senha, nome);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
}
