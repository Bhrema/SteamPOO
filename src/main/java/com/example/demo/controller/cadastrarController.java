
import com.example.demo.entity.Biblioteca;
import com.example.demo.entity.CarrinhoDeCompras;
import com.example.demo.entity.Desenvolvedor;
import com.example.demo.entity.Usuario;
import com.example.demo.entity.Jogador;


import org.springframework.web.bind.annotation.*;


@PostMapping("/cadastrarUsuario")
public String cadastrarUsuario(@RequestParam String nome, @RequestParam String email, @RequestParam String senha, @RequestParam String confirmarSenha, @RequestParam String pais, @RequestParam boolean isDesenvolvedor) {
    if (!senha.equals(confirmarSenha)) {
        // As senhas não coincidem
        return "redirect:/cadastrarUsuario";
    }
    Usuario usuario;
    if (isDesenvolvedor) {
        usuario = new Desenvolvedor(nome, email, senha, new CarrinhoDeCompras(), new Biblioteca());
    } else {
        usuario = new Jogador(nome, email, senha, new CarrinhoDeCompras(), new Biblioteca());
    }

    // Salve o usuário no banco de dados aqui

    return "redirect:/";
}

public void main() {
}