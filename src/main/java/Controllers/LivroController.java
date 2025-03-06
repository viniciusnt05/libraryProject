package Controllers;

import Models.Livro;
import java.util.ArrayList;
import java.util.List;

public class LivroController {
    private static final List<Livro> livros = new ArrayList<>();

    public static void adicionarLivro(String titulo, String autor, double valor) {
        Livro livro = new Livro(titulo, autor, valor);
        livros.add(livro);
    }

    public static void atualizarLivro(int id, String titulo, String autor, double valor, boolean disponivel) {
        Livro livro = buscarLivroPorId(id);
        if (livro != null) {
            livro.setTitulo(titulo);
            livro.setAutor(autor);
            livro.setValor(valor);
            livro.setDisponivel(disponivel);
            System.out.println("Livro atualizado: " + titulo);
        } else {
            System.out.println("Livro não encontrado!");
        }
    }

    public static void removerLivroPorID(int id) {
        livros.removeIf(livro -> livro.getId() == id);
    }

    public static List<Livro> getLivros() {
        return livros;
    }

    public static void alugarLivro(int id, String nomeUsuario) {
        Livro livro = buscarLivroPorId(id);
        if (livro != null && livro.isDisponivel()) {
            livro.alugar(nomeUsuario);
            System.out.println("Livro alugado: " + livro.getTitulo() + " por " + nomeUsuario);
        } else {
            System.out.println("Livro não disponível para aluguel.");
        }
    }

    public static void venderLivro(int id, String nomeUsuario) {
        Livro livro = buscarLivroPorId(id);
        if (livro != null && livro.isDisponivel()) {
            livro.vender(nomeUsuario);
            System.out.println("Livro vendido: " + livro.getTitulo() + " por " + nomeUsuario);
        } else {
            System.out.println("Livro não disponível para venda.");
        }
    }

    public static String getHistoricoTransacoes(int id) {
        Livro livro = buscarLivroPorId(id);
        return livro != null ? livro.getDetalhesTransacao() : "Livro não encontrado";
    }

    public static Livro buscarLivroPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }
}
