package br.com.senai.infob.loja.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.infob.loja.models.Usuario;
import br.com.senai.infob.loja.repositories.UsuarioRepository;

@Service
public class UsuarioService {
  @Autowired
public UsuarioRepository usuarioRepository;


public String login(String email, String senha) {
   Usuario usuario = usuarioRepository.findByEmail(email);
    if(usuario != null && senha.equals(usuario.getSenha())){
        return "login efetuado com sucesso";
    }
    return "falha ao encontrar o login";
}
    public Usuario salvar (Usuario usuario, String senha){
    if (usuario.getSenha().equals(senha)){
        return usuarioRepository.save(usuario);

    }
    return null;
}

   public Usuario atualizarUsuario(Usuario usuario, Integer id){
         Usuario e = usuarioRepository.findById(id).get();
         if (e != null){
            usuario.setId(e.getId());
            usuarioRepository.save(usuario);
            return usuario;
         }
         return null;
    }

       public Usuario getId(Integer id){
        return usuarioRepository.findById(id).get(); }

    
}


 