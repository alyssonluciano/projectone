/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcao;

import javax.swing.JOptionPane;

/**
 *
 * @author Alysson
 */
public class Correcao {

    /**
     * @param args the command line arguments
     */
    static String disciplina;
    int questoes, acertos;
    double valor;
    static double resultado;
//teste git
    public static void main(String[] args) {

        Correcao corrigir = new Correcao();
        corrigir.conferencia();
    }

    public void conferencia() {
        disciplina = JOptionPane.showInputDialog(null, "Nome da Disciplina");
        questoes = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de questões"));
        acertos = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de acertos"));

        valor = 10.0 / questoes;
        resultado = (valor * acertos);

        int dialogButton = JOptionPane.showConfirmDialog(null, "A nota em " + disciplina + " : " + resultado,
                "Corrigir novamente ?", JOptionPane.YES_NO_OPTION);
        if (dialogButton == JOptionPane.YES_OPTION) {

            Correcao corrigir = new Correcao();
            corrigir.conferencia();
            resultado = 0;
            disciplina = "";

        } else {
            System.exit(0);
        }

    }
}
