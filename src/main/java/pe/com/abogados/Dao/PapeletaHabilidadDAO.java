package pe.com.abogados.Dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import pe.com.abogados.domain.PapeletaHabilidad;


@Repository
public interface PapeletaHabilidadDAO extends JpaRepository<PapeletaHabilidad,String>{
    
    
    @Query(value = "{call sp_Listar_Papeletas()}", nativeQuery = true)
    List<PapeletaHabilidad> consultarPapeletas();
    
    
    @Procedure("sp_Detalle_Papeleta")
    PapeletaHabilidad detallePapeleta(String Nro_Solicitud);
    
    
    
}
