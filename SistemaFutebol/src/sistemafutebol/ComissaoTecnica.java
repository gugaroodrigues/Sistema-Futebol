
package sistemafutebol;

import javax.swing.JOptionPane;

/**
 *
 * @author Thiago Avancini
 */
public class ComissaoTecnica {
    
    public void gerenciarComissao(){
        int subMenuComissao = Integer.parseInt(
                JOptionPane.showInputDialog("1 - Listar\n" + 
                                            "2 - Busca por posição\n" +
                                            "3 - Cadastro de desempenho individual\n")        
        );
        switch(subMenuComissao){
            case 1:
                listar();
                break;
            case 2:
                buscarPelaPosicao();
                break;
            case 3:
                cadastrarDesempenhoIndividual(contador);
                break;
        }
        
             
    }
    
    int contador = 0;
    public static void listar(){
        String jogador = "";
        for(int i = 0; i < Atletas.nomes.length; i++){
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
    
    public void cadastrarDesempenhoIndividual(int contador){
        golsMarcados[contador] = Integer.parseInt(JOptionPane.showInputDialog("Informe o nÃºmero de gols marcados pelo jogador: " + Atletas.nomes[contador])
        );
        
        
        
        
        
        contador++;
        
    }
    
    
    
    
    
    
    
}
