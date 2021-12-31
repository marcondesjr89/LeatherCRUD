package br.com.leather.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Leather {

    private Long id;
    private Double altura;
    private Double largura;
    private Double espessura;
    private String qualidade;
}
