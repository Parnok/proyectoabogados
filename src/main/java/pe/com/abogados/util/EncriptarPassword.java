package pe.com.abogados.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
public class EncriptarPassword {
    
    public static void main(String[] args) {
        
        
       
        
        var password="12345"; 
        
        
        System.out.println("pasaword"+password);
        System.out.println("pasaword encriptado "+ encriptarPassword(password));
        
    }
    
    
    public static String encriptarPassword(String password){
        
        
        
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        
        
        
        return encoder.encode(password);
        
        
    }
    
    
    
}
