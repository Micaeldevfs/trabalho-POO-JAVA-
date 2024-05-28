import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Requisitando dados para Estudante
        String cpfEstudante = JOptionPane.showInputDialog("Digite o CPF do estudante:");
        String nomeEstudante = JOptionPane.showInputDialog("Digite o nome do estudante:");
        String idadeEstudanteStr = JOptionPane.showInputDialog("Digite a idade do estudante:");
        int idadeEstudante = Integer.parseInt(idadeEstudanteStr);
        String matriculaEstudante = JOptionPane.showInputDialog("Digite a matrícula do estudante:");

        Estudante estudante = new Estudante(cpfEstudante, nomeEstudante, idadeEstudante, matriculaEstudante);

        // Apresentando o estudante
        JOptionPane.showMessageDialog(null, estudante.getInfo());

        // Requisitando dados para Disciplina
        String codigoDisciplina = JOptionPane.showInputDialog("Digite o código da disciplina:");
        String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina:");
        String semestreDisciplinaStr = JOptionPane.showInputDialog("Digite o semestre da disciplina:");
        int semestreDisciplina = Integer.parseInt(semestreDisciplinaStr);

        Disciplina disciplina = new Disciplina(codigoDisciplina, nomeDisciplina, semestreDisciplina);

        // Apresentando a disciplina
        JOptionPane.showMessageDialog(null, disciplina.getInfo());
    }
}
