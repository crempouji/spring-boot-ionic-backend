package com.nelioalves.cursomc.dto;

import com.nelioalves.cursomc.domain.Categoria;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;


@Getter
@Setter
public class CategoriaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    @NotEmpty(message = "Nomes vazios nao sao permitidos")
    @Length(min = 5, max = 80, message = "Precisa ter entre 5 e 80 caracteres")
    private String nome;

    public CategoriaDTO() {
    }

    public CategoriaDTO(Categoria obj) {
        id = obj.getId();
        nome = obj.getNome();
    }
}
