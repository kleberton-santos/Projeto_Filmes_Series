package br.com.ada.gerenciadorFIlmesSeries.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    // validação de dados campos nao entram em branco e vazio
    @NotBlank
    private String nome;
    private String ano;

    @ManyToOne
    private Genero genero;

    @ManyToMany(mappedBy = "filmes")
    private Set<ListaFilmes> filmes;


}
