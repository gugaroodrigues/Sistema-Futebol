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
                cadastrar(atual);
                break;
            case 1:
               ComissaoTecnica.listar(atual);
                break;
            case 2:
                editar(atual);

                break;
            case 3:
                ComissaoTecnica.buscar();
                break;

        }

    }

    public void cadastrar(int posicao) {
        nomes[posicao] = JOptionPane.showInputDialog("Nome do Atleta");
        idades[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        pesos[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
        alturas[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        posicoes[posicao] = JOptionPane.showInputDialog("Posição do Atleta");
        situacoes[posicao] = JOptionPane.showInputDialog("Situação do atleta com o club");
        contratos[posicao] = JOptionPane.showInputDialog("Tipo de contrato");
        timeAnterior[posicao] = JOptionPane.showInputDialog("Time anterior");

        atual++;
    }

    public void apresentarInformacao() {

        JOptionPane.showMessageDialog(null, "Nome Atleta: "
                + nomes[atual]
                + "\nIdade: " + idades[atual]
                + "\nPeso: " + pesos[atual]
                + "\nAltura: " + alturas[atual]
                + "\nPosição do Atleta " + posicoes[atual]
                + "\nSituação do atleta com o club" + situacoes[atual]
                + " \nTipo de contrato " + contratos[atual]
                + "\nTime anterior " + timeAnterior[atual], "SISTEMA FUTEBOL",
                JOptionPane.INFORMATION_MESSAGE);

    }

    public void editar(int posicao) {

        Object[] nomesAtletas = new Object[atual];
        for (int i = 0; i < atual; i++) {
            nomesAtletas[i] = nomes[i];
        }
        int auxiliar = 0;
        String edicao = JOptionPane.showInputDialog(null,
                "Selecione um atleta para editar", "SISTEMA FUTEBOL",
                JOptionPane.QUESTION_MESSAGE, null, nomesAtletas,
                "").toString();
        if (auxiliar < nomesAtletas.length) {
            cadastrar(auxiliar);
            auxiliar++;

        }
    }

}
