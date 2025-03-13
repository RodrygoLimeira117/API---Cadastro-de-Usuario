package com.exemplo.usuarios;

import java.io.*;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository {

    private final String FILE_NAME = "usuarios.dat";
    private Map<Long, Usuario> usuarios = new HashMap<>();

    public UsuarioRepository() {
        carregar();
    }

    public List<Usuario> findAll() {
        return new ArrayList<>(usuarios.values());
    }

    public Usuario save(Long id, Usuario usuario) {
        usuarios.put(id, usuario);
        salvar();
        return usuario;
    }

    public void delete(Long id) {
        usuarios.remove(id);
        salvar();
    }

    private void salvar() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(usuarios);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void carregar() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            usuarios = (Map<Long, Usuario>) in.readObject();
        } catch (Exception e) {
            usuarios = new HashMap<>();
        }
    }
}
