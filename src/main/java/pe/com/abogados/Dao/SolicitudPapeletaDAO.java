package pe.com.abogados.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import pe.com.abogados.domain.SolicitudPapeleta;

@Repository
public interface SolicitudPapeletaDAO extends JpaRepository<SolicitudPapeleta,String> {
    
    @Procedure("sp_Registrar_Sol")
    void RegistrarSolicitud (String Nro_Cal, String Aplicacion, String Empresa_Juzgado, String Descripcion);
    
    
}
