public class Disciplina {
    private String codigo;
    private String nome;
    private int semestre;

    // Construtor
    public Disciplina(String codigo, String nome, int semestre) {
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
    }

    // Getter e Setter para codigo
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para semestre
    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    // Método para apresentar a disciplina
    public void apresentarDisciplina() {
        System.out.println("Código: " + codigo + ", Nome: " + nome + ", Semestre: " + semestre);
    }

    // Método para obter informações da disciplina
    public String getInfo() {
        return "Código: " + codigo + ", Nome: " + nome + ", Semestre: " + semestre;
    }
}
