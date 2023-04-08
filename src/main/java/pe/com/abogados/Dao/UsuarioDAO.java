
package pe.com.abogados.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.abogados.domain.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Long>{
    
     Usuario findByUsername (String username);
    
}
