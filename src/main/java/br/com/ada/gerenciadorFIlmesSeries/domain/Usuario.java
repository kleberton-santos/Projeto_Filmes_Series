package br.com.ada.gerenciadorFIlmesSeries.domain;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    @CPF
    private String cpf;

    @OneToOne(cascade = CascadeType.PERSIST)
    Endereco endereco;



}
