package ada.tech.tenthirty.tvpackages.utils;

import ada.tech.tenthirty.tvpackages.model.Promocao;
import ada.tech.tenthirty.tvpackages.payloads.PromocaoRequest;
import ada.tech.tenthirty.tvpackages.payloads.PromocaoResponse;

public class PromocaoConvert {

    public static Promocao toEntity(PromocaoRequest promocaoRequest){
        Promocao promocao = new Promocao();
        promocao.setValorPacote(promocaoRequest.getValorPacote());
        promocao.setDesconto(promocaoRequest.getDesconto());
        promocao.setValorPromocional(null);
        return promocao;
    }


    public static PromocaoResponse toResponse (Promocao promocao){
        PromocaoResponse promocaoResponse = new PromocaoResponse();
        promocaoResponse.setId(promocao.getId());
        promocaoResponse.setValorPacote(promocao.getValorPacote());
        promocaoResponse.setDesconto(promocao.getDesconto());
        promocao.setValorPromocional(promocao.getValorPromocional());
        return promocaoResponse;
    }
}
