import javax.swing.*;
     public class Desafio {
    public static void main(String[] args) { 

        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;
        int contador = 0;

        while (contador < 10) {
           
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (contador + 1) + ": "));

            if (numero > maior) {
                segundoMaior = maior;
                maior = numero;
            } else if (numero > segundoMaior) {
                segundoMaior = numero;
            }

            contador++;
        }

        JOptionPane.showMessageDialog(null,"O maior número é: " + maior);
        JOptionPane.showMessageDialog(null,"O segundo maior número é: " + segundoMaior);

        
}
}

    
