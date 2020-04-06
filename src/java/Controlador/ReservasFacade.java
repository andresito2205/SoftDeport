/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Reservas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Mauro
 */
@Stateless
public class ReservasFacade extends AbstractFacade<Reservas> {

    @PersistenceContext(unitName = "SoftDeportV1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReservasFacade() {
        super(Reservas.class);
    }
    
}
