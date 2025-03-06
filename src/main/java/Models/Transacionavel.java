package Models;

public interface Transacionavel {
    void alugar(String nomeUsuario);
    void vender(String nomeUsuario); 
    String getStatusTransacao();
}
