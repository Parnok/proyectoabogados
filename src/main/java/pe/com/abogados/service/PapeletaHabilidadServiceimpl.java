package pe.com.abogados.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.abogados.Dao.PapeletaHabilidadDAO;
import pe.com.abogados.domain.PapeletaHabilidad;

@Service
public class PapeletaHabilidadServiceimpl implements PapeletaHabilidadService{

    @Autowired
    private PapeletaHabilidadDAO papeletaHabilidadDAO;
    
    
    @Override
    @Transactional(readOnly = true)
    public List<PapeletaHabilidad> consultarPapeletas() {
        
        return papeletaHabilidadDAO.consultarPapeletas();
        
        
    }
    
    
    
}
