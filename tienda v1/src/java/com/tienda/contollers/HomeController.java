package com.tienda.contollers;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author jhonf
 */
@ManagedBean
@SessionScoped
public class HomeController {

    /**
     * Creates a new instance of HomeController
     */
    public HomeController() {
    }
    public  String index(){
    return  "/index";
    }
    public String acerca(){
    
    return "/acerca";
    }
    
    public String Footer(){
    String nombre= null;
    String tipo=null;
    String usuario=null;
    
    if(nombre!=null && tipo!=null){
    usuario= nombre+"("+tipo+")";
    }
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date d= new Date();
        String fechastr= sdf.format(d);
        return usuario +"-" + fechastr+"desarrollado por jhonefe";
    }
    
    public String ventas(){
    return "/acerca";
    } 
}
