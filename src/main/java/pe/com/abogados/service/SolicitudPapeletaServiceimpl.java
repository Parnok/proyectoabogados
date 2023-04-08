package pe.com.abogados.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.abogados.Dao.SolicitudPapeletaDAO;
import pe.com.abogados.domain.SolicitudPapeleta;

@Service
public class SolicitudPapeletaServiceimpl implements SolicitudPapeletaService{

    
    @Autowired
    private SolicitudPapeletaDAO solicitudPapeletaDAO;
    
    
    @Override
    public void registrarSolicitud(SolicitudPapeleta solicitudPapeleta) {
        
        solicitudPapeletaDAO.RegistrarSolicitud(solicitudPapeleta.getNroCal(),solicitudPapeleta.getAplicacion(),solicitudPapeleta.getEmpresaJuzgado(),solicitudPapeleta.getDescripcion());
        
        
        
    }
    
    
    
    
}
