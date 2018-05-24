
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
                                            "2 - Busca por posi��o\n" +
                                            "3 - Busca por nome\n" +
                                            "4 - Cadastro de desempenho individual\n")        
        );
        switch(subMenuComissao){
            case 1:
                listar();
                break;
            case 2:
                buscarPelaPosicao();
                break;
            case 3:
                buscarPeloNome();
                break;
            case 4:
                cadastrarDesempenhoIndividual(contador);
                break;
            default: 
                JOptionPane.showMessageDialog(null, "Op��o Inv�lida!!");
                
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
    
    public static void buscar(){
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
    
    public static void buscarPeloNome(){
        String buscaPosicao = JOptionPane.showInputDialog("Informe o nome do jogador");
        String nomeBuscado = "";
        for(int j = 0; j < Atletas.nomes.length; j++){
            if(Atletas.posicoes[j].contains(buscaPosicao)){
                nomeBuscado += Atletas.nomes[j] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, nomeBuscado);
    }
    
    int[] golsMarcados = new int[Atletas.nomes.length];
    int[] faltasCometidas = new int[Atletas.nomes.length];
    int[] faltasSofridas = new int[Atletas.nomes.length];
    int[] assistencias = new int[Atletas.nomes.length];
    int[] cartoesAmarelos = new int[Atletas.nomes.length];
    int[] cartoesVermelhos = new int[Atletas.nomes.length];
    int[] numeroJogos = new int[Atletas.nomes.length];
    int[] passesJogador = new int[Atletas.nomes.length];
    int[] passesCertos = new int[Atletas.nomes.length];
    int[] golsSofridos = new int[Atletas.nomes.length];
    int[] penaltisDefendidos = new int[Atletas.nomes.length];
    int[] penaltisConvertidos = new int[Atletas.nomes.length];
    int[] defesasDificeis = new int[Atletas.nomes.length];
    double[] distanciaPercorrida = new double[Atletas.nomes.length];
    
    public void cadastrarDesempenhoIndividual(int contador){
        buscarPeloNome();
        
        Object[] nomesListados = new Object[contador];
        
        for(int i = 0; i < contador; i++){
            nomesListados[contador] = Atletas.nomes[contador];
        }
        
        contador = JOptionPane.showOptionDialog(null,
                contador > 0 ? "Selecione o atleta"
                        : "Nenhum atleta cadastrado",
                "Atenção",
                0, JOptionPane.QUESTION_MESSAGE, null, nomesListados, "");
        
            golsMarcados[contador] = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de gols marcados pelo jogador: " + Atletas.nomes[contador])
            );

            distanciaPercorrida[contador] = Double.parseDouble(
                    JOptionPane.showInputDialog("Informe a dist�ncia percorrida por jogo.")
            );

            cartoesAmarelos[contador] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de cart�es amarelos")
            );

            cartoesVermelhos[contador] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de cart�es vermelhos")
            );

            numeroJogos[contador] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de jogos do jogador")
            );

            assistencias[contador] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de assist�ncias")
            );

            passesJogador[contador] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de passes do jogador")
            );

            passesCertos[contador] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de passes certos do jogador")
            );
            
            //fazer porcentagem de passes certos em rela��o ao total de passes
            
            faltasCometidas[contador] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de faltas cometidas")
            );

            faltasSofridas[contador] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de faltas sofridas")
            );
        
            golsSofridos[contador] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de gols sofridos")
            );
            
            defesasDificeis[contador] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de defesas dif�ceis")
            );
            
            penaltisDefendidos[contador] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de p�naltis defendidos")
            );
            
            penaltisConvertidos[contador] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de p�naltis convertidos")
            );
            
            numeroJogos[contador] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de jogos do jogador")
            );
            
            //fazer a porcentagem de penaltis defendidos           
        

        
        
        contador++;
        
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
