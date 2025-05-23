package com.security.app.seguranca.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UsuarioDto (
        Long usuarioId,

        @NotBlank (message = "O nome do usuário é obrigatório.") String nome,

        @NotBlank (message = "O email é obrigatório.")
        @Email(message = "O formato do e-mail não é válido.") String email,

        @NotBlank (message = "A senha é obrigatória.")
        @Size(min = 6, max = 10, message = "A senha deve conter entre 6 e 10 caracteres.") String senha)


{
}
