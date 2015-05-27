package com.tienda.models;

import com.tienda.models.Ventas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-27T12:18:40")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> sApellido;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile SingularAttribute<Cliente, String> sNombre;
    public static volatile SingularAttribute<Cliente, String> celular;
    public static volatile ListAttribute<Cliente, Ventas> ventasList;
    public static volatile SingularAttribute<Cliente, String> pNombre;
    public static volatile SingularAttribute<Cliente, String> pApellido;
    public static volatile SingularAttribute<Cliente, Integer> id;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile SingularAttribute<Cliente, String> email;

}