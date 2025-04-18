package com.security.app.seguranca.controller;


import com.security.app.seguranca.dto.UsuarioDto;
import com.security.app.seguranca.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UsuarioService service;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid UsuarioDto usuarioDto){
        UsernamePasswordAuthenticationToken usernamePassword =
                new UsernamePasswordAuthenticationToken(usuarioDto.email(), usuarioDto.senha());

        Authentication auth = authenticationManager.authenticate(usernamePassword);

        return ResponseEntity.ok().build();


    }

   // @PostMapping("/register")
   // public ResponseEntity registrar (@RequestBody @Valid UsuarioDto usuarioDto){
//
//        UsuarioDto usuarioSalvo = null;
//        usuarioSalvo = service.salvarUsuario(usuarioDto);
//
//        return ResponseEntity.ok(usuarioSalvo);
//
//    }



}
