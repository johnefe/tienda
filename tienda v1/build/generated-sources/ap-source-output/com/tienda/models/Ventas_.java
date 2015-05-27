package com.tienda.models;

import com.tienda.models.Cliente;
import com.tienda.models.VentaProducto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-27T12:18:40")
@StaticMetamodel(Ventas.class)
public class Ventas_ { 

    public static volatile SingularAttribute<Ventas, Date> fecha;
    public static volatile SingularAttribute<Ventas, Cliente> idCliente;
    public static volatile SingularAttribute<Ventas, VentaProducto> ventaProducto;
    public static volatile SingularAttribute<Ventas, Integer> id;

}