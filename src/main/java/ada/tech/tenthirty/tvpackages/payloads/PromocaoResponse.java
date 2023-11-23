package ada.tech.tenthirty.tvpackages.payloads;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PromocaoResponse {
    public Integer promocaoId;
    public Integer desconto;
    public Integer pacoteId;
    public BigDecimal valorPacote;
    public BigDecimal valorPromocional;

}
