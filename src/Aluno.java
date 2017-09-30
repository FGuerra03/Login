public class Aluno extends Usuario {
    private String curso;
    private String semestre;

    public Aluno(String email, String senha, String nome) {
        super(email, senha, nome);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    
}
