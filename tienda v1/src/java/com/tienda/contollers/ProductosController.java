/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.contollers;

import com.tienda.DAO.ProductoDAO;
import com.tienda.models.Producto;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author jhonf
 */
@ManagedBean
@SessionScoped
public class ProductosController {

    /**
     * Creates a new instance of ProductosController
     */
    @EJB
    ProductoDAO dao=new ProductoDAO();
    private Producto select;
    
    
    public ProductosController() {
    }
    public Producto getSelected(){
    if(select == null){select=new Producto();}
    return select;
    }
    public String index(){
    return "*/prodcutos/index";
    }
    
    public List<Producto> listado(){
    
    return dao.findAll();
    }
    
    public String create(){
    select=new Producto();
    return "/producto/new";
    }
    
   /* public String agregar(){
    Date d= new Date();
    select.setUpdated(d);
    dao.create(select);
    }*/
}
