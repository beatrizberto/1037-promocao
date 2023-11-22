package ada.tech.tenthirty.tvpackages.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "promocao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Promocao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer desconto;

    private BigDecimal valorPacote;

    private BigDecimal valorPromocional;


    public Promocao(BigDecimal valorPacote, Integer desconto) {
        this.valorPacote = valorPacote;
        this.desconto = desconto;

    }


}
