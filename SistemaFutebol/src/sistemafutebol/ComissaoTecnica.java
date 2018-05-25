
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
                                            "2 - Cadastro de desempenho individual\n" +)        
                                            "2 - Busca por posi��o\n" +
                                            "3 - Busca por nome\n" +
        );
        switch(subMenuComissao){
            case 1:
                listar();
                break;
            case 2:
                cadastrarDesempenhoIndividual();
                break;
            case 3:
                buscarPeloNome();
                break;
            case 4:
                
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
        String buscaPosicao = JOptionPane.showInputDialog("Informe a posicao do jogador");
        String posicaoBuscada = "";
        for(int i = 0; i < Atletas.atual; i++){
            if(Atletas.posicoes[i].contains(buscaPosicao)){
                posicaoBuscada += Atletas.nomes[i] + "\n";
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
    
    public void cadastrarDesempenhoIndividual(int posicao){
              
        Object[] nomesListados = new Object[Atletas.atual];
        
        for(int i = 0; i < Atletas.atual; i++){
            nomesListados[i] = Atletas.nomes[i] + "\n";
        }
        
        posicao = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Selecione um atleta", "SISTEMA FUTEBOL",
                JOptionPane.QUESTION_MESSAGE, null, nomesListados,
                "").toString()
        );
        
            golsMarcados[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de gols marcados pelo jogador: " + Atletas.nomes[contador])
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
    
    public static void mostrarDesempenho(int contador){
        int opcao = Integer.parseInt(
                JOptionPane.showInputDialog("1 - Buscar por nome" + 
                                             "\n2 - Buscar por posi��o")        
        );
        
        switch(opcao){
            case 1: 
                buscarPeloNome();
                if(!Atletas.posicoes[contador].equalsIgnoreCase("goleiro")){
                    JOptionPane.showMessageDialog(null, "Jogador: " + 
                                                        "\nGols marcados: " + 
                                                        "\nDist�ncia percorrida: " +
                                                        "\nCart�es amarelos: " + 
                                                        "\nCart�es vermelhos: " +
                                                        "\nN�mero de jogos: " + 
                                                        "\nAssist�ncias: " + 
                                                        "\nPasses: " + 
                                                        "\nPasses certos em %: " + 
                                                        "\nFaltas cometidas: " + 
                                                        "\nFaltas sofridas: "
                    );
                }else if(Atletas.posicoes[contador].equalsIgnoreCase("goleiro")){
                    JOptionPane.showMessageDialog(null, "Jogador: " + 
                                                        "\nGols sofridos: " + 
                                                        "\nP�naltis defendidos: " +
                                                        "\nP�naltis convertidos: " + 
                                                        "\nDefesas dif�ceis: " +
                                                        "\nN�mero de jogos: " 
                                                        
                    );                   
                }                                                   
                break;
            case 2:
                buscarPelaPosicao();
                if(!Atletas.posicoes[contador].equalsIgnoreCase("goleiro")){
                    JOptionPane.showMessageDialog(null, "Jogador: " + 
                                                        "\nGols marcados: " + 
                                                        "\nDist�ncia percorrida: " +
                                                        "\nCart�es amarelos: " + 
                                                        "\nCart�es vermelhos: " +
                                                        "\nN�mero de jogos: " + 
                                                        "\nAssist�ncias: " + 
                                                        "\nPasses: " + 
                                                        "\nPasses certos em %: " + 
                                                        "\nFaltas cometidas: " + 
                                                        "\nFaltas sofridas: "
                    );
                }else if(Atletas.posicoes[contador].equalsIgnoreCase("goleiro")){
                    JOptionPane.showMessageDialog(null, "Jogador: " + 
                                                        "\nGols sofridos: " + 
                                                        "\nP�naltis defendidos: " +
                                                        "\nP�naltis convertidos: " + 
                                                        "\nDefesas dif�ceis: " +
                                                        "\nN�mero de jogos: " 
                                                        
                    );                   
                }                                                   
                break;
            default:
                JOptionPane.showMessageDialog(null, "Op��o inv�lida!!");
                
        }        
    }
}
