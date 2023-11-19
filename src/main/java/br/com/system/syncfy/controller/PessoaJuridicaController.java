package br.com.system.syncfy.controller;


import br.com.system.syncfy.model.dto.DadosCadastroPessoaJuridica;
import br.com.system.syncfy.model.entity.Endereco;
import br.com.system.syncfy.model.entity.PessoaJuridica;
import br.com.system.syncfy.model.entity.Segmento;
import br.com.system.syncfy.model.entity.Usuario;
import br.com.system.syncfy.model.repository.EnderecoRepository;
import br.com.system.syncfy.model.repository.PessoaJuridicaRepository;
import br.com.system.syncfy.model.repository.SegmentoRepository;
import br.com.system.syncfy.model.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class PessoaJuridicaController {

    @Autowired
    private PessoaJuridicaRepository pessoaJuridicaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private SegmentoRepository segmentoRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPessoaJuridica dados) {
        Usuario usuario = new Usuario(dados.usuario());
        Segmento segmento = new Segmento(dados.segmento());
        Endereco endereco = new Endereco(dados.endereco());

        usuarioRepository.save(usuario);
        segmentoRepository.save(segmento);
        enderecoRepository.save(endereco);

        PessoaJuridica pessoaJuridica = new PessoaJuridica(dados);
        pessoaJuridica.setUsuario(usuario);
        pessoaJuridica.setSegmento(segmento);
        pessoaJuridica.setEndereco(endereco);

        pessoaJuridicaRepository.save(pessoaJuridica);
    }
}
