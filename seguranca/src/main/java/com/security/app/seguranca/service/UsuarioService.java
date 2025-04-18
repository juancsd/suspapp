package com.security.app.seguranca.service;

import com.security.app.seguranca.dto.UsuarioDto;
import com.security.app.seguranca.model.Usuario;
import com.security.app.seguranca.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


}
