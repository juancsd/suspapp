package com.security.app.seguranca.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_incidente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Incidente {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_INCIDENTE"
    )
    @SequenceGenerator(
            name = "SEQ_INCIDENTE",
            sequenceName = "SEQ_INCIDENTE",
            allocationSize = 1
    )
    @Column(name = "incidente_id")
    private Long incidenteId;

    private String cep;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String observacao;

    @Column(name = "tp_incidente")
    private String tpIncidente;

}
