package com.tienda.models;

import com.tienda.models.Compra;
import com.tienda.models.EmpresaProveedor;
import com.tienda.models.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-27T12:18:40")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, String> sApellido;
    public static volatile ListAttribute<Proveedor, Producto> productoList;
    public static volatile SingularAttribute<Proveedor, String> direccion;
    public static volatile SingularAttribute<Proveedor, String> sNombre;
    public static volatile SingularAttribute<Proveedor, String> celular;
    public static volatile SingularAttribute<Proveedor, String> pNombre;
    public static volatile SingularAttribute<Proveedor, String> pApellido;
    public static volatile SingularAttribute<Proveedor, EmpresaProveedor> idEmpresa;
    public static volatile SingularAttribute<Proveedor, Integer> id;
    public static volatile ListAttribute<Proveedor, Compra> compraList;
    public static volatile SingularAttribute<Proveedor, String> telefono;
    public static volatile SingularAttribute<Proveedor, String> email;

}