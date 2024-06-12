package painel;

import javax.swing.*;
import java.awt.*;

public class PainelInformacoes extends JPanel {

    private JTextField nome;
    private JTextField telefone;
    private JTextArea detalhes;
    private JButton botaoAdiciona;
    private JButton botaoRemove;
    private JButton botaoAtualiza;

    public PainelInformacoes() {
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Nome:"));
        nome = new JTextField();
        add(nome);

        add(new JLabel("Telefone:"));
        telefone = new JTextField();
        add(telefone);

        add(new JLabel("Detalhes:"));
        detalhes = new JTextArea(5, 20);
        add(new JScrollPane(detalhes));

        botaoAdiciona = new JButton("Adiciona");
        add(botaoAdiciona);

        botaoRemove = new JButton("Remove");
        add(botaoRemove);

        botaoAtualiza = new JButton("Atualiza");
        add(botaoAtualiza);
    }

    public JTextField getNome() {
        return nome;
    }

    public void setNome(JTextField nome) {
        this.nome = nome;
    }

    public JTextField getTelefone() {
        return telefone;
    }

    public void setTelefone(JTextField telefone) {
        this.telefone = telefone;
    }

    public JTextArea getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(JTextArea detalhes) {
        this.detalhes = detalhes;
    }

    public JButton getBotaoAdiciona() {
        return botaoAdiciona;
    }

    public void setBotaoAdiciona(JButton botaoAdiciona) {
        this.botaoAdiciona = botaoAdiciona;
    }

    public JButton getBotaoRemove() {
        return botaoRemove;
    }

    public void setBotaoRemove(JButton botaoRemove) {
        this.botaoRemove = botaoRemove;
    }

    public JButton getBotaoAtualiza() {
        return botaoAtualiza;
    }

    public void setBotaoAtualiza(JButton botaoAtualiza) {
        this.botaoAtualiza = botaoAtualiza;
    }
}