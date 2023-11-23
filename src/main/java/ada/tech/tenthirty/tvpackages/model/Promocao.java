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
    private Integer promocaoId;

    private Integer pacoteId;

    private Integer desconto;

    private BigDecimal valorPacote;

    private BigDecimal valorPromocional;


    public Promocao(Integer pacoteId, BigDecimal valorPacote, Integer desconto) {
        this.pacoteId = pacoteId;
        this.valorPacote = valorPacote;
        this.desconto = desconto;

    }


}
