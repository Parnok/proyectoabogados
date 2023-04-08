package pe.com.abogados.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.abogados.Dao.AbogadoDAO;
import pe.com.abogados.domain.Abogado;




@Service
public class AbogadoServiceimpl implements AbogadoService{

    
    @Autowired
    private AbogadoDAO abogadodao;
    


    @Override
    @Transactional(readOnly = true)
    public List<Abogado> listarAbogados() {
        return abogadodao.findAll();
    }


    @Override
    @Transactional
    public void registrar_abogado(Abogado abogado) {
        abogadodao.Registrar_Abogado(abogado.getNombres(), abogado.getApellidoPaterno(), abogado.getApellidoMaterno(), abogado.getDni(), abogado.getCorreo(), abogado.getTelefono(), abogado.getEstado(), abogado.getSexo());
    }

    
    @Override
    @Transactional
    public void guardar(Abogado abogado) {
        abogadodao.save(abogado);
    }

    @Override
    @Transactional
    public void eliminar(Abogado abogado) {
        abogadodao.delete(abogado);
    }

    @Override
    @Transactional(readOnly = true)
    public Abogado buscarAbogado(Abogado abogado) {
        return abogadodao.findById(abogado.getNroCal()).orElse(null);
    }

    
    
    
    
}
