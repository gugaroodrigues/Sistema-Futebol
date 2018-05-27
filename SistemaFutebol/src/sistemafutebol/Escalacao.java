package sistemafutebol;

import javax.swing.JOptionPane;

// @author Gustavo Rodrigues
public class Escalacao {

    public void gerenciarEscalacao() {
        int submenuEscalacao = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                "SISTEMA FUTEBOL", 0, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
                    "Montar",
                    "Jogos"
                }, "");
        switch (submenuEscalacao) {
            case 0:
                menuMontarEscalacao();
                break;
            case 1:
                proximosJogos();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida!!");

        }

    }

    public void menuMontarEscalacao() {
        Object[] jogadores = new Object[Atletas.atual];
        
        for(int i = 0; i < Atletas.atual; i++){
            jogadores[i] = Atletas.nomes[i];
        }
        
        int titulares = 0;
        String[] iniciais = new String[Atletas.atual];
        String[] reservas = new String[Atletas.atual];
        
        while(titulares < 11){
            int escalar = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Selecione um atleta", "SISTEMA FUTEBOL",
                JOptionPane.QUESTION_MESSAGE, null, jogadores,
                "").toString()
            );
            
            for(int j = 0; j < Atletas.atual; j++){
                if(jogadores[j].equals(escalar)){
                    iniciais[j] = Atletas.nomes[j] + "\n";
                }
            }            
            titulares++;
        }

        for(int k = 0; k < Atletas.atual; k++){
            if(!jogadores[k].equals(iniciais[k])){
                reservas[k] = Atletas.nomes[k]; 
            }
        }
        JOptionPane.showMessageDialog(null, "Titulares: \n" + iniciais);
        
        JOptionPane.showMessageDialog(null, "Reservas: \n" + reservas);
    }
    
    public void proximosJogos(){
        int subMenuNovosJogos = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                "SISTEMA FUTEBOL", 0, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
                    "Cadastrar novos jogos"
                    }, "");
        
        switch(subMenuNovosJogos){
            case 0:
                cadastrarNovoJogo();
                break;
             default:
                JOptionPane.showMessageDialog(null, "Opção Inválida!!");
        }
    }
    
    public void cadastrarNovoJogo(){
        int opcao = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "Informe o número de jogos")
        );
        
        String[] novaData = new String[opcao];
        String datas = "";
        String[] adversario = new String[opcao];
        String adversarios = "";
        String mandantes = "Time";
        
        for(int i = 0; i < opcao; i++){
            novaData[i] = JOptionPane.showInputDialog(null, "Informe a data do jogo");
            datas += novaData[i] + "\n";
            adversario[i] = JOptionPane.showInputDialog(null, "Informe o adversário no jogo").toUpperCase().trim();
            adversarios += adversario[i] + "\n";
            mandantes += "\n";
        }
        
        JOptionPane.showMessageDialog(null, datas + ": " + mandantes + " x " + adversarios);
    }
}
