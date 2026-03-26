
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String args[]) {
        int numeroDiscos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de disco da primeira torre:", "3"));
        System.out.println("Sequência de ações para " + numeroDiscos + " discos:");
        jogar(numeroDiscos, 'A', 'B', 'C');
    }

    public static void jogar(int numeroDiscos, char origem, char meio, char destino) {

        if (numeroDiscos == 1) {
            System.out.println("Disco 1 de " + origem + " para " + destino);
        } else {

            jogar(numeroDiscos - 1, origem, destino, meio);

            System.out.println("Disco " + numeroDiscos + " de " + origem + " para " + destino);

            jogar(numeroDiscos - 1, meio, origem, destino);
        }
    }
}
