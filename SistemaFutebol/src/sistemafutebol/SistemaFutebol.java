

package sistemafutebol;

//@author Gustavo / Thiago;

import javax.swing.JOptionPane;


public class SistemaFutebol {

 
    public void apresentarMenu(){
       int menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                 " 1 - Atletas\n"
                +" 2 - Comissão técnica\n"
                +" 3 - Escalação\n "
                +" 4 - Análise de Desempenho\n"
                +" 5 - Sair"));
       while(menu !=5){
           switch(menu){
               case 1 :
                   break;
               case 2 :
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
