package ada.tech.tenthirty.tvpackages.service;

import ada.tech.tenthirty.tvpackages.model.Promocao;
import ada.tech.tenthirty.tvpackages.payloads.PromocaoRequest;
import ada.tech.tenthirty.tvpackages.payloads.PromocaoResponse;
import ada.tech.tenthirty.tvpackages.repository.PromocaoRepository;
import ada.tech.tenthirty.tvpackages.utils.PromocaoConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.List;

@Service
public class PromocaoService {

    @Autowired
    PromocaoRepository repository;

    public PromocaoResponse savePromocao(PromocaoRequest promocaoRequest) {
        Promocao promocaoEntity = repository.save(PromocaoConvert.toEntity(promocaoRequest));
        return PromocaoConvert.toResponse(promocaoEntity);
    }

    public List<PromocaoResponse> getPromocoes() {
        List<Promocao> promocoes = repository.findAll();
        return PromocaoConvert.toResponseList(promocoes);

    }

    public PromocaoResponse getPromocaoByPacoteId(Integer pacoteId){
        return PromocaoConvert.toResponse(repository.findByPacoteId(pacoteId).get());

    }


}
