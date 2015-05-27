package com.tienda.models;

import com.tienda.models.Compra;
import com.tienda.models.Producto;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-27T12:18:40")
@StaticMetamodel(ProductoCompra.class)
public class ProductoCompra_ { 

    public static volatile SingularAttribute<ProductoCompra, BigDecimal> precioCompra;
    public static volatile SingularAttribute<ProductoCompra, Compra> idCompra;
    public static volatile SingularAttribute<ProductoCompra, Integer> idProducto;
    public static volatile SingularAttribute<ProductoCompra, Integer> cantidad;
    public static volatile SingularAttribute<ProductoCompra, Producto> producto;

}