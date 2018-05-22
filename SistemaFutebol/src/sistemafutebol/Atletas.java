package sistemafutebol;
//@author Alunos

import javax.swing.JOptionPane;

public class Atletas {

    static String[] nomes = new String[30];
    int[] idades = new int[30];
    double[] pesos = new double[30];
    double[] alturas = new double[30];
    static String[] posicoes = new String[30];
    String[] situacoes = new String[30];
    String[] contratos = new String[30];
    String[] timeAnterior = new String[30];
    int atual = 0;
        
  
    public void gerenciarAtletas(){
        int subMenuAtleta = Integer.parseInt(JOptionPane.showInputDialog(null,
                 " 1 - Cadastrar Atleta\n"
                +" 2 - Listar\n"
                +" 3 - Editar\n "
                +" 4 - Buscar\n"));
        switch (subMenuAtleta){
            case 1: 
                cadastrar();
                break;

                
        }
            
    }      

    public void cadastrar() {
        nomes[atual] = JOptionPane.showInputDialog("Nome do Atleta");
        idades[atual] =Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        pesos[atual] = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
        alturas[atual] = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        posicoes[atual] = JOptionPane.showInputDialog("Posição do Atleta");
        situacoes[atual] = JOptionPane.showInputDialog("Situação do atleta com o club");
        contratos[atual] = JOptionPane.showInputDialog("Tipo de contrato");
        timeAnterior[atual] = JOptionPane.showInputDialog("Time anterior");
               
        atual++;
    }

}
