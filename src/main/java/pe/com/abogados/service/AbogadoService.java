package pe.com.abogados.service;

import java.util.List;
import pe.com.abogados.domain.Abogado;


public interface AbogadoService {
    
    
    
    public void registrar_abogado(Abogado abogado);
    
    
    
    public List <Abogado> listarAbogados();
    
    public void guardar(Abogado abogado);
    
    public void eliminar(Abogado abogado);
    
    public Abogado buscarAbogado(Abogado abogado);
    
}
