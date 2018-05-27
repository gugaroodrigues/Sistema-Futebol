

package sistemafutebol;

//@author Gustavo / Thiago;

import javax.swing.JOptionPane;


public class SistemaFutebol {
    
    Atletas menuAtletas = new Atletas();
    ComissaoTecnica menuComissaoTecnica = new ComissaoTecnica();
    Escalacao menuEscalacao = new Escalacao();

 
    public void apresentarMenu(){
       int menu = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                "SISTEMA FUTEBOL",0, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
                 "Atletas",
                "Comissão técnica",
                "Escalaçãoo",
               "Estatísticas",
                "SAIR"}, "SAIR");
       while(menu !=4){
           switch(menu){
               case 0 :
                   menuAtletas.gerenciarAtletas();
                   break;
               case 1 :
                   menuComissaoTecnica.gerenciarComissao();
                   break;
               case 2 :
                   menuEscalacao.gerenciarEscalacao();
                 break;
               case 3 :
                   break;
               case 4 :
                   break;
               default: JOptionPane.showMessageDialog(null,"Opção inválida");
           }
           
            menu = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                "SISTEMA FUTEBOL",0, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
                 "Atletas",
                "Comissão t�cnica",
                "Escala��o",
               "Estatísticas",
                "SAIR"}, "SAIR");
       }
    }
    
}
