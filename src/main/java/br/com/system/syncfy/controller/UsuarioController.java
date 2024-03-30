package br.com.system.syncfy.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/api")
public class UsuarioController {
    @GetMapping("/usuario")
    @ResponseBody
    public ResponseEntity<String> getNomeUsuarioLogado(HttpSession session) {
        String nomeUsuario = (String) session.getAttribute("usuarioLogado");
        if (nomeUsuario != null) {
            return ResponseEntity.ok(nomeUsuario);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Nenhum usuário logado");
        }
    }
}
