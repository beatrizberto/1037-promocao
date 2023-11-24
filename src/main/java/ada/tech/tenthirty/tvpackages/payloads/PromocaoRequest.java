package ada.tech.tenthirty.tvpackages.payloads;


import lombok.Getter;

import java.io.Serializable;


@Getter
public class PromocaoRequest implements Serializable {
    public Integer pacoteId;
    public Integer desconto;

    public PromocaoRequest(Integer pacoteId, Integer desconto) {
        this.pacoteId = pacoteId;
        this.desconto = desconto;

    }
}
