package pe.com.abogados.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import pe.com.abogados.domain.Abogado;



@Repository
public interface AbogadoDAO extends JpaRepository<Abogado, String>{
        
    @Procedure("sp_Registrar_Abogado")
    void Registrar_Abogado(String Nombres, String Apellido_Paterno, String Apellido_Materno, String DNI, String correo, String Telefono, String Estado, String Sexo);
        
}
