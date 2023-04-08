package pe.com.abogados.web;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.com.abogados.Dao.UsuarioDAO;
import pe.com.abogados.domain.Abogado;
import pe.com.abogados.domain.PapeletaHabilidad;
import pe.com.abogados.domain.SolicitudPapeleta;
import pe.com.abogados.service.AbogadoService;
import pe.com.abogados.service.PapeletaHabilidadService;
import pe.com.abogados.service.SolicitudPapeletaService;



@Controller
public class ControladorAbogado {
    
    @Autowired
    private AbogadoService abogadoService;
    
    /*Solicitud de Abogado*/
    @Autowired
    private SolicitudPapeletaService solicitudService;
    
    /*Consulta de Papeleta*/
    @Autowired
    private PapeletaHabilidadService papeletaHabilidadService;
    
    
    
    
    
    @GetMapping("/")
    public String inicio()
    {
        return "index";
    }
    
    @GetMapping("/MantenerAbogado")
    public String listadoAbogado (Model model, @AuthenticationPrincipal User user)
    {
        var abogados = abogadoService.listarAbogados();
        
        model.addAttribute("abogados",abogados);
        return "MantenerAbogado";
    }
    
    
    @PostMapping("/registrarAbogado")
    public String registrarAbogado(@Valid Abogado abogado, Errors errores)
    {
        
             if(errores.hasErrors()){
                return "MantenerAbogado";
            }
            
            abogadoService.registrar_abogado(abogado);
            return "redirect:/MantenerAbogado";
            
    }
    
    
    @GetMapping("/editarAbogado/{nroCal}")
    public String editarAbogado(Abogado abogado, Model model)
    {
        abogado = abogadoService.buscarAbogado(abogado);
        model.addAttribute("abogado", abogado);
        return "AbogadoModi";
    }
    
    @PostMapping("/guardarAbogado")
    public String guardarAbogado (@Valid Abogado abogado, Errors errores){
            
            
            if(errores.hasErrors()){
                return "MantenerAbogado";
            }
            
            
            abogadoService.guardar(abogado);
            return "redirect:/MantenerAbogado";
            
        }
    
    @GetMapping("/eliminarAbogado/{nroCal}")
    public String eliminarAbogado(Abogado abogado)
    {
        
        abogadoService.eliminar(abogado);
        
        return "redirect:/MantenerAbogado";
        
    }
    
    
    /*SOLICITUD DE ABOGADO*/
    
    @GetMapping("/solicitud")
    public String solicitud()
    {
        return "regisSolicitud";
    }
    
    
    
    
    @PostMapping("/registrarSolicitud")
    public String registrarSolicitud(SolicitudPapeleta solicitudPapeleta)
    {
        
        solicitudService.registrarSolicitud(solicitudPapeleta);
        return "index";
    }
    
    
    
    /*Consulta de Solicitud*/
    
    @GetMapping("/consultarPah")
    public String consultarPapeletasHabilidad(Model model)
    {
        
        
        var papeletas = papeletaHabilidadService.consultarPapeletas();
        model.addAttribute("papeletas",papeletas);
        
        return "consultarPapeletas";
    }
    
    
    
}
