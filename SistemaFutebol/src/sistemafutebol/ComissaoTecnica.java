
package sistemafutebol;

import javax.swing.JOptionPane;

/**
 *
 * @author Thiago Avancini
 */
public class ComissaoTecnica {
    
    
    
    int contador = 0;
    public static void listar(){
        String jogador = "";
        for(int i = 0; i < nomes.length; i++){
            jogador += Atletas.nomes[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, jogador);
    }
    
    public static void buscarPelaPosicao(){
        String buscaPosicao = JOptionPane.showInputDialog("Informe a posicao do jogador");
        String posicaoBuscada = "";
        for(int j = 0; j < Atletas.nomes.length; j++){
            if(Atletas.posicoes[j].contains(buscaPosicao)){
                posicaoBuscada += Atletas.nomes[j] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, posicaoBuscada);
    }
    
    int[] golsMarcados = new int[Atletas.nomes.length];
    
    public void cadastrarDesempenho(int contador){
        golsMarcados[contador] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de gols marcados pelo jogador: " + Atletas.nomes[contador])
        );
        
        
        
        contador++;
        
    }
    
    
    
    
    
    
    
}
