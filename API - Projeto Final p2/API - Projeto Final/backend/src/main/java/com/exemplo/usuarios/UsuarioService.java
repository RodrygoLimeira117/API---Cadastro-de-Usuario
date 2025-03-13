package com.exemplo.usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    private AtomicLong idGenerator = new AtomicLong();

    public List<Usuario> listar() {
        return repository.findAll();
    }

    public Usuario adicionar(Usuario usuario) {
        Long id = idGenerator.incrementAndGet();
        usuario.setId(id);
        return repository.save(id, usuario);
    }

    public Usuario atualizar(Long id, Usuario usuario) {
        usuario.setId(id);
        return repository.save(id, usuario);
    }

    public void deletar(Long id) {
        repository.delete(id);
    }
}
