package br.com.etechoracio.pw2_etec_project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_DISCIPLINA")
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DICIPLINA")
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;

}
