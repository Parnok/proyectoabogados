package pe.com.abogados.domain;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PapeletaHabilidad implements Serializable {
    
    
  private static final long serialVersionUID = 1L;
    
    
  @Id
  private String nroCal;
  
  
  
  private String nroSolicitud;
  
  private Date fechaEmision;
  
  private String estado;
  
  private String observaciones;
  
  private String nroPapeleta;
  
  private String aplicacion;
  
  private String empresaJuzgado;
  
  private String estadopha;
  
  private String descripcion;
  
      
    
}
