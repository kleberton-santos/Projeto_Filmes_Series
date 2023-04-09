package br.com.ada.gerenciadorFIlmesSeries.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ListaFilmes {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String usuario;
    private String nome;
    private ListaFilmes lista;

    @ManyToMany
    @JoinTable(
            name = "lista_filmes",
            joinColumns = @JoinColumn(name = "filmes_id"),
            inverseJoinColumns = @JoinColumn(name = "filmes_id")
    )
    @JsonIgnoreProperties("filmes")
    private Set<Filme> filmes;
}
