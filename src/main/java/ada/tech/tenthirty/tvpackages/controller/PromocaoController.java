package ada.tech.tenthirty.tvpackages.controller;

import ada.tech.tenthirty.tvpackages.payloads.PromocaoRequest;
import ada.tech.tenthirty.tvpackages.payloads.PromocaoResponse;
import ada.tech.tenthirty.tvpackages.service.PromocaoService;
import ada.tech.tenthirty.tvpackages.service.RabbitMQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="promocao")
public class PromocaoController {

    @Autowired
    private RabbitMQService rabbitMQService;

    @Autowired
    PromocaoService promocaoService;

    @PostMapping
    private ResponseEntity<PromocaoResponse> criarPromocao(@RequestBody PromocaoRequest promocaoRequest) {
       PromocaoResponse promocao = promocaoService.savePromocao(promocaoRequest);
       return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    private List<PromocaoResponse> listarPromocoes(){
        return promocaoService.getPromocoes();
    }

    @GetMapping("/{pacoteId}")
    public ResponseEntity<PromocaoResponse> getPromocaoByPacoteId(@PathVariable Integer pacoteId){

        return ResponseEntity.ok(promocaoService.getPromocaoByPacoteId(pacoteId));

    }

}