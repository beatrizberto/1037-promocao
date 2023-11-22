package ada.tech.tenthirty.tvpackages.payloads;


import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
public class PromocaoRequest implements Serializable {
    public Integer desconto;
    public BigDecimal valorPacote;

    public PromocaoRequest(BigDecimal valorPacote, Integer desconto){
        this.desconto = desconto;
        this.valorPacote = valorPacote;
    }
}
