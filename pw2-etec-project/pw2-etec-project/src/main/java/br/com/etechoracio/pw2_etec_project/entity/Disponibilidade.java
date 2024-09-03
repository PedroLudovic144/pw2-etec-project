package br.com.etechoracio.pw2_etec_project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TBL_DISPONIBILIDADE")
public class Disponibilidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DISPONIBILIDADE")
    private Long id;

    @Column (name = "TX_DIA_SEMANA")
    private String dia_Semana;

    @Column(name = "DT_DAS")
    private Date das;

    @Column(name = "DT_ATE")
    private Date ate;

    @Column(name = "hy")
    private Date hy;

    @ManyToMany
    @JoinTable(name = "TBL_DISCIPLINA",
            joinColumns = @JoinColumn(name = "ID_DISCIPLINA"),
            inverseJoinColumns = @JoinColumn(name = "ID_DISPONIBILIDADE")
    )
    private List<Disponibilidade> disponibilidades;


}
