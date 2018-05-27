
package sistemafutebol;

import javax.swing.JOptionPane;

/**
 *
 * @author Thiago Avancini
 */
public class ComissaoTecnica{
    
    public void gerenciarComissao(){
        int subMenuComissao = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                "SISTEMA FUTEBOL", 0, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
                    "Buscar",
                    "Desempenho"
                    }, "");
        switch(subMenuComissao){
            case 0:
                buscar();
                break;
            case 1:
                cadastrarDesempenhoIndividual();
                break;
            default: 
                JOptionPane.showMessageDialog(null, "Op��o Inv�lida!!");
        }            
    }
    
    /*public void listar(){
        String jogador = "";
        for(int i = 0; i < Atletas.atual; i++){
            jogador += Atletas.nomes[i] + "\n";
        }
        
        JOptionPane.showMessageDialog(null, jogador);
        
    }*/
    
    public void buscar(){
        int menuBuscar = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                "SISTEMA FUTEBOL", 0, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
                    "Buscar por posição",
                    "Buscar por nome"}, "");
        
        switch(menuBuscar){
            case 0:
                buscarPelaPosicao();
                break;
            case 1:
                buscarPeloNome();
                break;
        }
    }
    
    
    public void buscarPelaPosicao(){
        String buscaPosicao = JOptionPane.showInputDialog(null, "Selecione a posição do atleta", "SISTEMA FUTEBOL",
                JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "GOLEIRO",
                    "ZAGUEIRO",
                    "LATERAL",
                    "MEIA",
                    "ATACANTE"},
                "").toString();
        
        
        String posicaoBuscada = "";
        for(int i = 0; i < Atletas.atual; i++){
            if(Atletas.posicoes[i].contains(buscaPosicao)){
                posicaoBuscada += Atletas.nomes[i] + "\n";
            }else{
                JOptionPane.showMessageDialog(null, "Não há atletas cadastrados nessa posição");
                
            }
        }
        JOptionPane.showMessageDialog(null, posicaoBuscada);
    }
    
    public void buscarPeloNome(){
        String buscaNome = JOptionPane.showInputDialog("Informe o nome do jogador").trim();
        String nomeBuscado = "";
        for(int i = 0; i < Atletas.atual; i++){
            if(Atletas.posicoes[i].contains(buscaNome)){
                nomeBuscado += Atletas.nomes[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, nomeBuscado);
    }
    
    int[] golsMarcados = new int[Atletas.atual];
    int[] faltasCometidas = new int[Atletas.atual];
    int[] faltasSofridas = new int[Atletas.atual];
    int[] assistencias = new int[Atletas.atual];
    int[] cartoesAmarelos = new int[Atletas.atual];
    int[] cartoesVermelhos = new int[Atletas.atual];
    int[] numeroJogos = new int[Atletas.atual];
    int[] passesJogador = new int[Atletas.atual];
    int[] passesCertos = new int[Atletas.atual];
    int[] golsSofridos = new int[Atletas.atual];
    int[] penaltisDefendidos = new int[Atletas.atual];
    int[] penaltisConvertidos = new int[Atletas.atual];
    int[] defesasDificeis = new int[Atletas.atual];
    double[] distanciaPercorrida = new double[Atletas.atual];
    
    public void cadastrarDesempenhoIndividual(){
              
        Object[] nomesListados = new Object[Atletas.atual];
        
        for(int i = 0; i < Atletas.atual; i++){
            nomesListados[i] = Atletas.nomes[i] + "\n";
        }
        
        int escolher = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                "SISTEMA FUTEBOL", 0, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
                    "GOLEIRO",
                    "JOGADOR DE LINHA"}, "");
        
            switch(escolher){
                case 0:
                    
            }
        
        int posicao = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Selecione um atleta", "SISTEMA FUTEBOL",
                JOptionPane.QUESTION_MESSAGE, null, nomesListados,
                "").toString()
        );
        
        
        
            golsMarcados[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de gols marcados pelo jogador: " + Atletas.nomes[posicao])
            );

            distanciaPercorrida[posicao] = Double.parseDouble(
                    JOptionPane.showInputDialog("Informe a dist�ncia percorrida por jogo.")
            );

            cartoesAmarelos[posicao] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de cart�es amarelos")
            );

            cartoesVermelhos[posicao] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de cart�es vermelhos")
            );

            numeroJogos[posicao] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de jogos do jogador")
            );

            assistencias[posicao] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de assist�ncias")
            );

            passesJogador[posicao] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de passes do jogador")
            );

            passesCertos[posicao] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de passes certos do jogador")
            );
            
            //fazer porcentagem de passes certos em rela��o ao total de passes
            
            faltasCometidas[posicao] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de faltas cometidas")
            );

            faltasSofridas[posicao] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de faltas sofridas")
            );
        
            golsSofridos[posicao] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de gols sofridos")
            );
            
            defesasDificeis[posicao] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de defesas dif�ceis")
            );
            
            penaltisDefendidos[posicao] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de p�naltis defendidos")
            );
            
            penaltisConvertidos[posicao] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de p�naltis convertidos")
            );
            
            numeroJogos[posicao] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de jogos do jogador")
            );
            
            //fazer a porcentagem de penaltis defendidos           
    }
    
    public void mostrarDesempenho(int posicao){
        
        int opcao = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                "SISTEMA FUTEBOL", 0, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
                    "Buscar por posição",
                    "Buscar por nome"}, "");
        
        switch(opcao){
            case 0: 
                buscarPeloNome();
                break;                   
            case 1:
                buscarPelaPosicao();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!!");
                
        }

        Object[] nomesAtletas = new Object[Atletas.atual];
        
        for (int i = 0; i < Atletas.atual; i++){
            nomesAtletas[i] = Atletas.nomes[i];
        }
        
        String mostrar = JOptionPane.showInputDialog(null,
                "Selecione um atleta", "SISTEMA FUTEBOL",
                JOptionPane.QUESTION_MESSAGE, null, nomesAtletas,
                "").toString();
        
        for(int j = 0; j < Atletas.atual; j++){
            if(nomesAtletas[j].equals(mostrar)){
                
            }
        }
    }
}
