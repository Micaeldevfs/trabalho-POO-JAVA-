public class Estudante extends Pessoa {
    private String matricula;

    // Construtor
    public Estudante(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade);
        this.matricula = matricula;
    }

    // Getter e Setter para matricula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Implementação do método abstrato
    @Override
    public void apresentar() {
        System.out.println("Nome: " + getNome() + ", CPF: " + getCpf() + ", Idade: " + getIdade() + ", Matrícula: " + matricula);
    }

    // Método para obter informações do estudante
    @Override
    public String getInfo() {
        return super.getInfo() + ", Matrícula: " + matricula;
    }
}
