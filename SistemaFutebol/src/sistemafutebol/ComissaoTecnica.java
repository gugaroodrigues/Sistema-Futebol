
package sistemafutebol;

import javax.swing.JOptionPane;

/**
 *
 * @author Thiago Avancini
 */
public class ComissaoTecnica {
    
    public static void listar(){
        String jogador = "";
        for(int i = 0; i < 30; i++){
            texto += Atletas.nomes[i] + "\n"
        }
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public static void buscarPelaPosicao(){
        String buscaPosicao = JOptionPane.showInputDialog("Informe a posicao do jogador");
        String posicaoBuscada = "";
        for(int j = 0; j < 30; j++){
            if(Atletas.posicoes[j].contains(buscaPosicao)){
                posicaoBuscada += Atletas.nomes[j] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, posicaoBuscada);
    }
    
    
    
    
    
}
