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

//    public Promocao(Integer pacoteId, Integer desconto) {
//        this.pacoteId = pacoteId;
//        this.desconto = desconto;
//
//    }


}
