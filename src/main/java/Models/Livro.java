package Models;

public class Livro extends HistoricoTransacao implements Transacionavel {
    private static int contadorID = 1;
    private int id;
    private String titulo;
    private String autor;
    private double valor;
    private boolean disponivel = true;
    private String statusTransacao = "Disponível";


    public Livro(String titulo, String autor, double valor) {
        this.id = contadorID++;
        this.titulo = titulo;
        this.autor = autor;
        this.valor = valor;
        this.disponivel = true;
    }

    @Override
    public void alugar(String nomeUsuario) {
        if (disponivel) {
            disponivel = false;
            statusTransacao = "Alugado";
            adicionarTransacao("Alugado: " + titulo + " por " + nomeUsuario);
        } else {
            System.out.println("Livro não disponível para aluguel.");
        }
    }

    @Override
    public void vender(String nomeUsuario) {
        if (disponivel) {
            disponivel = false;
            statusTransacao = "Vendido";
            adicionarTransacao("Vendido: " + titulo + " por " + nomeUsuario);
        } else {
            System.out.println("Livro não disponível para venda.");
        }
    }

    @Override
    public String getStatusTransacao() {
        return statusTransacao;
    }

    @Override
    public String getDetalhesTransacao() {
        return "Transações para o livro: " + titulo + "\n" + String.join("\n", getHistoricoTransacoes());
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
        this.statusTransacao = disponivel ? "Disponível" : statusTransacao;
    }
}
