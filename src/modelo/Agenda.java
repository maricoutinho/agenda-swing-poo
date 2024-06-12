package modelo;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

    private Map<String, Contato> contatos;

    public Agenda() {
        contatos = new HashMap<>();
    }

    public void adicionaContato(Contato contact) {
        contatos.put(contact.getNome(), contact);
    }

    public void atualizaContato(String name, String phone, String details) {
        Contato contact = contatos.get(name);
        if (contact != null) {
            contact.setTelefone(phone);
            contact.setDetalhes(details);
        }
    }

    public void removeContato(String name) {
        contatos.remove(name);
    }

    public Contato getContato(String name) {
        return contatos.get(name);
    }

    public Map<String, Contato> getContatos() {
        return contatos;
    }

    public void setContatos(Map<String, Contato> contatos) {
        this.contatos = contatos;
    }
}
