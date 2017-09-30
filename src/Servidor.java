public class Servidor extends Usuario{
    private String area;

    public Servidor(String email, String senha, String nome) {
        super(email, senha, nome);
    }


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
}
