

package sistemafutebol;

//@author Gustavo / Thiago;

import javax.swing.JOptionPane;


public class SistemaFutebol {
    
    Atletas menuAtletas = new Atletas();
    ComissaoTecnica menuComissaoTecnica = new ComissaoTecnica();

 
    public void apresentarMenu(){
       int menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                 " 1 - Atletas\n"
                +" 2 - Comissão t�cnica\n"
                +" 3 - Escala��o\n "
               +"4 - An�lise de Desempenho\n"
                +" 5 - Sair"));
       while(menu !=5){
           switch(menu){
               case 1 :menuAtletas.gerenciarAtletas();
                   break;
               case 2 :menuComissaoTecnica.gerenciarComissao();
                   break;
               case 3 :
                   break;
               case 4 :
                   break;
               case 5 :
                   break;
               default: JOptionPane.showMessageDialog(null,"Opção inválida");
           }
           
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                 " 1 - Atletas\n"
                +" 2 - Comissão técnica\n"
                +" 3 - Escalação\n "
                +" 4 - Análise de Desempenho\n"
                +" 5 - Sair"));
       }
    }
    
}
