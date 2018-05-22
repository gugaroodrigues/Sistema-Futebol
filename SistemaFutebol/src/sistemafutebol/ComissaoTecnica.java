
package sistemafutebol;

import javax.swing.JOptionPane;

/**
 *
 * @author Thiago Avancini
 */
public class ComissaoTecnica {
    
    public void listar(){
        String jogador = "";
        for(int i = 0; i < 30; i++){
            texto += Atletas.nomes[i] + "\n"
        }
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public void buscarPelaPosicao(){
        String buscaPosicao = JOptionPane.showInputDialog("Informe a posicao do jogador");
        String posicaoBuscada = "";
        for(int j = 0; j < 30; j++){
            if(Atletas.posicoes[j].contains(buscaPosicao)){
                posicaoBuscada += Atletas.nomes[j] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, posicaoBuscada);
    }
    
    public void buscarPeloNome(){
        String buscaNome = JOptionPane.showInputDialog("Informe o nome parcial para busca");
        String nomeBuscado = "";
        for(int j)
    }
    
    public void cadastrarDesempenho(){
        
    }
    
}
