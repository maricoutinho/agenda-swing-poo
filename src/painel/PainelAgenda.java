package painel;

import modelo.Agenda;

import javax.swing.*;
import java.awt.*;

public class PainelAgenda extends JPanel {

    private JList<String> listaContatos;
    private DefaultListModel<String> modelLista;

    public PainelAgenda(Agenda agenda) {
        setLayout(new BorderLayout());
        modelLista = new DefaultListModel<>();
        listaContatos = new JList<>(modelLista);
        add(new JScrollPane(listaContatos), BorderLayout.CENTER);

        for (String contactName : agenda.getContatos().keySet()) {
            modelLista.addElement(contactName);
        }
    }

    public JList<String> getListaContatos() {
        return listaContatos;
    }

    public DefaultListModel<String> getModelLista() {
        return modelLista;
    }
}
