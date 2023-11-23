package ada.tech.tenthirty.tvpackages.utils;

import ada.tech.tenthirty.tvpackages.model.Promocao;
import ada.tech.tenthirty.tvpackages.payloads.PromocaoRequest;
import ada.tech.tenthirty.tvpackages.payloads.PromocaoResponse;

import java.util.ArrayList;
import java.util.List;

public class PromocaoConvert {

    public static Promocao toEntity(PromocaoRequest promocaoRequest) {
        Promocao promocao = new Promocao();
        promocao.setValorPacote(promocaoRequest.getValorPacote());
        promocao.setPacoteId(promocaoRequest.getPacoteId());
        promocao.setDesconto(promocaoRequest.getDesconto());
        promocao.setValorPromocional(null);
        return promocao;
    }


    public static PromocaoResponse toResponse(Promocao promocao) {
        PromocaoResponse promocaoResponse = new PromocaoResponse();
        promocaoResponse.setPromocaoId(promocao.getPromocaoId());
        promocaoResponse.setPacoteId(promocao.getPacoteId());
        promocaoResponse.setValorPacote(promocao.getValorPacote());
        promocaoResponse.setDesconto(promocao.getDesconto());
        promocao.setValorPromocional(promocao.getValorPromocional());
        return promocaoResponse;
    }

    public static List<PromocaoResponse> toResponseList(List<Promocao> promocoes) {


        List<PromocaoResponse> promocaoResponses = new ArrayList<>();
        for (Promocao promocao : promocoes) {
            PromocaoResponse promocaoResponse = PromocaoConvert.toResponse(promocao);
            promocaoResponses.add(promocaoResponse);
        }
        return promocaoResponses;
    }


}
