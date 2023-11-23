package ada.tech.tenthirty.tvpackages.payloads;


import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
public class PromocaoRequest implements Serializable {
    public Integer pacoteId;
    public Integer desconto;
    public BigDecimal valorPacote;

    public PromocaoRequest(Integer pacoteId, BigDecimal valorPacote, Integer desconto){
        this.pacoteId = pacoteId;
        this.desconto = desconto;
        this.valorPacote = valorPacote;
    }
}
