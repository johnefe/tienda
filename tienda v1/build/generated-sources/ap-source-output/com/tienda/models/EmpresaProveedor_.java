package com.tienda.models;

import com.tienda.models.Proveedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-27T12:18:40")
@StaticMetamodel(EmpresaProveedor.class)
public class EmpresaProveedor_ { 

    public static volatile ListAttribute<EmpresaProveedor, Proveedor> proveedorList;
    public static volatile SingularAttribute<EmpresaProveedor, String> direccion;
    public static volatile SingularAttribute<EmpresaProveedor, Integer> id;
    public static volatile SingularAttribute<EmpresaProveedor, String> telefono;
    public static volatile SingularAttribute<EmpresaProveedor, String> nombre;
    public static volatile SingularAttribute<EmpresaProveedor, String> email;

}