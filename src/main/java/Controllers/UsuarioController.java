package Controllers;

import Models.Usuario;
import java.util.ArrayList;
import java.util.List;


public class UsuarioController {
//    private final List<Usuario> usuarios;
    private static final List<Usuario> usuarios = new ArrayList<>();
    
   public static List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public static void adicionarNovoUsuario(String nome, String email, String cpf, String senha, boolean isAdmin) {
        Usuario usuario = new Usuario(nome, email, cpf, senha, isAdmin);
        usuarios.add(usuario);
        System.out.println("Usuário adicionado: " + nome); // Log para verificar o cadastro
    }

    public Usuario autenticarUsuario(String email, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                return usuario; 
            }
        }
        return null;
    }

    public List<Usuario> getTodosUsuarios() {
        return new ArrayList<>(usuarios);
    }
    
    public void listarUsuarios() {
    if (usuarios.isEmpty()) {
        System.out.println("Nenhum usuário cadastrado.");
    } else {
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNome() + ", Email: " + usuario.getEmail() + ", CPF: " + usuario.getCpf());
        }
    }
    }
    
    
}
