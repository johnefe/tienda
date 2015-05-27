/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.models;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jhonf
 */
@Entity
@Table(name = "producto_compra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductoCompra.findAll", query = "SELECT p FROM ProductoCompra p"),
    @NamedQuery(name = "ProductoCompra.findByIdProducto", query = "SELECT p FROM ProductoCompra p WHERE p.idProducto = :idProducto"),
    @NamedQuery(name = "ProductoCompra.findByCantidad", query = "SELECT p FROM ProductoCompra p WHERE p.cantidad = :cantidad"),
    @NamedQuery(name = "ProductoCompra.findByPrecioCompra", query = "SELECT p FROM ProductoCompra p WHERE p.precioCompra = :precioCompra")})
public class ProductoCompra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_producto")
    private Integer idProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio_compra")
    private BigDecimal precioCompra;
    @JoinColumn(name = "id_producto", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Producto producto;
    @JoinColumn(name = "id_compra", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Compra idCompra;

    public ProductoCompra() {
    }

    public ProductoCompra(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public ProductoCompra(Integer idProducto, int cantidad, BigDecimal precioCompra) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(BigDecimal precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Compra getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Compra idCompra) {
        this.idCompra = idCompra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoCompra)) {
            return false;
        }
        ProductoCompra other = (ProductoCompra) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tienda.models.ProductoCompra[ idProducto=" + idProducto + " ]";
    }
    
}
