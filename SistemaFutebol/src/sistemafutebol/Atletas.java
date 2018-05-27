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
    static int atual = 0;

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
                listar();
                break;
            case 2:
                editar();

                break;
            case 3:
                buscarMenuAtletas();
                break;
            case 4:

                break;

        }

    }

    public void listar() {
        String[] jogador = new String[atual];
        for (int i = 0; i < atual; i++) {
            jogador[i] = nomes[i] + "\n";
        }

        String jogadores = JOptionPane.showInputDialog(null,
                "Selecione um atleta", "SISTEMA FUTEBOL",
                JOptionPane.QUESTION_MESSAGE, null, jogador,
                "").toString();

        int menuListar = JOptionPane.showOptionDialog(null, "Selecione uma Opção",
                "SISTEMA FUTEBOL", 0, JOptionPane.INFORMATION_MESSAGE, null,
                new Object[]{
                    "Editar",
                    "Informações"}, "");
        switch (menuListar) {
            case 0:
                editar();
                break;
            case 1:
                menuInformacao();
                break;

        }

    }

    public void cadastrar() {
        solicitarInformacao(atual);

        atual++;
    }

    public void menuInformacao() {
        Object[] informacaoAtletas = new Object[atual];
        for (int i = 0; i < atual; i++) {
            informacaoAtletas[i] = nomes[i];
        }

        String apresentacao = JOptionPane.showInputDialog(null,
                "Selecione um Atleta ", "SISTEMA FUTEBOL",
                JOptionPane.QUESTION_MESSAGE, null, informacaoAtletas,
                "").toString();
        for (int i = 0; i < atual; i++) {
            if (informacaoAtletas[i].equals(apresentacao)) {
                apresentarInformacao(i);
            }
        }

    }

    public void apresentarInformacao(int posicao) {

        JOptionPane.showMessageDialog(null, "Nome Atleta: "
                + nomes[posicao]
                + "\nIdade: " + idades[posicao]
                + "\nPeso: " + pesos[posicao]
                + "\nAltura: " + alturas[posicao]
                + "\nPosição do Atleta: " + posicoes[posicao]
                + "\nSituação do atleta com o club: " + situacoes[posicao]
                + " \nTipo de contrato: " + contratos[posicao]
                + "\nTime anterior: " + timeAnterior[posicao], "SISTEMA FUTEBOL",
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

    public void buscarMenuAtletas() {
        int buscarAtletas = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                "SISTEMA FUTEBOL", 0, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
                    "Buscar por posição",
                    "Buscar por nome"}, "");

        switch (buscarAtletas) {
            case 0:
                buscarAtletasPelaPosicao();
                break;
            case 1:
                buscarPeloNome();
                break;
        }
    }

    public void buscarAtletasPelaPosicao() {
        String buscaAtletasPosicao = JOptionPane.showInputDialog(null, "Selecione a posição do atleta", "SISTEMA FUTEBOL",
                JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "GOLEIRO",
                    "ZAGUEIRO",
                    "LATERAL",
                    "MEIA",
                    "ATACANTE"},
                "").toString();
        String posicaoAtletasBuscada = "";
        for (int i = 0; i < atual; i++) {
            if (posicoes[i].contains(buscaAtletasPosicao)) {
                posicaoAtletasBuscada += nomes[i] + "\n";
            }

        }
        if (posicaoAtletasBuscada.equals("")) {
            JOptionPane.showMessageDialog(null, "Não há atletas cadastrados nesta posição");
        } else {
            JOptionPane.showMessageDialog(null, posicaoAtletasBuscada);
        }
    }

    public void buscarPeloNome() {
        String buscaAtletaNome = JOptionPane.showInputDialog("Informe o nome do jogador").toUpperCase().trim();
        String nomeAtletaBuscado = "";
        for (int i = 0; i < atual; i++) {
            if (nomes[i].contains(buscaAtletaNome)) {
                nomeAtletaBuscado += nomes[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, nomeAtletaBuscado);
    }

    public void solicitarInformacao(int posicao) {
        nomes[posicao] = JOptionPane.showInputDialog("Nome do Atleta", nomes[posicao]).toUpperCase().trim();
        idades[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Idade:", idades[posicao]));
        pesos[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Peso:", pesos[posicao]));
        alturas[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Altura: ", alturas[posicao]));
        posicoes[posicao] = JOptionPane.showInputDialog(null, "Selecione a posição ", "SISTEMA FUTEBOL",
                JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "GOLEIRO",
                    "ZAGUEIRO",
                    "LATERAL",
                    "MEIA",
                    "ATACANTE"},
                "").toString();
        situacoes[posicao] = JOptionPane.showInputDialog(null, "Situação do Jogador", "SISTEMA FUTEBOL",
                JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "Cedido ao clube ",
                    "Cedido pelo clube",
                    "Contrato Vigente",
                    "Em Contratação"
                    },
                "").toString();
        contratos[posicao] = JOptionPane.showInputDialog(null, "Informe o tempo de contrato", "SISTEMA FUTEBOL",
                JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "6 MESES",
                    "1 ANO",
                    "2 ANOS",
                    "3 ANOS",
                    "4 ANOS",
                    "5 ANOS"},
                "").toString();
        timeAnterior[posicao] = JOptionPane.showInputDialog("Time anterior", timeAnterior[posicao]).toUpperCase().trim();

    }

}
