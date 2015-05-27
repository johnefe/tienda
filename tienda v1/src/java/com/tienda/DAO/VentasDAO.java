/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.DAO;

import com.tienda.models.Ventas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jhonf
 */
@Stateless
public class VentasDAO extends AbstractFacade<Ventas> {
    @PersistenceContext(unitName = "tienda_v1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VentasDAO() {
        super(Ventas.class);
    }
    
}
