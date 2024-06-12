package aplicacao;

import modelo.Agenda;
import modelo.Contato;
import painel.PainelAgenda;
import painel.PainelInformacoes;

import javax.swing.*;

public class AppAgenda extends JFrame {
    private Agenda agenda;
    private PainelAgenda painelAgenda;
    private PainelInformacoes painelInformacoes;

    public AppAgenda() {
        this.agenda = new Agenda();
        this.painelAgenda = new PainelAgenda(agenda);
        this.painelInformacoes = new PainelInformacoes();

        setTitle("Agenda");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, painelAgenda, painelInformacoes);
        splitPane.setDividerLocation(200);
        add(splitPane);

        painelAgenda.getListaContatos().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selecionado = painelAgenda.getListaContatos().getSelectedValue();
                if (selecionado != null) {
                    Contato contato = agenda.getContato(selecionado);
                    painelInformacoes.getNome().setText(contato.getNome());
                    painelInformacoes.getTelefone().setText(contato.getTelefone());
                    painelInformacoes.getDetalhes().setText(contato.getDetalhes());
                }
            }
        });

        painelInformacoes.getBotaoAdiciona().addActionListener(_ -> {
            String name = painelInformacoes.getNome().getText();
            String phone = painelInformacoes.getTelefone().getText();
            String details = painelInformacoes.getDetalhes().getText();

            Contato contato = new Contato(name, phone, details);
            agenda.adicionaContato(contato);
            painelAgenda.getModelLista().addElement(name);
        });


        painelInformacoes.getBotaoRemove().addActionListener(_ -> {
            String name = painelInformacoes.getNome().getText();
            agenda.removeContato(name);
            painelAgenda.getModelLista().removeElement(name);
            painelInformacoes.getNome().setText("");
            painelInformacoes.getTelefone().setText("");
            painelInformacoes.getDetalhes().setText("");
        });

        painelInformacoes.getBotaoAtualiza().addActionListener(_ -> {
            String name = painelInformacoes.getNome().getText();
            String phone = painelInformacoes.getTelefone().getText();
            String details = painelInformacoes.getDetalhes().getText();
            agenda.atualizaContato(name, phone, details);
        });
    }
}
