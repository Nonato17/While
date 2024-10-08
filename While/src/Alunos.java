import javax.swing.*;

     public class Alunos {
   
    public static void main(String[] args) {
    
        int quantidadeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos têm na sala? "));

        double somaNotas = 0;
        int contador = 0;

        while (contador < quantidadeAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota =  Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno " + (contador + 1) + ": "));
            somaNotas += nota;
            contador++;
        }

        double media = somaNotas / quantidadeAlunos;

   
        JOptionPane.showMessageDialog(null,"A média aritmética da turma é: "+ media);

       
}
 }
    

