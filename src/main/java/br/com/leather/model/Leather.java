package br.com.leather.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Leather {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double altura;
    private Double largura;
    private Double espessura;
    private String qualidade;
}
