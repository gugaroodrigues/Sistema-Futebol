package sistemafutebol;

import javax.swing.JOptionPane;

/**
 *
 * @author Thiago/Gustavo
 */
public class Estatísticas {
    
    public void gerenciarEstatistica(){
        int opcao = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                "SISTEMA FUTEBOL", 0, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
                    "Cadastrar Goleiro",
                    "Cadastrar Jogador",
                    "Mostrar"}, "");
        
        switch(opcao){
            case 0: 
                cadastrarEstatisticasGoleiro();
                break;
            case 1: 
                cadastrarEstatisticasLinha();
                break;
            case 2: 
                mostrarEstatisticasTime();
                break;
            case 3:
                mostrarEstatisticasJogador();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida!!");
        }
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
    int golsSofridosTime = 0;
    int defesasDificeisTime = 0;
    int penaltisConvertidosTime = 0;
    int penaltisDefendidosTime = 0;
    int golsTime = 0;
    int distanciaPercorridaTime = 0;
    int cartoesAmarelosTime = 0;
    int cartoesVermelhosTime = 0;
    int passesTotalTime = 0;
    int faltasCometidasTime = 0;
    int faltasSofridasTime = 0;
    int passesCertosTime = 0;
    
        
    public void cadastrarEstatisticasGoleiro(){
        Object[] goleiros = new Object[Atletas.atual];
        
        for(int i = 0; i < Atletas.atual; i++){
            if(Atletas.posicoes[i].equals("GOLEIRO")){
                goleiros[i] = Atletas.nomes[i];
            }else{
                JOptionPane.showMessageDialog(null, "Não há goleiros cadastrados!");
            }
        }
        
        int posicao = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Selecione um atleta", "SISTEMA FUTEBOL",
                JOptionPane.QUESTION_MESSAGE, null, goleiros,
                "").toString()
        );
        
            golsSofridos[posicao] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o n�mero de gols sofridos")
            );
            
            golsSofridosTime += golsSofridos[posicao]; 
            
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
    }
    
    public void cadastrarEstatisticasLinha(){
        Object[] linhas = new Object[Atletas.atual];
        
        for(int i = 0; i < Atletas.atual; i++){
            if(!Atletas.posicoes[i].equals("GOLEIRO")){
                linhas[i] = Atletas.nomes[i];
            }else{
                JOptionPane.showMessageDialog(null, "Não há jogadores de linha cadastrados!");
            }
        }
        
        int posicao = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Selecione um atleta", "SISTEMA FUTEBOL",
            JOptionPane.QUESTION_MESSAGE, null, linhas,
            "").toString()
        );
        
        golsMarcados[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de gols marcados pelo jogador: " + Atletas.nomes[posicao])
        );
        
        golsTime += golsMarcados[posicao];

        distanciaPercorrida[posicao] = Double.parseDouble(
                JOptionPane.showInputDialog("Informe a distância percorrida por jogo.")
        );
        
        distanciaPercorridaTime += distanciaPercorrida[posicao];

        cartoesAmarelos[posicao] = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o n�mero de cart�es amarelos")
        );
        
        cartoesAmarelosTime += cartoesAmarelos[posicao];

        cartoesVermelhos[posicao] = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o n�mero de cart�es vermelhos")
        );
        
        cartoesVermelhosTime += cartoesVermelhos[posicao];

        numeroJogos[posicao] = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o n�mero de jogos do jogador")
        );

        assistencias[posicao] = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o n�mero de assist�ncias")
        );
        
        passesJogador[posicao] = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o n�mero de passes do jogador")
        );
        
        passesTotalTime += passesJogador[posicao];

        passesCertos[posicao] = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o n�mero de passes certos do jogador")
        );
        
        passesCertosTime += passesCertos[posicao];

        //fazer porcentagem de passes certos em rela��o ao total de passes

        faltasCometidas[posicao] = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o n�mero de faltas cometidas")
        );
        
        faltasCometidasTime += faltasCometidas[posicao];

        faltasSofridas[posicao] = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o n�mero de faltas sofridas")
        );
        
        faltasSofridasTime += faltasSofridas[posicao];
    }
    public void mostrarEstatisticasTime(){
        JOptionPane.showMessageDialog(null, 
                "Total de gols marcados: " + golsTime
                + "\nDistância total percorrida: " + distanciaPercorridaTime
                + "\nTotal cartões amarelos: " + cartoesAmarelosTime
                + "\nTotal cartões vermelhos: " + cartoesVermelhosTime
                + "\nTotal de passes do time: " + passesTotalTime
                + "\nTotal de passes certos: " + passesCertosTime
                + "\nTotal de faltas cometidas: " + faltasCometidasTime
                + "\nTotal de faltas sofridas: " + faltasSofridasTime
        );
    }
    
    public void mostrarEstatisticasJogador(){
        
    }
    
}
