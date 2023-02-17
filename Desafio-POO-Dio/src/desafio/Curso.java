package desafio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;
    
    public Curso() {
        
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString() {
        return "Curso [titulo = " + titulo + ", descrição = " + descricao + ", carga Horaria = " + cargaHoraria + "]";
    }
}
