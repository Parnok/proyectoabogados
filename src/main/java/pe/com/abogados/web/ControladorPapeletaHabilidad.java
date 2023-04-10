package pe.com.abogados.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pe.com.abogados.domain.PapeletaHabilidad;
import pe.com.abogados.domain.SolicitudPapeleta;
import pe.com.abogados.service.PapeletaHabilidadService;
import pe.com.abogados.service.SolicitudPapeletaService;

@Controller
public class ControladorPapeletaHabilidad {
    
    
    /*Solicitud de Abogado*/
    @Autowired
    private SolicitudPapeletaService solicitudService;
    
    /*Consulta de Papeleta*/
    @Autowired
    private PapeletaHabilidadService papeletaHabilidadService;
    
    
    
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
    
    
    /*Detalle Papeleta de Habilidad*/
    
    @GetMapping("/detallePah/{nroSolicitud}")
    public String detallePapeletaHabilidad(PapeletaHabilidad papeletaHabilidad,Model model)
    {
        papeletaHabilidad = papeletaHabilidadService.detallePapeletaHabilidad(papeletaHabilidad);
        
        model.addAttribute("papeletaHabilidad",papeletaHabilidad);
        
        return "detallePapeletaHabilidad";
       
    }
    
    
    
    
}
