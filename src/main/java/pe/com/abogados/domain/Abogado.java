
package pe.com.abogados.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table (name = "Abogado")
public class Abogado implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    private String nroCal;
    
    private String nombres;
    
    private String apellidoPaterno;
    
    private String apellidoMaterno;
    
    private String dni;
    
    private String correo;
    
    private String telefono;
    
    private String estado;
    
    private String sexo;
       
}
