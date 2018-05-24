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
    int[] camisa = new int[nomes.length];
    int atual = 0;

    public void gerenciarAtletas() {
        int subMenuAtleta = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                "SISTEMA FUTEBOL", 0, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
                    "Cadastrar",
                    "Listar",
                    "Editar",
                    "Buscar"}, "");
        switch (subMenuAtleta) {
            case 0:
                cadastrar();
                break;
            case 1:
               
                break;
            case 2:
                editar();

                break;
            case 3:
                ComissaoTecnica.buscar();
                break;

        }

    }

    public void cadastrar() {
        solicitarInformacao(atual);

        atual++;
    }

    public void apresentarInformacao(int posicao) {

        JOptionPane.showMessageDialog(null, "Nome Atleta: "
                + nomes[posicao]
                + "\nIdade: " + idades[posicao]
                + "\nPeso: " + pesos[posicao]
                + "\nAltura: " + alturas[posicao]
                + "\nPosição do Atleta " + posicoes[posicao]
                + "\nSituação do atleta com o club" + situacoes[posicao]
                + " \nTipo de contrato " + contratos[posicao]
                + "\nTime anterior " + timeAnterior[posicao], "SISTEMA FUTEBOL",
                JOptionPane.INFORMATION_MESSAGE);

    }

    public void editar() {

        Object[] nomesAtletas = new Object[atual];
        for (int i = 0; i < atual; i++) {
            nomesAtletas[i] = nomes[i];
        }

        String edicao = JOptionPane.showInputDialog(null,
                "Selecione um atleta para editar", "SISTEMA FUTEBOL",
                JOptionPane.QUESTION_MESSAGE, null, nomesAtletas,
                "").toString();
        for (int i = 0; i < atual; i++) {
            if (nomesAtletas[i].equals(edicao)) {
                solicitarInformacao(i);
            }
        }
    }

    public void solicitarInformacao(int posicao) {
        nomes[posicao] = JOptionPane.showInputDialog("Nome do Atleta", nomes[posicao]);
        idades[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Idade:", idades[posicao]));
        pesos[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Peso:",pesos[posicao]));
        alturas[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Altura: ", alturas[posicao]));
        posicoes[posicao] = JOptionPane.showInputDialog("Posição do Atleta", posicoes[posicao]);
        situacoes[posicao] = JOptionPane.showInputDialog("Situação do atleta com o club", situacoes[posicao] );
        contratos[posicao] = JOptionPane.showInputDialog("Tipo de contrato", contratos[posicao]);
        timeAnterior[posicao] = JOptionPane.showInputDialog("Time anterior", timeAnterior[posicao] );

    }

}
