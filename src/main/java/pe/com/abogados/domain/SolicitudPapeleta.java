package pe.com.abogados.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class SolicitudPapeleta implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    private String nroCal;
    
    
    
    
    private String aplicacion;
    
    private String empresaJuzgado;
    
    private String descripcion;
    
    
}
