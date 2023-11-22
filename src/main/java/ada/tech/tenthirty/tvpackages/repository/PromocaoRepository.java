package ada.tech.tenthirty.tvpackages.repository;

import ada.tech.tenthirty.tvpackages.model.Promocao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromocaoRepository extends JpaRepository <Promocao, Integer>{
   
}
