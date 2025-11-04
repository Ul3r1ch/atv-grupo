package br.com.senai.infob.loja.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.senai.infob.loja.models.Usuario;
import br.com.senai.infob.loja.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
     @Autowired
    public UsuarioService usuarioService;

    @PostMapping("/salvar")
    public Usuario salvar (@RequestBody Usuario usuario, @RequestParam String senha) {    
        return usuarioService.salvar(usuario,senha);
    }


    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha){
    return usuarioService.login(email, senha);
}
}
    

