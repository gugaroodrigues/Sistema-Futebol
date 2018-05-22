package sistemafutebol;
//@author Alunos

import javax.swing.JOptionPane;

public class Atletas {

    static String[] nomes = new String[30];
    int[] idades = new int[nomes.length];
    double[] pesos = new double[nomes.length];
    double[] alturas = new double[nomes.length];
    static String[] posicoes = new String[nomes.length];
    String[] situacoes = new String[nomes.length];
    String[] contratos = new String[nomes.length];
    String[] timeAnterior = new String[nomes.length];
    int[] camisa =  new int[nomes.length];
    int atual = 0;
        
  
    public void gerenciarAtletas(){
        int subMenuAtleta = Integer.parseInt(JOptionPane.showInputDialog(null,
                 " 1 - Cadastrar Atleta\n"
                +" 2 - Listar\n"
                +" 3 - Editar\n "
                +"4 - Buscar\n"));
        switch (subMenuAtleta){
            case 1: 
                cadastrar();
                break;  
            case 2: 
                ComissaoTecnica.listar();
                break;  
            case 3:
                ComissaoTecnica.buscarPelaPosicao();
                break;  
            case 4: 
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
    
    public void apresentarInformacao(){
        
        JOptionPane.showMessageDialog(null, "Nome Atleta: " + 
                nomes[atual] + "\nIdade: " + idades[atual] + "\nPeso: " + pesos[atual]
        + "\nAltura: " + alturas[atual] + "\nPosição do Atleta " + posicoes[atual] + 
          "\nSituação do atleta com o club" + situacoes[atual] + " \nTipo de contrato "
        + contratos[atual] + "\nTime anterior " + timeAnterior[atual], "SISTEMA FUTEBOL",
        JOptionPane.INFORMATION_MESSAGE);
         
    }
    

}
