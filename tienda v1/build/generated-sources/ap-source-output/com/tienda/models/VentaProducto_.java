package com.tienda.models;

import com.tienda.models.Producto;
import com.tienda.models.Ventas;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-27T12:18:40")
@StaticMetamodel(VentaProducto.class)
public class VentaProducto_ { 

    public static volatile SingularAttribute<VentaProducto, BigDecimal> valor;
    public static volatile SingularAttribute<VentaProducto, Ventas> ventas;
    public static volatile SingularAttribute<VentaProducto, Integer> cantidad;
    public static volatile SingularAttribute<VentaProducto, Producto> idProducto;
    public static volatile SingularAttribute<VentaProducto, Integer> idVenta;

}